package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import stack.Stack;

import java.util.EmptyStackException;


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

    @Test(expected = EmptyStackException.class)
    @DisplayName("Pop one element from empty Stack should Throw Exception")
    public void popOneElementFromEmptyStack() {
        stack.pop();
    }

    @Test
    @DisplayName("Push multiple elements and pop multiple elements from stack when the number of pushes is greater than that of pops")
    public void pushMultipleElementsAndPopMultipleElementsFromStackWhenTheNumberOfPushesIsGreaterThanThatOfPops() {
        stack.push(3);
        stack.push(5);
        stack.push(1);
        Assert.assertEquals(1, stack.pop());
        Assert.assertEquals(2, stack.getSize());
        Assert.assertFalse(stack.isEmpty());

    }

    @Test(expected = EmptyStackException.class)
    @DisplayName("Push multiple elements and pop multiple elements from stack when the number of pops is greater than that of pushes")
    public void pushMultipleElementAndPopMultipleElementsFromStackWhenTheNumberOfPopsIsGreaterThanThatOfPushes() {
        stack.push(4);
        stack.push(1);
        stack.pop();
        stack.pop();
        Assert.assertEquals(0, stack.getSize());
        Assert.assertTrue(stack.isEmpty());
        stack.pop();
    }


}