package com.maxhayday.cw.cw06.real_spring.profile_examples;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile(ProfilesConst.PROD)
public class RepoImpl implements Repo {
    @Override
    public void crud() {
        System.out.println("saved to prod");
    }
}
