package homeWork;

import java.util.Random;

/**
 * 在登录注册页面中，除了用户名和密码外，通常也会包含验证码。
 * 验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、
 * 灌水等行为。请查看Random、StringBuilder相关API，定义方法，
 * 获取一个包含4个字符的验证码，每一位字符是随机选择的字母和数字，
 * 可包含a-z,A-Z,0-9。例如：
 * 7Kt5
 */
public class TestVerification {


    public static void main(String[] args) {

        String code = getVerification();
        System.out.println(code);
    }

    public static String getVerification() {

        StringBuilder sb = new StringBuilder("");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            sb.append(ch);
        }
        for (int i = 0; i <= 9; i++) {
            sb.append(i);
        }

        Random random = new Random();
        String str = "";
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(sb.length());
            str += sb.charAt(index);
        }

        return str;
    }
}
