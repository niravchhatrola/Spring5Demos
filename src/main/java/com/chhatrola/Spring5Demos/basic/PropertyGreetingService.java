package com.chhatrola.Spring5Demos.basic;

import org.springframework.stereotype.Service;

/**
 * Created by niv214 on 15/4/20.
 */
@Service
public class PropertyGreetingService implements GreetingService {

    @Override
    public String greet(){
        return "Hello from PropertyGreetingService";
    }


}
