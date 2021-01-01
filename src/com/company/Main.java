package com.company;

import static com.company.Keyboard.nextInt;

public class Main {
    public static void main(String[] args) {

        for(int i = 1; i<=100; i++) {
            // i % 3 == 0 -> fizz
            // i % 5 == 0 -> buzz
            //   %%       -> fizzbuzz;

            if ( (i  % 3 == 0) &&  (i  % 5 == 0)) {
                System.out.println("fizzbuzz");
            } else if ( i  % 5 == 0){
                System.out.println("buzz");
            } else if ( i  % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }

    }
}
