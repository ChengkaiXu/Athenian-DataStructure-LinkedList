import java.util.Arrays;

public class ArrayQueue implements Queue{
    private int[] array;
    @Override
    public void enqueue(int data) {
        int[] arr;
        System.arraycopy(this.array, 0, arr = new int[array.length + 1], 0, this.array.length);
        this.array = arr;
    }

    @Override
    public int dequeue() {
        int res = array[0];
        array = Arrays.copyOfRange(array, 1, array.length - 1);
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
        Queue queue = new IntLinkedList();
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
