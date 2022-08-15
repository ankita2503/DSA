package Stack;

import java.util.Stack;

public class ReverseStackRecursion {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        pushAtEnd(stack,4);
        while(!stack.isEmpty()){
            System.out.println(stack.pop()+" ");
        }
    }

    /*
1
2
3
4
     */
    public static Stack pushAtEnd(Stack stack, int data){

        if(stack.isEmpty()){
            return stack;
        }

        int top = (int) stack.pop();
        pushAtEnd(stack,data);
        stack.push(top);
        return stack;

    }
}
