package com.chhatrola.Spring5Demos.profiles;

import com.chhatrola.Spring5Demos.basic.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by niv214 on 15/4/20.
 */
@Profile("HN")
@Service("i18nGreeting")
public class HindiGreetingService implements GreetingService {
    @Override
    public String greet(){
        return "Namastey....";
    }
}
