package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    List<Integer> stack_ = new ArrayList<>();

    public boolean isEmpty() {
        return stack_.size() == 0;
    }

    public int getSize() {
        return stack_.size();
    }

    public void push(int i) {
        stack_.add(i);
    }
}
