package com.maxhayday.cw.cw06.real_spring.how_to_refresh_prototype_in_singleton;

import com.maxhayday.cw.cw04.heroes.RandomUtils;
import lombok.SneakyThrows;
import org.springframework.context.annotation.*;

import java.awt.*;

@Configuration
@ComponentScan
//@ImportResource("classpath:color_context.xml")
public class MainConf {

    @Bean
    @Scope(value = "twoSeconds",proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color color() {
        return new Color(RandomUtils.getRandomNumberUsingInts(0, 255), RandomUtils.getRandomNumberUsingInts(0, 255), RandomUtils.getRandomNumberUsingInts(0, 255));
    }


    @SneakyThrows
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);
        while (true) {
            context.getBean(ColorFrame.class).moveToRandomLocation();
            Thread.sleep(80);
        }
    }
}
