package com.example.annotationexample1;

import com.example.annotationexample1.indetifiers.IntegrationTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.springframework.test.util.AssertionErrors.assertTrue;

/**
 * Created by amitjain on 9/16/17.
 */
@Category(IntegrationTest.class)
public class IntegrationTestCaseExample {

    @Test
    public void test(){


        assertTrue("Integration test case",1==1);
    }
}
