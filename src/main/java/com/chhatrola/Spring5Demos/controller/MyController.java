package com.chhatrola.Spring5Demos.controller;

import com.chhatrola.Spring5Demos.basic.BasicController;
import com.chhatrola.Spring5Demos.profiles.BaseController;
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
    BaseController baseController;

    public String greetings(){

        basicController.test();
        baseController.test();


        return "Doneeeeeeeee";
    }
}
