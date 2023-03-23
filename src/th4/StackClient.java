package th4;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack=new MyStack(5);
        stack.push(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("size of stack after push: " + stack.size());
         while (!stack.isEmpty()){
             System.out.printf(" %d",stack.pop());
         }
        System.out.println("\n size of stack after push: " + stack.size());
    }
}
