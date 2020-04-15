package com.chhatrola.Spring5Demos.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by niv214 on 15/4/20.
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String greet(){
        return "Hello from PrimaryGreetingService";
    }
}
