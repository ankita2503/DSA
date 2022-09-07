package Stack;

import java.util.Stack;

public class ReverseStackRecursion {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> revStack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        //pushAtEnd(stack,4);
        Stack st = reverse(stack);
        while(!st.isEmpty()){
            System.out.println(st.pop()+" ");
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


    public static Stack reverse(Stack stack){

        if(stack.isEmpty()) {
            return stack;
        }
        int top = (int)stack.pop();
        reverse(stack);
        return insertTop(stack,top);
    }

    public static Stack insertTop(Stack stack, int top){

        if(stack.isEmpty()) {
            stack.push(top);
            return stack;
        }
        int val = (int)stack.pop();
        insertTop(stack,top);
        stack.push(val);
        return stack;

    }
}
