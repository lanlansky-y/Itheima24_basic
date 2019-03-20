package homework;

/**
 * 1.要求定义一个方法print，该方法可以打印任意层的三角形。
 * 例如：如果三层的效果为
 * *
 * **
 * ***
 * 5层的效果为：
 * *
 * **
 * ***
 * ****
 * *****
 */
public class TestTriangle {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
