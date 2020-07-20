package test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stack.Stack;

import java.util.EmptyStackException;


public class StackTest {
    private Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack();
    }

    @Test
    @DisplayName("Empty stack should have zero size")
    public void emptyStackShouldHaveZeroSize() {
        Assertions.assertTrue(stack.isEmpty());
        Assertions.assertEquals(0, stack.getSize());
    }

    @Test
    @DisplayName("Push one element to stack")
    public void pushOneElementToStack() {
        stack.push(3);
        Assertions.assertEquals(1, stack.getSize());
        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    @DisplayName("Push multiple elements to stack")
    public void pushMultipleElementsToStack() {
        stack.push(5);
        stack.push(3);
        Assertions.assertEquals(2, stack.getSize());
    }

    @Test
    @DisplayName("Pop one element from empty Stack should Throw Exception")
    public void popOneElementFromEmptyStack() {
        Assertions.assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    @DisplayName("Push multiple elements and pop multiple elements from stack when the number of pushes is greater than that of pops")
    public void pushMultipleElementsAndPopMultipleElementsFromStackWhenTheNumberOfPushesIsGreaterThanThatOfPops() {
        stack.push(3);
        stack.push(5);
        stack.push(1);
        Assertions.assertEquals(1, stack.pop());
        Assertions.assertEquals(2, stack.getSize());
        Assertions.assertFalse(stack.isEmpty());

    }

    @Test
    @DisplayName("Push multiple elements and pop multiple elements from stack when the number of pops is greater than that of pushes")
    public void pushMultipleElementAndPopMultipleElementsFromStackWhenTheNumberOfPopsIsGreaterThanThatOfPushes() {
        stack.push(4);
        stack.push(1);
        stack.pop();
        stack.pop();
        Assertions.assertEquals(0, stack.getSize());
        Assertions.assertTrue(stack.isEmpty());
        Assertions.assertThrows(EmptyStackException.class, stack::pop);

    }


}