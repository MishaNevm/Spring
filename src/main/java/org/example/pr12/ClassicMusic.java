package org.example.pr12;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicMusic {
    public String getSong() {
        return "classic1";
    }
    @PostConstruct
    public void initMethod () {
        System.out.println("Classic music playlist created");
    }
    @PreDestroy
    public void destroyMethod () {
        System.out.println("Classic music playlist destroyed");
    }
}
