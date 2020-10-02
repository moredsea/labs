import lesson4.*;

import java.util.List;

public class test {
    public static void main(String[] args) {
        String a;
        Company kartoshka = new Company(180,80,10);
        List<Employee> print1 = kartoshka.getTopSalaryStaff(10);
        for(int i=0;i<10;i++) {
            a = print1.get(i).toString();
        }
        System.out.println("-------------------------------------------------");
        List<Employee> print2 = kartoshka.getLowestSalaryStaff(30);
        for(int i=0;i<30;i++) {
            a = print2.get(i).toString();
        }
        System.out.println("AfterFire");
        for(int i=0;i<135;i++)
            kartoshka.fire();
        List<Employee> print3 = kartoshka.getTopSalaryStaff(10);
        for(int i=0;i<10;i++) {
            a = print3.get(i).toString();
        }
        System.out.println("-------------------------------------------------");
        List<Employee> print4 = kartoshka.getLowestSalaryStaff(30);
        for(int i=0;i<30;i++) {
            a = print4.get(i).toString();
        }
    }
}
