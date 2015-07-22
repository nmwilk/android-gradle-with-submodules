package com.measuredsoftware.mymodule;

import org.junit.Assert;
import org.junit.Test;

public class MyClassTest
{
    @Test
    public void setupOk() {
        final MyClass myClass = new MyClass(1);
        Assert.assertEquals(1, myClass.getI());
    }

}
