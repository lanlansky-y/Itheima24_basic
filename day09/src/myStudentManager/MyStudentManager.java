package myStudentManager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 学生管理系统
 */
public class MyStudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生信息");
            System.out.println("2 删除学生信息");
            System.out.println("3 修改学生信息");
            System.out.println("4 查看学生信息");
            System.out.println("5 退出系统");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String str = sc.next();

            switch (str) {
                case "1":
                    addStudent(array);
                    break;
                case "2":

                    removeStu(array);
                    break;
                case "3":
                    setStu(array);
                    break;
                case "4":
                    getStu(array);
                    break;
                case "5":
                    flag = false;
                    break;
                default:
                    System.out.println("选择有误，请重新选择：");
                    break;
            }
        }
    }

    //添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        //创建一个学生对象
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        //输入学生信息
        String sid;
        while (true) {
            System.out.println("请输入你要添加的学生学号：");
            sid = sc.next();
            boolean flag = isUsed(array, sid);

            if (flag) {
                System.out.println("你输入的学号已经存在，请重新输入！");

            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        String age = sc.next();
        System.out.println("请输入学生居住地：");
        String address = sc.next();
        //把学生信息添加到学生对象上
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        //把学生对象添加到集合中
        array.add(s);
        //输出提示
        System.out.println("添加成功！");
    }

    public static boolean isUsed(ArrayList<Student> array, String sid) {
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                return true;
            }
        }
        return false;
    }

    //删除学生信息
    public static void removeStu(ArrayList<Student> array) {
        System.out.println("请输入你要删除的学生的学号：");
        Scanner sc = new Scanner(System.in);
        String sid = sc.next();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                array.remove(s);
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("你输入的学号有误，请重新输入！");


    }

    //修改学生信息
    public static void setStu(ArrayList<Student> array) {
        System.out.println("请输入你要修改的学生学号：");
        Scanner sc = new Scanner(System.in);
        String sid = sc.next();

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                System.out.println("请输入修改后的学生姓名：");
                String name = sc.next();
                System.out.println("请输入修改后的学生年龄：");
                String age = sc.next();
                System.out.println("请输入修改后的学生居住地：");
                String address = sc.next();
                s.setName(name);
                s.setAge(age);
                s.setAddress(address);
                System.out.println("修改学生信息成功");
                return;
            }
        }

        System.out.println("你输入的学号有误，请重新输入！");

    }

    //查看学生信息
    public static void getStu(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无信息，请添加信息再查看！");
            return;
        }

        System.out.println("学号\t姓名\t\t\t年龄\t\t居住地");


        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);

            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t\t" + s.getAddress());

        }
    }

}
