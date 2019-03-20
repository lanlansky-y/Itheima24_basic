package homeWork;

/**
 * 现有如下文本："Java语言是面向对象的，Java语言是健壮的，
 * Java语言是安全的，Java是高性能的，Java语言是跨平台的"。
 * 请编写程序，统计该文本中"Java"一词出现的次数。
 */
public class TestStringMethod {

    public static void main(String[] args) {
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";

        String java = "Java";
        int i = str.indexOf(java);
        int count = 0;
        while(i!=-1){
            count++;
            str=str.substring(i+java.length());
            //substring返回的是子字符串
//            str.substring(i+java.length());
            i = str.indexOf(java);
        }
        System.out.println(count);
    }
}
