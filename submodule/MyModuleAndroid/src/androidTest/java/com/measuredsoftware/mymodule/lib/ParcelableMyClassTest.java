package com.measuredsoftware.mymodule.lib;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * To prove dependency on {@link com.example.MyClass}.
 */
public class ParcelableMyClassTest extends TestCase
{
    public void testSetupOk() {
        final ParcelableMyClass myClass = new ParcelableMyClass(1);
        Assert.assertEquals(1, myClass.getI());
    }
}
