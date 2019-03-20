package homeWork;

/**
 * 定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，
 * 调用该方法，并在控制台输出结果。
 * 要求：
 *
 * ​	1、如果传递的参数为空，返回null
 * ​	2、如果传递的数组元素个数为0，返回[]
 * ​	3、如果数组为int[] arr = {1,2,3};
 * 执行方法后的输出结果为：[1, 2, 3]
 */
public class TestStringJoint {

    public static String arrayToStr(int[] arr){
        if(arr == null){
            return null;
        }
        if(arr.length==0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]+",");

        }
        sb.setCharAt(sb.length()-1,']');

        return sb.toString();
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        String str = arrayToStr(arr);
        System.out.println(str);
    }
}
