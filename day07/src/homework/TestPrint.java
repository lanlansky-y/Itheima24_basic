package homework;

import java.util.Random;

/**
 * 定义一个数组包含10个元素的数组 随机生成10-20之间的数据,
 * 包含10和20,然后求出下面的值并且打印输出
 * ​ 1.最大值 ​ 2.最小值 ​ 3.平均值 ​ 4.求和 ​ 5.奇数的个数 ​
 * 6.偶数的个数
 */
public class TestPrint {
    public static void main(String[] args) {
        int[] arr = new int[11];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11) + 10;
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        int count = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
            if(arr[i]%2==1){
                count++;
            }else {
                even++;
            }
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        int avg = sum/arr.length;

        System.out.println("最大值为"+max+", 最小值为"+min+", " +
                "平均值为"+avg+", 各个元素的和为"+sum+", 奇数的个数为"+count+", 偶数的个数为"+even);
    }
}
