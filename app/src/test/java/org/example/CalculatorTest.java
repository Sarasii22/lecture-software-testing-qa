package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

   
    @Test
    public void addTest(){
        var calculator = new Calculator();
        var result = calculator.add(5, 8);
        System.out.println(result);
        assertEquals(13, result);
        
    }

    @Test
    public void subTest(){
        var calculator = new Calculator();
        var result1 = calculator.sub(5,3);
        assertEquals(2, result1);

        var result2 = calculator.sub(5, 10);
        assertEquals(-5, result2);
    }

    @Test
    public void isUserAvailableTest(){
        var user = new User();

    /*   mock(db.findUser, null);

        mock(db2.findUser, {
            name: 'test';
            age: 23;
        });
        
    */

        var existingUser = user.findUser(1);
        assertNotNull(existingUser);

        var existingUser2 = user.findUser(1000);
        assertEquals(existingUser2, null);
    }
}
