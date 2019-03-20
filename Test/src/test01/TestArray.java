package test01;

import java.util.Random;
import java.util.Scanner;

/**
 * 定义一个长度为5的int型数组，数组元素为1-99(范围包含1和99)
 * 之间的随机数；
 * 遍历数组arr，打印所有数组元素；
 * 提示用户输入2-5之间的一个数字num(num范围包括2和5，不需要
 * 代码判断)；
 * 筛选出数组中元素是num倍数的数组元素并输出
 * 示例如下：
 * 随机生成的数组元素为：
 * 52  20  58  9  10
 * 请输入2-5之间的一个数字：
 * 5
 * 符合条件的元素为：
 * 20  10
 */
public class TestArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];
        System.out.println("随机生成的数组元素为：");
        for (int i = 0; i < arr.length; i++) {
            int x = random.nextInt(99)+1;
            arr[i]=x;
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        System.out.println("请输入2-5之间的一个数字：");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println("符合条件的元素为：");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%num==0){
                System.out.print(arr[i]+"  ");
            }
        }
    }
}
