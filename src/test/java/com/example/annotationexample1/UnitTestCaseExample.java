package com.example.annotationexample1;

import com.example.annotationexample1.indetifiers.UnitTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.springframework.test.util.AssertionErrors.assertTrue;

/**
 * Created by amitjain on 9/16/17.
 */
@Category(value = UnitTest.class)
public class UnitTestCaseExample {

    @Test
    public void test(){


        assertTrue("Unit test case",1==1);
    }
}
