package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arrayListA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите значение для  листа A :: " + i + " | 5");
            arrayListA.add(scanner.next());


        }
        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("Полный список листа A");
        System.out.println(arrayListA);
        System.out.println(":::::::::::::::::::::::::::");
        ArrayList<String> arrayListB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите значение для  листа B :: " + i + " | 5");
            arrayListB.add(scanner.next());
        }
        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("Полный список листа B");
        System.out.println(arrayListB);
        System.out.println(":::::::::::::::::::::::::::");

        Collections.reverse(arrayListB);

        int length = arrayListA.size();

        ArrayList<String> arrayListC = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            arrayListC.add(arrayListA.get(i));
            arrayListC.add(arrayListB.get(i));


        }
        System.out.println("Общий список");
        System.out.println(arrayListC);

        System.out.println(":::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::");

        System.out.println(" Отсортированный список ");
        arrayListC.sort(Comparator.comparingInt(String::length));
        System.out.println(arrayListC);

    }
}
