package stack;

public class MainClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());

        stack.push(15);
        stack.printStack();
        int k = stack.peek();
        System.out.println("k = " + k);
        System.out.println(stack.isEmpty());
        int m = stack.pop();
        System.out.println("m = " + m);
        System.out.println(stack.isEmpty());

        stack.push(2);
        stack.push(31);
        stack.push(8);
        stack.push(20);
        stack.printStack();

        int i = stack.peek();
        System.out.println("i = " + i);
        int n = stack.pop();
        System.out.println("n = " + n);
        stack.printStack();
        System.out.println(stack.search(20));
        System.out.println(stack.search(2));
        System.out.println(stack.search(31));
        System.out.println(stack.search(8));
    }
}
