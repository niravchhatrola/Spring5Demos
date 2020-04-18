package com.chhatrola.Spring5Demos.propertiesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by niv214 on 18/4/20.
 */
@Controller
public class BasePropertyController {

    @Autowired
    ApplicatoinPropertyController applicatoinPropertyController;

    @Autowired
    ExtApplicatoinPropertyController extApplicatoinPropertyController;

    @Autowired
    MultipleApplicatoinPropertyController multipleApplicatoinPropertyController;

    @Autowired
    ProfileBasePropertyController profileBasePropertyController;

    public void test(){
        applicatoinPropertyController.test();
        extApplicatoinPropertyController.test();
        multipleApplicatoinPropertyController.test();
        profileBasePropertyController.test();
    }
}
