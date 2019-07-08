package com.hotmail.bess410.tacocloud.samples;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Sample {
    @Transactional
    public void method1() {
        System.out.println("method1");
        method2();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void method2() {
        System.out.println("method2");
    }
}