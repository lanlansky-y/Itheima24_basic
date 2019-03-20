package homeWork.myBookSystem;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 利用面向对象的思想设计一个图书管理系统。图书的属性有：编号，书名，
 * 作者，价格。要求提供如下功能：
 * 1、提供操作菜单，可以选择要进行的操作。
 * 2、可以添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。
 * 3、可以查询图书，显示所有图书信息，然后返回到菜单。
 * 4、可以根据书名，查询单本图书信息，显示信息后，返回到菜单。
 * 5、可以删除图书，通过编号删除，删除成功后，返回到菜单。
 * 6、可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。
 * 7、可以退出系统，结束程序运行。
 */
public class myBookSystem {
    public static void main(String[] args) {
        ArrayList<MyBook> list = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            //1、提供操作菜单，可以选择要进行的操作。
            System.out.println("**********欢迎来到黑马图书管理系统**********");
            System.out.println("1 添加图书");
            System.out.println("2 查询所有图书");
            System.out.println("3 查询单本图书");
            System.out.println("4 删除图书");
            System.out.println("5 修改图书信息");
            System.out.println("6 退出系统");
            System.out.println("请输入你的选择：");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();

            switch (choice) {
                case "1":
                    addBook(list);
                    break;
                case "2":
                    getAll(list);
                    break;
                case "3":
                    getOne(list);
                    break;
                case "4":
                    removeBook(list);
                    break;
                case "5":
                    updateBook(list);
                    break;
                case "6":
                    //7、可以退出系统，结束程序运行。
                    System.out.println("感谢使用，再见");
                    flag = false;
                    break;
                default:
                    System.out.println("你的输入有误，请重新输入！");
                    break;
            }
        }

    }

    //2、可以添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。
    public static void addBook(ArrayList<MyBook> list) {
        String id;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要添加的图书编号：");
            id = sc.next();
            boolean b = isUsed(list, id);
            if (b) {
                System.out.println("你输入的图书编号已经存在，请更换一个编号并重新输入！");
            } else {
                break;
            }
        }
        System.out.println("请输入你要添加的书名：");
        String bookName = sc.next();
        System.out.println("请输入你要添加的作者：");
        String author = sc.next();
        System.out.println("请输入你要添加的价格：");
        String price = sc.next();

        MyBook book = new MyBook(id, bookName, author, price);
        list.add(book);
        System.out.println("添加图书成功！");
    }

    public static boolean isUsed(ArrayList<MyBook> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            MyBook book = list.get(i);
            if (book.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    //3、可以查询图书，显示所有图书信息，然后返回到菜单。
    public static void getAll(ArrayList<MyBook> list) {
        if (list.size() == 0) {
            System.out.println("系统中暂无图书，请先添加图书！");
            return;
        }
        //输出表头
        System.out.println("编号\t书名\t作者\t价格");
        for (int i = 0; i < list.size(); i++) {
            MyBook book = list.get(i);
            System.out.println(book.getId() + "\t" + book.getBookName() + "\t" + book.getAuthor() + "\t" + book.getPrice());
        }

    }

    //4、可以根据书名，查询单本图书信息，显示信息后，返回到菜单。
    public static void getOne(ArrayList<MyBook> list) {
        if (list.size() == 0) {
            System.out.println("系统中暂无图书，请先添加图书！");
            return;
        }
        System.out.println("请输入要查询的书名：");
        Scanner sc = new Scanner(System.in);
        String bookName = sc.next();
        boolean b = false;
        for (int i = 0; i < list.size(); i++) {
            MyBook book = list.get(i);
            if (book.getBookName().equals(bookName)) {
                System.out.println("编号\t书名\t作者\t\t价格");
                System.out.println(book.getId() + "\t" + book.getBookName() + "\t" + book.getAuthor() + "\t" + book.getPrice());
                b = true;
            }
        }
        if (b == false) {
            System.out.println("查无此书");
        }
    }

    //5、可以删除图书，通过编号删除，删除成功后，返回到菜单。
    public static void removeBook(ArrayList<MyBook> list) {
        if (list.size() == 0) {
            System.out.println("系统中暂无图书，请先添加图书！");
            return;
        }
        System.out.println("请输入你要删除的图书编号：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            MyBook book = list.get(i);
            if (book.getId().equals(id)) {
                list.remove(book);
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("你输入的图书编号有误，请重新输入！");
    }

    //6、可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。
    public static void updateBook(ArrayList<MyBook> list) {
        if (list.size() == 0) {
            System.out.println("系统中暂无图书，请先添加图书！");
            return;
        }
        System.out.println("请输入你要修改的图书的编号：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            MyBook book = list.get(i);
            if(book.getId().equals(id)){
                System.out.println("请输入修改后的书名：");
                String bookName=sc.next();
                System.out.println("请输入修改后的作者：");
                String author=sc.next();
                System.out.println("请输入修改后的价格：");
                String price=sc.next();
                book.setBookName(bookName);
                book.setAuthor(author);
                book.setPrice(price);
                System.out.println("图书信息修改成功！");
                return;
            }
        }
        System.out.println("你输入的图书编号有误，请重新输入！");
    }
}
