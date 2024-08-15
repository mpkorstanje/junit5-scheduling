package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Isolated;

@Isolated
class SerialBTest {

    @BeforeEach
    void simulateWebDriver() throws InterruptedException {
        System.out.println("Serial B: " + Thread.currentThread().getName() );
        Thread.sleep(1000);
    }

    @Test
    void test1(){

    }
    @Test
    void test2(){

    }

}
