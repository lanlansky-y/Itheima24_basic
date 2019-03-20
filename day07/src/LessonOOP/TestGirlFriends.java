package LessonOOP;
/*
定义一个女朋友类。女朋友的属性包含：姓名，身高，体重。行为包含：
洗衣服wash()，做饭cook()。另外定义一个用于展示三个属性值的show()方法。
请在测试类中通过有参构造方法创建对象并赋值，然后分别调用展示方法、洗衣服
方法和做饭方法。打印效果如下：
我女朋友叫凤姐,身高155.0厘米,体重130.0斤
女朋友帮我洗衣服
女朋友给我做饭
 */
public class TestGirlFriends {
    public static void main(String[] args) {
        GirlFriends gf = new GirlFriends("小茜", 168.0f, 120.0f);
        gf.wash();
        gf.cook();
        gf.show();

    }
}
class GirlFriends{
    private String name;
    private float height;
    private float weight;

    public GirlFriends() {
    }

    public GirlFriends(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void wash(){
        System.out.println("女朋友帮我洗衣服");
    }
    public void cook(){
        System.out.println("女朋友给我做饭");
    }
    public void show(){
        System.out.printf("我女朋友叫%s,身高%.1f厘米,体重%.1f斤", this.name,this.height,this.weight);


    }
}
