package com.chhatrola.Spring5Demos.propertiesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by niv214 on 18/4/20.
 */
@Controller
public class ExtApplicatoinPropertyController {

    @Autowired
    ExtApplicationPropertiesDemo extApplicationPropertiesDemo;

    public void test(){
        System.out.println(extApplicationPropertiesDemo.getUserName());
        System.out.println(extApplicationPropertiesDemo.getPassword());
    }
}
