package homework_day02;
/*
身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：

​	儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2

​	女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2

现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？
 */
public class Test3 {
    public static void main(String[] args) {
        double fatherHeight=177;
        double motherHeight=165;
        boolean gender=true;
        double son=0,daughter=0;

        son=(fatherHeight+motherHeight)*1.08/2;

        daughter=(fatherHeight*0.923+motherHeight)/2;

        System.out.println(son);
        System.out.println(daughter);
        }


}

