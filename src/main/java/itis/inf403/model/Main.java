package itis.inf403.model;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            int randomValue = random.nextInt(100); // случайные числа от 0 до 99
            list.add(randomValue);
        }

        System.out.println("Первые 17 элементов списка:");
        Node current = list.getFirst();
        for (int i = 0; i < 17 && current != null; i++) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        System.out.println("Содержимое списка:");
        list.output();

        System.out.println("Содержимое списка в обратном порядке:");
        list.outputReverse(list.getFirst());
        System.out.println();
    }
}
