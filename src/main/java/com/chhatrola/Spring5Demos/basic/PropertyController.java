package com.chhatrola.Spring5Demos.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by niv214 on 15/4/20.
 */
@Controller
public class PropertyController {


    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public void test(){
        System.out.println(greetingService.greet());
    }


}
