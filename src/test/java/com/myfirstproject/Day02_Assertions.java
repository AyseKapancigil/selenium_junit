package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;

public class Day02_Assertions {

    @Test
    public void assertions(){

        Assert.assertEquals(5,5);
       // Assert.assertTrue("apple".equals("Apple"));

        Assert.assertFalse("Apple".equals("apple"));
        Assert.assertTrue("apple".equals("apple"));

    }
}
