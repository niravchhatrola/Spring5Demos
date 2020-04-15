package com.chhatrola.Spring5Demos.profiles;

import com.chhatrola.Spring5Demos.basic.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by niv214 on 15/4/20.
 */
@Controller
public class ProfileController {


    @Qualifier("i18nGreeting")
    @Autowired
    GreetingService greetingService;

    public void test(){

        System.out.println(greetingService.greet());

    }

}
