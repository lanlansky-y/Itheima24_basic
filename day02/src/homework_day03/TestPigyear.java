package homework_day03;

/*
已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。
 */
public class TestPigyear {
    public static void main(String[] args) {
        int count=0,n=0;
        for (int i = 2019; i >= 1949; ) {
            n=2019-12*count;
            count++;
            System.out.println(n);
            i-=12;
        }
    }
}
