package com.chhatrola.Spring5Demos.propertiesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by niv214 on 18/4/20.
 */
@Component
public class ProfileBasePropertiesDemo {

    @Value("${greet}")
    private String greet;

    public String getGreet() {
        return greet;
    }

    public void setGreet(String greet) {
        this.greet = greet;
    }
}
