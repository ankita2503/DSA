package Stack;

import java.util.Stack;

public class PushAtEndStackRecursion {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        pushAtEnd(stack,4);
        reverse(stack);
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
            stack.push(data);
            return stack;
        }

        int top = (int) stack.pop();
        pushAtEnd(stack,data);
        stack.push(top);
        return stack;

    }

    public static void reverse(Stack stack){

        if(stack.isEmpty()){
            return;
        }

        int top = (int) stack.pop();
        reverse(stack);
        pushAtEnd(stack,top);
    }
}
