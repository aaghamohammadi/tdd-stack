package test;

import org.junit.Assert;
import org.junit.Test;
import stack.Stack;


public class StackTest {
    @Test
    public void emptyStackShouldHaveZeroSize() {
        Stack stack = new Stack();
        Assert.assertTrue(stack.isEmpty());
        Assert.assertEquals(0, stack.getSize());
    }
}