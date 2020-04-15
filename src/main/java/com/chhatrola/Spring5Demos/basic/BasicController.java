package com.chhatrola.Spring5Demos.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

/**
 * Created by niv214 on 15/4/20.
 */
@Controller
public class BasicController {

    @Autowired
    PropertyController propertyController;

    @Autowired
    SetterController setterController;

    @Autowired
    ConstructorController constructorController;

    @Autowired
    PrimaryController primaryController;

    public void test(){

        propertyController.test();
        setterController.test();
        constructorController.test();
        primaryController.test();

    }

}
