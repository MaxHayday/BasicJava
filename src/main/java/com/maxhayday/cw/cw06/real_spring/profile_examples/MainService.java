package com.maxhayday.cw.cw06.real_spring.profile_examples;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {
    private final Repo repo;

//    @Scheduled(fixedDelay = 1000)
    public void work() {
        repo.crud();
    }
}
