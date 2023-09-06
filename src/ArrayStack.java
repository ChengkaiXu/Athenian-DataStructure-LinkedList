public class ArrayStack implements Stack{
    private int[] array;
    private int index;
    public ArrayStack (){
        this.array = new int[0];
        this.index = 0;
    }
    @Override
    public void push(int data) {
        int[] arr = new int[array.length + 1];
        for (int i = 0; i < this.array.length; i++) {
            arr[i] = this.array[i];
        }
        arr[index] = data;
        index++;
        this.array = arr;
    }

    @Override
    public int pop() {
        int[] arr = new int[array.length - 1];
        int res = this.array[index - 1];
        index--;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = this.array[i];
        }
        this.array = arr;
        return res;
    }

    @Override
    public int peek() {
        return this.array[index - 1];
    }

    @Override
    public boolean isEmpty() {
        return this.array.length == 0;
    }
    public static void main(String[] args) {
        Stack stack = new ArrayStack();
        stack.push(10);
        stack.push(5);
        stack.push(2);
        stack.push(7);

        System.out.println(stack.peek()); // 7

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        // 7
        // 2
        // 5
        // 10
    }
}
