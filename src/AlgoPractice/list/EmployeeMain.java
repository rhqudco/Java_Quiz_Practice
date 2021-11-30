package AlgoPractice.list;

import java.util.ArrayList;

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>(5);
        Employee employee1 = new Employee(100, "김사원", 3300.55);
        Employee employee2 = new Employee(101, "박대리", 4100.20);
        Employee employee3 = new Employee(102, "최과장", 5100.55);

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println("리스트 사이즈   : " + list.size());
        System.out.println();
        System.out.println("리스트 내부 목록 : " + list);

        System.out.println();
        System.out.println("출력 1");
        for(int i = 0; i < list.size(); i++) {
            Employee emp = list.get(i);
            System.out.println(emp);
        }
        System.out.println();
        System.out.println("출력 2");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
