package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParallelTest {

    @BeforeEach
    void simulateWebDriver() throws InterruptedException {
        System.out.println("Parallel: " + Thread.currentThread().getName() );
        Thread.sleep(1000);
    }

    @Test
    void test1(){

    }
    @Test
    void test2(){

    }
    @Test
    void test3(){

    }
    @Test
    void test4(){

    }
    @Test
    void test5(){

    }

}
