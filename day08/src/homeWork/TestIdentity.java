package homeWork;

/**
 * 我国的居民身份证号码，由由十七位数字本体码和一位数字校验码
 * 组成。请定义方法判断用户输入的身份证号码是否合法，并在主方
 * 法中调用方法测试结果。规则为：号码为18位，不能以数字0开头，
 * 前17位只可以是数字，最后一位可以是数字或者大写字母X。
 */
public class TestIdentity {

    public static boolean isIdentity(String str){
        if(str.length()!=18 || str.charAt(0)=='0'){
            return false;
        }
        for(int i=0;i<str.length()-1;i++){
             if(str.charAt(i)<'0' || str.charAt(i)>'9'){
                 return false;
             }
        }
        char ch = str.charAt(str.length()-1);
        if( ch>='0' && ch<='9' || ch=='X'){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String str = "112345678901234561";
        boolean b = isIdentity(str);
        System.out.println(b);
    }
}
