package practiceBasic;

import java.util.Scanner;

/*
已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据。
定义一个方法，完成查找该数据在数组中的索引，并在控制台输出找到的索引值。
 */
public class TestArrayIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您要查找的数据：");
        int num = scanner.nextInt();
        int[] arr = {19, 28, 37, 46, 50};
        int a = searchIndex(arr, num);
        System.out.println(a);

    }
    public static int searchIndex(int[] arr, int a){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == a){
                return i;
            }
        }
        System.out.println("您输入的数据有误！");
        return -1;
    }
}
