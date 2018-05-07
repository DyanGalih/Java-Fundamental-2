package com.dyangalih.user;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class UserTest {
    private User user;

    @Before
    public void instantUser(){
        user = new User();
    }

    @Test
    public void testName(){
        String name = "Dyan Galih";
        user.setName(name);
        assertEquals(name, user.getName());
    }
}
