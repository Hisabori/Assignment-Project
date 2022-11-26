package com.kh.Assignment.Nov_24_2022;

import com.kh.Assignment.Nov_24_2022.Merge_Sort.Merge;

import static javax.swing.plaf.synth.ColorType.MAX_COUNT;

public class Main {

    public static int[] src;
    public static int[] tmp;

    //private static int[] a;
    public static void main(String[] args) {

        //Insertion_Sort
        //new Insertion_Sort().method1();


        //Insertion_SortScannerTest().test();
        //new ScannerInt().testInt();
        //new ScannerFloat().testFloat();
        //new ScannerInt2().testInt2();
        // new ScannerTest2().test();




            int[] arr = new int[MAX_COUNT];
            for (int i = 0; i < MAX_COUNT; i++) {
                // 0 ~ MAX_COUNT 범위내의 난수를 생성
                arr[i] = (int) (Math.random() * MAX_COUNT);
            }

            System.out.println("정렬 전 데이터");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();

            System.out.println("정렬 후 데이터 (오름차순)");
            int[] ascSortedArrayTest = arr.clone();
            Merge.sort(ascSortedArrayTest, 0, ascSortedArrayTest.length - 1);
            for (int i : ascSortedArrayTest) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }



