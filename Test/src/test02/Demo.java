package test02;

public class Demo {
    public static void main(String[] args) {
        int count = 0;

        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.print(i+" ");
                count++;
                if(count%5==0){
                    System.out.println();
                }
            }

        }
        while (true) {
            if (count == 3) {
                count++;
                break;
            }
        }
        int a=1;
        byte b =2;
    }
}
