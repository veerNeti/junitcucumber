package com.hooks;

import org.junit.After;
import org.junit.Before;

public class ExecutionConfig {
    @Before
    void setup(){
        System.out.println("I Start HERE" );
    }

    @After
    void quit(){
        System.out.println("I Start Quit" );
    }

}
