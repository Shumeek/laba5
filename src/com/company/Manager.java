package com.company;

public class Manager extends Employee {
    double bonus;

    public Manager(String name,String surname,double bonus) {
        super(name,surname);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSal() {
        return this.salary + this.bonus;
    }

    public String toString(){
        return "У менеджера " + this.name + " " + this.surname + " номер " + this.id +  " зарплата равна = " + this.salary + " долларов и бонус составляет  = " + this.bonus+ " долларов";
    }
}
