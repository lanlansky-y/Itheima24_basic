package com.yyz.array;
/*
定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，
偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
 */
public class TestArray7 {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        long b = Runtime.getRuntime().freeMemory();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int[] array = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 1) {
                array[j] = arr[i];
                j++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                array[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        long c = System.currentTimeMillis();
        long d = Runtime.getRuntime().freeMemory();
        System.out.println("此代码耗费的时间是"+(c-a));
        System.out.println("此代码耗费的内存是"+(b-d));
    }
}
