import java.util.Arrays;

public class ArrayQueue implements Queue{
    private int[] array;
    public ArrayQueue(){
        this.array = new int[0];
    }
    @Override
    public void enqueue(int data) {
        int[] arr = new int[array.length + 1];
        System.arraycopy(this.array, 0, arr, 0, this.array.length);
        arr[arr.length - 1] = data;
        this.array = arr;
    }

    @Override
    public int dequeue() {
        int res = array[0];
        array = Arrays.copyOfRange(array, 1, array.length);
        return res;
    }

    @Override
    public int peek() {
        return array[0];
    }

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    public static void main(String[] args) {
        Queue queue = new ArrayQueue();
        queue.enqueue(10);
        queue.enqueue(5);
        queue.enqueue(2);
        queue.enqueue(7);

        System.out.println(queue.peek()); // 10

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
