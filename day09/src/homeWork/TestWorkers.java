package homeWork;

import java.util.ArrayList;

/**
 * 有如下员工信息：
 * 姓名：张三，工资：3000
 * 姓名：李四，工资：3500
 * 姓名：王五，工资：4000
 * 姓名：赵六，工资：4500
 * 姓名：田七，工资：5000
 *
 * 先需要将所有的员工信息都存入ArrayList集合中，并完成如下操作：
 * 1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”
 * 2、判断是否有姓名为“赵六”的员工，如果有，将其删除
 * 3、给姓名为“田七”的员工，涨500工资
 */
public class TestWorkers {

    public static void main(String[] args) {
        ArrayList<Workers> list = new ArrayList<>();
        Workers w1 = new Workers("张三",3000);
        Workers w2 = new Workers("李四",3500);
        Workers w3 = new Workers("王五",4000);
        Workers w4 = new Workers("赵六",4500);
        Workers w5 = new Workers("田七",5000);

        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        list.add(w5);

        for (int i = 0; i < list.size(); i++) {
            Workers workers = list.get(i);
            if(workers.getName().equals("王五")){
                workers.setName("王小五");
            }
            if(workers.getName().equals("赵六")){
                list.remove(workers);
                i--;
            }
            if(workers.getName().equals("田七")){
                workers.setSalary(workers.getSalary()+500);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}

class Workers{
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Workers(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Workers() {
    }

    @Override
    public String toString() {
        return "Workers{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
