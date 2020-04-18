package com.chhatrola.Spring5Demos.lifecycle;

import com.chhatrola.Spring5Demos.basic.GreetingService;
import com.chhatrola.Spring5Demos.basic.PrimaryController;
import com.chhatrola.Spring5Demos.basic.PropertyController;
import com.chhatrola.Spring5Demos.basic.SetterController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by niv214 on 15/4/20.
 */
@Controller
public class LifeCycleBaseController {

    @Autowired
    LifeCycleDemo lifeCycleDemo;

    @Autowired
    LifeCycleAnnotationBaseDemo lifeCycleAnnotationBaseDemo;

    public void test(){
        System.out.println("lifeCycleDemo");
    }

}
