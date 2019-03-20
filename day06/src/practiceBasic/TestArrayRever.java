package practiceBasic;

import java.util.Arrays;

/*
​ 已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现把
数组中的元素值反转(在原数组中操作，不能定义第二个数组)，反转
后的数组 arr = {50, 46, 37, 28, 19}; 并在控制台输出反转
后的数组元素。
 */
public class TestArrayRever {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        for(int j=0;j<arr.length;j++) {
            for (int i = 0; i < arr.length-j-1; i++) {
                int temp;
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        //更方便的方法
        System.out.println();
        int[] arr1 = {12,13,43,14,55,23,87,98,65,90};
        Arrays.sort(arr1);
        printArr(arr1);
        reverse(arr1);
        printArr(arr1);


    }
    public static void reverse(int[] arr){
        for(int start=0, end=arr.length-1; start<end; start++,end--){
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
        }
    }

    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {

            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+"\t");
            }
        }
        System.out.println("]");
    }
}
