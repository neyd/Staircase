package com.neyd.staircase;
import java.util.Scanner;
/**
 * Created by Женя on 02.11.2015.
 */
public class Staircase {
    public static void main(String[] args) {
        int number;
        int stairc;
        Scanner res = new Scanner(System.in);
        System.out.println("Введіть кількість ступеньок");
        number = res.nextInt();
        for (int i = 1; i <= number; i++) {
            stairc = staircase(i);
            System.out.print("  " + stairc);
        }
    }
    public static int staircase(int k) {
        if (k == 1) return 1;
        if (k == 2) return 2;
        return staircase(k - 1) + staircase(k - 2);
    }
}
