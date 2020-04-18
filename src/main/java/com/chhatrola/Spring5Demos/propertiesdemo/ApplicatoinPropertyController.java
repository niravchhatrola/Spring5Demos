package com.chhatrola.Spring5Demos.propertiesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

/**
 * Created by niv214 on 18/4/20.
 */
@Controller
public class ApplicatoinPropertyController {

    @Autowired
    ApplicationPropertiesDemo applicationPropertiesDemo;

    @Autowired
    Environment environment;  // to access env veriable

    public void test(){
        System.out.println(applicationPropertiesDemo.getUserName());
        System.out.println(applicationPropertiesDemo.getPassword());

        System.out.println(environment.getProperty("java_home"));
    }
}
