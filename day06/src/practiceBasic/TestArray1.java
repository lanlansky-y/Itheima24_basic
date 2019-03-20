package practiceBasic;
/*
设计一个方法，用于比较两个数组的内容是否相同
 */
public class TestArray1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};
        boolean boo = compareArr(a,b);
        System.out.println(boo);
    }
    public static boolean compareArr(int[] a,int[] b){
        if(a.length == b.length){
            for(int i =0;i<a.length;i++){
                if(a[i] != b[i]){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
}
