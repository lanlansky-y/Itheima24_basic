package practice;

/*
打印逢七过游戏中跟七没有关系的数据，每五个打印一行
 */
public class TestSeven {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 7 != 0 && i % 10 != 7) {
                if (i > 0 && i < 10) {
                    System.out.print(i + "\t");
                    count++;
                    if (count % 5 == 0) {
                        System.out.println();
                    }
                } else if (i / 10 % 7 != 0) {
                    System.out.print(i + "\t");
                    count++;
                    if (count % 5 == 0) {
                        System.out.println();
                    }

                }
            }
        }
        System.out.println("count:"+count);
    }
}