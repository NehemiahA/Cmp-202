public class Stack {
    int size;
    int top;
    int[] array;


    Stack(int capacity) {
        top = -1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull() {
        return (top == size - 1);
    }

    boolean isEmpty() {
        return (top == -1);

    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            array[top + 1] = item;
            top++;

        }
    }

    void pop() {
        int PreviousTop = top;
        if (isEmpty()) {
            System.out.println("Stack is empty");


        } else {
            top--;


        }
    }
    public void printStack(){
            if (isEmpty()) {
                System.out.println("stack is empty");
                return;
            }
        System.out.print("Stack:");
        for (int i = top; i >=0; i--){
            System.out.println(array[i] + "");
        }
        System.out.println();

        }


    public static void main(String[] args) {

    }
}


