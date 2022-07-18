package test08string.excption.Stack;

public class ExceptionTest10 {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        //压栈
        try {
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
        } catch (MyStackOperationException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
