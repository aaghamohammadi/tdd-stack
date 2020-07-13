package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import stack.Stack;


public class StackTest {
    private Stack stack;

    @Before
    public void setUp() {
        stack = new Stack();
    }

    @Test
    @DisplayName("Empty stack should have zero size")
    public void emptyStackShouldHaveZeroSize() {
        Assert.assertTrue(stack.isEmpty());
        Assert.assertEquals(0, stack.getSize());
    }

    @Test
    @DisplayName("Push one element to stack")
    public void pushOneElementToStack() {
        stack.push(3);
        Assert.assertEquals(1, stack.getSize());
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    @DisplayName("Push multiple elements to stack")
    public void pushMultipleElementsToStack() {
        stack.push(5);
        stack.push(3);
        Assert.assertEquals(2, stack.getSize());
    }

}