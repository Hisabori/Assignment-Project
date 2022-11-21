package com.kh.Assignment.Nov_20_2022.Code;

import java.util.Scanner;

public class Switch {

    /*public void method1() {
        String fruit = "";
        int price = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("과일 이름 >" );
        fruit = sc.nextLine();


        switch (fruit) {
            case "포도":
                price = 4500;

                break;
            case "망고":
                price = 9000;

                break;
            case "수박":
                price = 20000;

                break;
            default:
                System.out.println("판매하지 않는 과일입니다.");
        }

        System.out.println("fruit = " + fruit + "가격" + price + "원 /  ");
        

    }
    */

    public void method2() {

    }

    public void method3() {
        int month = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("1월 - 12월까지 중 하나를 입력하세요 >");
        month = sc.nextInt();

        if (!(month >= 1 && month <= 12)) {
            System.out.println("1월 - 12월 까지 입력하셔야 합니다. / 현제 입력된 달은 " + month + "월 입니다");
            return;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("입력하신 " + month + "월은 31일까지 입니다");

                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("입력하신 " + month + "월은 30일까지 입니다");
        }

        //System.out.println(month);


        sc.close();
    }


    public void method5() {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;



        Scanner sc = new Scanner(System.in);

        System.out.println("계산할 숫자 1을 입력하세요");
        num1 = sc.nextInt();

        System.out.println("계산할 숫자 2를 입력하세요");
        num2 = sc.nextInt();

        System.out.println("연산자를 입력하세요 = 1= + / 2= - / 3= * /4= /");
        num3 = sc.nextInt();

        switch (num3) {

            case 1:
                int a = num1 + num2;
                System.out.println("결과: " + a);
                break;

            case 2:
                int b = num1 - num2;
                System.out.println("결과: " + b);
                break;

            case 3:
                int c = num1 * num2;
                System.out.println("결과: " + c);
                break;

            case 4:
                int d =  num1 / num2;
                System.out.println("결과: " + d);
                break;

                default:
        }




    }

}

