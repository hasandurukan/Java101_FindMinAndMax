package com.java101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();

        while (true) {
            System.out.print("Please type a number, (type exit to stop) :");
            String typed = input.nextLine();
            if (typed.equals("exit")) {
                break;
            } else {
                numbers.add(Integer.parseInt(typed));
            }
        }

        Collections.sort(numbers);

        System.out.print("Minimum number :" + numbers.get(0) + "\nMaximum number :" + numbers.get(numbers.size() - 1));
    }
}
