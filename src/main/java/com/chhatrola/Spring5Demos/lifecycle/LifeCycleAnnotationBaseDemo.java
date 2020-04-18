package com.chhatrola.Spring5Demos.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by niv214 on 18/4/20.
 */
@Component
public class LifeCycleAnnotationBaseDemo {

    LifeCycleAnnotationBaseDemo(){
        System.out.println("LifeCycleAnnotationBaseDemo --> Constructor");
    }

    @PostConstruct
    public void start(){
        System.out.println("@PostConstruct");
    }

    @PreDestroy
    public void end(){
        System.out.println("@PreDestroy");
    }
}
