package com.kh.Assignment.Nov_23_2022.Prime;

import java.util.Scanner;


public class Prime {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        is_Prime (SC.nextInt());
    }

        public static void is_Prime(int number){


            if (number < 2) {
                System.out.println("no");
                return;

            }

            if (number == 2) {
                System.out.println("yes");
                return;
            }

            for (int i = 0; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("no");
                    return;
                }
                System.out.println("yes");
                return;

            }
        }
    }