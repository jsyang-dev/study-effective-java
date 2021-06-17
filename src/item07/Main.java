package item07;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 0; i < 30; i++) {
            stack.push(i + 1);
        }

        for (int i = 0; i < 30; i++) {
            System.out.println(stack.pop());
        }
    }
}
