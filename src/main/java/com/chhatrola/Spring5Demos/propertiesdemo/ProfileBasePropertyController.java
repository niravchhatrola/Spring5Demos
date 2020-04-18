package com.chhatrola.Spring5Demos.propertiesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

/**
 * Created by niv214 on 18/4/20.
 */
@Controller
public class ProfileBasePropertyController {

    @Autowired
    ProfileBasePropertiesDemo profileBasePropertiesDemo;
    public void test(){
        System.out.println(profileBasePropertiesDemo.getGreet());

    }
}
