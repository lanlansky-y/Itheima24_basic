package practice;
/*
求1-100之间的质数的和
 */
public class TestZhishu {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 2; i < 100; i++) {
            int count =0;
            for(int j=1; j<=i;j++){
                if(i%j==0){
                    count++;
                    if(count>2){
                        break;
                    }
                }
            }
            if(count<=2){
                sum += i;
            }
        }
        System.out.println("质数的和为"+sum);


        boolean b = isPrimeNum(97);
        System.out.println(b);
    }

    //检测某数是不是质数
    public static boolean isPrimeNum(int num){
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
