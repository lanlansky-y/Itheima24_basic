package homework;

/**
 * 根据输出的月份判断自己的星座
 * 十二星座
 * 1.水瓶座 2.双鱼座 3.白羊座 4.金牛座 5.双子座 6.巨蟹座
 * 7.狮子座 8.处女座 9.天秤座 10.天蝎座 11.射手座 12.摩羯座
 */
public class TestConstellation {
    public static void main(String[] args) {
        constellation(10);
    }
    public static void constellation(int num){
        switch (num){
            case 1:
                System.out.println("水瓶座");
                break;
            case 2:
                System.out.println("双鱼座");
                break;
            case 3:
                System.out.println("白羊座");
                break;
            case 4:
                System.out.println("金牛座");
                break;
            case 5:
                System.out.println("双子座");
                break;
            case 6:
                System.out.println("巨蟹座");
                break;
            case 7:
                System.out.println("狮子座");
                break;
            case 8:
                System.out.println("处女座");
                break;
            case 9:
                System.out.println("天秤座");
                break;
            case 10:
                System.out.println("天蝎座");
                break;
            case 11:
                System.out.println("射手座");
                break;
            case 12:
                System.out.println("魔蝎座");
                break;
                default:
                    System.out.println("您输入的数据有误！");
        }
    }
}
