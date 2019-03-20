package practiceBasic;
/*
在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值
(不考虑小数部分)。
 */
public class TestScores {
    public static void main(String[] args) {
        int[] arr = {65,87,54,23,90,80};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != max && arr[i] != min){
                sum += arr[i];
            }
        }
        System.out.println("选手的得分为"+(sum/4));
    }
}
