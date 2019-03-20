package homeWork;

/**
 * 请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中
 * 测试方法。例如："abcba"、"上海自来水来自海上"均为对称字符串。
 */
public class TestIsDuichen {
    public static boolean isDuichen(String str){
        if(str==null){
            return false;
        }
        for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isDuichen("上海自来水来自海上"));
    }
}
