package code.basic;

public class TestResizeingArrayStack {
    public static void main(String[] args) {
        ResizingArrayStack<String> stack = new ResizingArrayStack<>();
        stack.push("aa");
        stack.push("bb");
        stack.push("cc");
        stack.push("cc");
        stack.pop();
        stack.push("dd");
        for (String string : stack) {
            System.out.printf("%s\t", string);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            try{
                System.out.println(stack.pop());
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("END");
    }
}
