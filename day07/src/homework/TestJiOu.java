package homework;


/**
 * 给出数组 {6,66,43,45,38,64,21,99,88}
 * 把奇数放在数组的左边，偶数放在数组的右边
 */
public class TestJiOu {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        long b = Runtime.getRuntime().freeMemory();
        int[] arr = {6,66,43,45,38,64,21,99,88};
        int[] array = new int[arr.length];
        int odd = 0;
        int even =array.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1){
                array[odd] = arr[i];
                odd++;
            }else {
                array[even] = arr[i];
                even--;
            }
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){

                System.out.print(array[i]);
            }else {
                System.out.print(array[i]+",");
            }
        }
        System.out.println("]");
        long c = System.currentTimeMillis();
        long d = Runtime.getRuntime().freeMemory();

        System.out.println("此代码耗费的时间是"+(c-a));
        System.out.println("此代码耗费的内存是"+(b-d));
    }
}
