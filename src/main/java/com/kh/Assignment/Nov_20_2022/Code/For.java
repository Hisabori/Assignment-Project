package com.kh.Assignment.Nov_20_2022.Code;

public class For {
    public void method1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void method2() {
        System.out.println("실행TEST");

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("합계" + sum);
        }


    }

    public void method3() {

        // double type, error
        // System.out.println(Math.random());

        int random = (int) (Math.random() * 10 + 1);
        System.out.println(random);

        int sum = 0;
        for (int i = 1; i <= random; i++) {
            sum += i;
            System.out.printf("1부타 %d까지의 합= %d \n", random, sum);
        }

    }

    /*중첩 for 문
    [표현법]
    public void method4() {
        int sum = 0;
            for (int i=1; i<=10; i++){
                sum += i;
                    System.out.println("");
            for (int j=0; j<=10 j++)}
                System.out.println("");

            sum += i;
            System.out.println("합계" + sum);

       */
    public void method4() {
        System.out.println("실행 test");

    }

    public void method5() {
        int sum = 0;

        for (int i = 2; i <= 9; i++) {
            System.out.printf("==%d단 ==\n", i);

            for (int j = 0; j <= 9; j++) {
                System.out.printf("%d x %d = %d\n", i, j, (i * j));
            }
        }
    }
    /*
    for (int i= 1; i <= 10; i++){
        for (int j = 1; j <= 10; j++) {
            System.out.printf("%d단 %d = %d\n", i, j, (i * j));
            System.out.printf(i);
        }
    }
    */



}





