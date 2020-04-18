package com.chhatrola.Spring5Demos.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by niv214 on 18/4/20.
 */
@Component
public class LifeCycleDemo implements InitializingBean, DisposableBean,
ApplicationContextAware {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean --> afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean --> destroy");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware --> setApplicationContext");
    }
}
