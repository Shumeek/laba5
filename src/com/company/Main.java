package com.company;

public class Main {

    public static void main(String[] args) {
        Manager manager1 = new Manager("Yehor","Shum",200);
        Manager manager2 = new Manager("Oleh","Tsubin",130);
        Employee employee1 = new Employee("Ondrei","Maltsev");
        Employee employee2 = new Employee("Nikita","Black");
        Employee employee3 = new Employee("Max","Basow");
        Manager manager3 = new Manager("Ortem","Menya",245);
        Manager manager4 = new Manager("Denis","Guru",321);
        Manager manager5 = new Manager("Kuira","Shaman",67);
        Manager manager6 = new Manager("Vlad","Skripka",593);
        Employee employee4 = new Employee("Sasha","Petrusha");
        manager2.setManager(manager1);
        employee1.setManager(manager2);
        employee2.setManager(manager2);
        employee3.setManager(manager1);
        manager4.setManager(manager3);
        manager5.setManager(manager4);
        manager6.setManager(manager5);
        employee4.setManager(manager6);

        employee2.getManagerName();
        System.out.println(employee2.getTopManager(employee2.getManager()).toString());
    }
}
