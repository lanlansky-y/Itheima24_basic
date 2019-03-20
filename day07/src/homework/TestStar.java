package homework;

/**
 * 0*******0
 * *0*****0*
 * **0***0**
 * ***0*0***
 * ****0****
 * ***0*0***
 * **0***0**
 * *0*****0*
 * 0*******0
 */
public class TestStar {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for(int j=0;j<9;j++){
                if(i+j==8 || i-j==0){
                    System.out.print("0");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
