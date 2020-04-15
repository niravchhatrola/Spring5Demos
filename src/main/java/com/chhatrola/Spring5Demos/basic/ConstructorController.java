package com.chhatrola.Spring5Demos.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by niv214 on 15/4/20.
 */
@Controller
public class ConstructorController {


    GreetingService greetingService;


    ConstructorController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public void test(){

        System.out.println(greetingService.greet());

    }

}
