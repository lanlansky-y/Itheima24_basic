package homeWork;

import java.util.Scanner;

/**
 * 现已知工人（Worker）类，属性包含姓名（name）、工龄（year），请
 * 编写该类，提供构造方法和get、set方法。在测试类中，请查看键盘录入
 * Scanner类的API，创建工人类对象，属性值由键盘录入，打印对象的属性值。
 * 输出效果如下：
 * 请录入工人姓名：
 * 张三
 * 请录入工人工龄：
 * 5
 * 该工人对象的属性信息如下：
 * 姓名：张三
 * 工龄：5
 */
public class TestWorker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入工人姓名：");
        String name = scanner.next();
        System.out.println("请录入工人工龄：");
        int age = scanner.nextInt();
        Worker worker = new Worker();
        worker.setName(name);
        worker.setYear(age);
        worker.printMess();
    }
}

class Worker{
    private String name;
    private int year;

    public Worker(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Worker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void printMess(){
        System.out.println("该工人对象的属性信息如下：");
        System.out.println("姓名："+this.name);
        System.out.println("工龄："+this.year);
    }
}