package com.chhatrola.Spring5Demos.propertiesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by niv214 on 18/4/20.
 */
@Component
@PropertySource("classpath:extapplication.properties")
public class ExtApplicationPropertiesDemo {

    @Value("${extfakedb.username}")
    private String userName;

    @Value("${extfakedb.password}")
    private String password;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
