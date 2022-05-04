import java.util.ArrayDeque;
import java.util.Deque;

public class Task2 {
    public static void main(String[] args) {
        ArrayDeque<HeavyBox> deque = new ArrayDeque<>();
        HeavyBox oneBox = new HeavyBox(100, 10, 8, 3000);
        HeavyBox twoBox = new HeavyBox(110, 8, 15, 3500);
        HeavyBox freeBox = new HeavyBox(90, 4, 11, 2900);
        HeavyBox fourBox = new HeavyBox(72, 6, 9, 3700);
        deque.offer(oneBox);
        deque.offer(twoBox);
        deque.offer(freeBox);
        deque.offer(fourBox);
        System.out.println(deque);
        deque.poll();
        deque.poll();
        deque.poll();
        System.out.println(deque);
    }
}
