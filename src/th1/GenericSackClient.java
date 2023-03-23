package th1;

public class GenericSackClient {
    public static void main(String[] args) {
        stackOfString();
        stackOfInteger();
    }
    public static void stackOfString(){
        MyGenericStack<String> stack=new MyGenericStack<String>();
        stack.push("five");
        stack.push("four");
        stack.push("three");
        stack.push("two");
        stack.push("one");
        System.out.println("size của stack sau khi push là : "+stack.size());
        while (!stack.isEmpty()){
            System.out.println("pop->>"+stack.pop());
        }
        System.out.println("size của stack sau khi pop là : "+stack.size());
    }
    public static void stackOfInteger(){
        MyGenericStack<Integer> stack=new MyGenericStack<Integer>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("size của stack sau khi push là : "+stack.size());
        while (!stack.isEmpty()){
            System.out.println("pop->>"+stack.pop());
        }
        System.out.println("size của stack sau khi pop là : "+stack.size());
    }
}
