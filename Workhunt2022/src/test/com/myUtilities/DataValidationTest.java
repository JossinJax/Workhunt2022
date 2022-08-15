package com.myUtilities;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class DataValidationTest {



    @Test
    public void testIsValidDateFormat() {

        assertEquals("Should return true", true, DataValidation.isValidDateFormat("07/25/2022"));
    }

    @Test(expected = IOException.class)
    public void testGetDate() throws IOException {
        //DataValidation myTest1 = new DataValidation();
        assertEquals("Should return the same date that was passed in","07/25/2022", DataValidation.getDate("07/25/2022"));
    }
}