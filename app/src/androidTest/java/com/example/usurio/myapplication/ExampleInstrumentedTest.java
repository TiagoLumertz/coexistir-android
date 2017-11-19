package com.example.usurio.myapplication;

import android.app.Instrumentation;
import android.content.Context;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {

        Instrumentation InstrumentationRegistry = null;
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.usurio.myapplication", appContext.getPackageName());
    }
}
