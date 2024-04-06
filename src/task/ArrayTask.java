package task;

import java.util.*;

public class ArrayTask {
    public static void main(String[] args) {
        // без использования списков
        int[] array = new int[20];

        System.out.print("[");
        for (int i = 0; i < 20; i++) {
            array[i] = (int)(Math.random()*15)+1;
            System.out.print(array[i]);
            if(i!=19) System.out.print(", ");
        }
        System.out.println("]");

        Map<Integer,Integer> indexMap = new TreeMap<>();
        for (int i = 0; i < 20; i++) {
            indexMap.put(array[i],indexMap.getOrDefault(array[i],0)+1);
        }

        for (Map.Entry<Integer,Integer> entry: indexMap.entrySet()) {
            if(entry.getValue()>1){
                System.out.printf("Число '%d' встречается %d раз(а)\n",entry.getKey(),entry.getValue());
            }
        }
    }
}
