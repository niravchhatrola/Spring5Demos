package com.chhatrola.Spring5Demos.controller;

import com.chhatrola.Spring5Demos.basic.BasicController;
import com.chhatrola.Spring5Demos.lifecycle.LifeCycleBaseController;
import com.chhatrola.Spring5Demos.profiles.ProfileBaseController;
import com.chhatrola.Spring5Demos.propertiesdemo.BasePropertyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by niv214 on 14/4/20.
 */
@Controller
public class MyController {

    @Autowired
    BasicController basicController;

    @Autowired
    ProfileBaseController profileBaseController;

    @Autowired
    BasePropertyController basePropertyController;

    @Autowired
    LifeCycleBaseController lifeCycleBaseController;

    public String greetings(){

        basicController.test();
        profileBaseController.test();
        basePropertyController.test();
        lifeCycleBaseController.test();


        return "Doneeeeeeeee";
    }
}
