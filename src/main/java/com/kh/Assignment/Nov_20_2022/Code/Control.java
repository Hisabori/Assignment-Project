/*
    Assignment: KH Java Study @ 2022 11 20, By Han Jeonghun
    Last edited : 2022 11 20 19:30 KST @ Han Jeonghun (local)
    Git Upload date: 2022 11 20 19:42 @ Han Jeonghun
*/
package com.kh.Assignment.Nov_20_2022.Code;

import java.util.Scanner;

//Control Assignment
public class Control {

//if else / else if / scanner / for
    public void method1() {

        Scanner SC;
        int i;
        SC = new Scanner(System.in);
        System.out.println("숫자 입력");
        i = SC.nextInt();
        System.out.println(i);

//if문
        if (i < 20) {
            System.out.println("20이하");

        } else if (i < 31) {
            System.out.println("30이하");
        } else {

            System.out.println("wait");
            SC.nextLine();
            if (i > 30 == i <= 100) {
                System.out.println("30 이상 100");
            }   else {
                System.out.println("error");
            }
        }

    }

//while / break / continue
    public void method2() {
        int i;

        while (true) {
            for (i = 1; i < 10; i++) {
                System.out.println("10 미만의 수");
                if (i == 6) {
                    continue;
                }
                System.out.println("i:" + i);
                break;

            }

        }
    }

//
}


