package Array_Sort;

import java.util.Arrays;
import java.util.Comparator;

public class Array_Sort1 {
    public static void StringArray1() {

        //선언
        String[] i; //배열
        String[] r; //배열 (i) -> 역순으로 돌리기 위해 사용

        //배열 선언
        i = new String[] { "aa " , "ac ", "ab ", "ad " };

        //reverseOrder 에 사용
        // r = i (배열)
        r = i;

        //일반배열
        Arrays.sort(i);

        //역순배열
        Arrays.sort (r, Comparator.reverseOrder());

        //일반배열 출력
        for (String arr : i){
            System.out.print(arr);
        }

        //줄넘김
        System.out.println(" ");

        //역순배열 출력
        //r = i 의 역순
        for (String arrReverse : r){
            System.out.print(arrReverse);
        }


    }
}