package day03;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        //정렬-선택정렬(가장 작은 값을 앞으로 가져옴)
        int [] arr= {5, 23, 1, 43, 200, 100, 40};
//
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1; j<arr.length;j++){
//                if(arr[i]>arr[j]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
        Arrays.sort(arr); //
        System.out.println(Arrays.toString(arr));
    }
}
