package com.maxhayday.cw.cw03.design_patterns_by_evgeniy;


import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class DistributionService {
    private Map<Integer, MailGenerator> map = new HashMap<>();

    @SneakyThrows
    public DistributionService() {
        Reflections scanner = new Reflections("com.maxhayday.cw.cw03.design_patterns_by_evgeniy");
        Set<Class<? extends MailGenerator>> set = scanner.getSubTypesOf(MailGenerator.class);
        map = set.stream()
                .filter(aClass -> !Modifier.isAbstract(aClass.getModifiers()))
                .filter(aClass -> aClass.isAnnotationPresent(TemplateCode.class))
                .collect(toMap(aClass -> aClass.getAnnotation(TemplateCode.class).value(), DistributionService::getInstance));

//        for (Class<? extends MailGenerator> aClass : set) {
//            if (!Modifier.isAbstract(aClass.getModifiers())) {
//                TemplateCode annotation = aClass.getAnnotation(TemplateCode.class);
//                int mailCode = annotation.value();
//                MailGenerator mailGenerator = aClass.getDeclaredConstructor().newInstance();
//                if (map.containsKey(mailCode)) {
//                    throw new IllegalStateException(mailCode + " already in use");
//                }
//                map.put(mailCode, mailGenerator);
//            }
//        }
    }

    @SneakyThrows
    public static MailGenerator getInstance(Class<? extends MailGenerator> aClass) {
        return aClass.getDeclaredConstructor().newInstance();
    }

    public void sendMail() {
        int mailCode = DBUtils.getMailCode();
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(mailCode + " not supported yet");
        }
        String html = mailGenerator.generateMail();
        send(html);
        //Codes.getByCode(DBUtils.getMailCode()).getHandler().getCode();
    }

    private void send(String html) {
        System.out.println("html was sent: " + html);
    }
}
