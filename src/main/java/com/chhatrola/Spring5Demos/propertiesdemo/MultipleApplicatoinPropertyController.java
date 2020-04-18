package com.chhatrola.Spring5Demos.propertiesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by niv214 on 18/4/20.
 */
@Controller
public class MultipleApplicatoinPropertyController {

    @Autowired
    ExtApplicationPropertiesDemo extApplicationPropertiesDemo;

    @Autowired
    MultipleApplicationPropertiesDemo multipleApplicationPropertiesDemo;

    public void test(){
        System.out.println(extApplicationPropertiesDemo.getUserName());
        System.out.println(extApplicationPropertiesDemo.getPassword());
        System.out.println(multipleApplicationPropertiesDemo.getUserName2());
        System.out.println(multipleApplicationPropertiesDemo.getPassword2());
    }
}
