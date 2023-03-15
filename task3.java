// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class task3 {
    public static ArrayList<Integer> randomArrayInt(Integer size, Integer min_number, Integer max_number) {
        ArrayList<Integer> list = new ArrayList<>();
        Random haos = new Random();
        for (int i = 0; i < size; i++) {
            list.add(haos.nextInt(min_number, max_number + 1));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите размер необходимого массива: ");
        Integer size = input.nextInt();
        System.out.printf("Введите минимально возможное число в массиве: ");
        Integer min = input.nextInt();
        System.out.printf("Введите максимально возможное число в массиве: ");
        Integer max = input.nextInt();
        input.close();

        ArrayList<Integer> list_number = randomArrayInt(size, min, max);
        System.out.println(list_number);

        Integer minimum = list_number.get(0);
        Integer maximum = list_number.get(0);
        Double sum = 0.0;
        Double average = 0.0;
        for (int i = 0; i < list_number.size(); i++) {
            sum += list_number.get(i);
            if (list_number.get(i) < minimum)
                minimum = list_number.get(i);
            if (list_number.get(i) > maximum)
                maximum = list_number.get(i);
            average = sum / list_number.size();
        }
        System.out.printf("Минимальное число этого массива: %d\n", minimum);
        System.out.printf("Максимальное число этого массива: %d\n", maximum);
        System.out.printf("Среднее арифметическое этого массива: %f\n", average);
    }
}