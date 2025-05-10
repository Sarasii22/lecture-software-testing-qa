package org.example;

//how j unit works

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SampleTest {
    @BeforeEach
    public void beforeEach(){
        System.out.println("before each test");
    }

    @Test
    public void one(){
        System.out.println("1111");

       
    }

    @Test
    public void two(){
        System.out.println("2222");
    }
}
