package com.chhatrola.Spring5Demos.propertiesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by niv214 on 18/4/20.
 */
@Component
@PropertySource({"classpath:extapplication.properties", "classpath:ext2application.properties"})
public class MultipleApplicationPropertiesDemo {

    @Value("${extfakedb.username}")
    private String userName;

    @Value("${extfakedb.password}")
    private String password;

    @Value("${ext2fakedb.username}")
    private String userName2;

    @Value("${ext2fakedb.password}")
    private String password2;

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

    public String getUserName2() {
        return userName2;
    }

    public void setUserName2(String userName2) {
        this.userName2 = userName2;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }
}
