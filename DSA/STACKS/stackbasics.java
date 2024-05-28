package DSA.STACKS;

import java.util.*;

class stackbasics{
   static Scanner sc = new Scanner(System.in);
    
    static void stack_push(Stack<Integer> stack){
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int z =sc.nextInt();
            stack.push(z);
        }
    }

    static void print_stack(Stack<Integer> stack){
        System.out.println("Elements in a stack");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }




    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack_push(stack);
        
        print_stack(stack);
        

    }
}
