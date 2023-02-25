// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
      public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkList.add(ThreadLocalRandom.current().nextInt(1, 50));
        }
        System.out.print("Начальный список: ");
        System.out.println(linkList);
        System.out.print("Перевернутый список: ");
        System.out.println(reverseList(linkList));
    }
    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(list.size()-i-1, list.pop());
        }
        return list;
    }
}