package homeWork;

import java.util.ArrayList;

/**
 * 请定义教师（Teacher）类，属性包含姓名和专业名称。将若干教师对象
 * 存入ArrayList集合中，并遍历集合打印教师信息，格式如下：
 *
 * 姓名：赵老师, 专业：javase
 * 姓名：钱老师, 专业：javaee
 * 姓名：孙老师, 专业：php
 * 姓名：李老师, 专业：python
 */
public class TestQues2 {
    public static void main(String[] args) {
        ArrayList<Teacher> array = new ArrayList<>();
        Teacher t1 = new Teacher("马老师","English");
        Teacher t2 = new Teacher("汪老师","History");
        Teacher t3 = new Teacher("王老师","Science");
        Teacher t4 = new Teacher("周老师","Music");

        array.add(t1);
        array.add(t2);
        array.add(t3);
        array.add(t4);

        for (int i = 0; i < array.size(); i++) {
            Teacher t = array.get(i);
            System.out.println("姓名："+t.getName()+"，专业："+t.getMajor());
        }
    }
}


