/*
    Assignment: KH Java Study @ 2022 11 20, By Han Jeonghun
    Last edited : 2022 11 20 20:26 KST @ Han Jeonghun (local)
    Git Upload date: 2022 11 20 19:42 @ Han Jeonghun
*/
package com.kh.Assignment.Nov_20_2022.Code;

public class Array {

    public void method1(){


//Array Assignment
        int[] iArray;
        double[] dArray = new double[5];
        iArray = new int[5];

        iArray[0] = 10;
        iArray[1] = 20;
        iArray[2] = 30;
        iArray[3] = 40;
        iArray[4] = 50;

        System.out.println(iArray[0]);
        System.out.println(iArray[1]);
        System.out.println(iArray[2]);
        System.out.println(iArray[3]);
        System.out.println(iArray[4]);
        //System.out.println(iArray[5]);

//Array+배열
        for(int i=0; i<dArray.length; i++){
            iArray[i]=(i+1)*10;
            System.out.println(iArray[i]);
        }

//값 목록으로 배열 생성/초기화
        //int[] iArray=new int[]{1,2,3,4,5};
        //double dArray[]={1.1,2.2,3.3,4.4,5.5};

//error
        //int[] iArray;
        //iArray={1,2,3,4,5}
    }

//2차원배열

    public void method2(){
        /*
        선언방법:
        */
        int[][] iArray;
        double dArray[][];
        byte bArray[];

        //double[] dArray = new double[4];


        iArray = new int[4][4];

        iArray[0][0]=10;
        iArray[0][1]=20;
        iArray[0][2]=30;
        iArray[0][3]=40;

        System.out.println(iArray[0][0]);
        System.out.println(iArray[0][1]);
        System.out.println(iArray[0][2]);
        System.out.println(iArray[0][3]);

        //중첩반복문 사용
        for (int i=0; i< iArray.length; i++){
            for (int j= 0; j< iArray[i].length; j++){
                iArray[i][j]=(j+1)*10;
                System.out.println(iArray[i][j]);
            }
        }

        //값 목록으로 2차원 배열 생성/초기화
        iArray = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        dArray = new double[][]{{1.1, 2.2, 3.3, 4.4}, {5.5, 6.6, 7.7, 8.8}};

    }

    public void method3(){
        int[][] iArray = new int[2][];
        double[][] dArray = {{1.1,2.2,3.3},{4.4,5.5,6.6}};

        iArray[0]=new int[3];
        iArray[1]=new int[2];

        for (int i= 0; i<iArray.length; i++){
            for (int j= 0; j<iArray[i].length; j++){
                iArray[i][j]=j+1;
            }
        }
    }
}
