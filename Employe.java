import java.awt.*;
import java.util.Objects;

public class Employe {
    String name;
    int age;
    int salary;

    public Employe(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return age == employe.age &&
                salary == employe.salary &&
                Objects.equals(name, employe.name);
    }

    public static void main(String[] args)
    {
        Employe p1 = new Employe("Lukasz", 34, 4300);
        Employe p2 = new Employe("Ania", 33, 4444);
        Employe p3 = new Employe("Lukasz", 34, 4300);
        Employe p4 = new Employe("Franek", 55, 3342);
        Menager m1 = new Menager("bos",40,5000, 4000);


        for (int i = 0; i < 10000; i++) {
            if (!p1.equals(p3))
            {
                System.out.println("Ten sam chłop ");
            }
            else
            {
                System.out.println("To nie ten sam chłop ");
            }
        }

    }
}

class Menager extends Employe
{
    int salaryBonus;
    public Menager(String name, int age, int salary, int salaryBonus)
    {
        super(name, age, salary);
        this.salaryBonus = salaryBonus;
    }

    @Override
    public String toString()
    {
        return "Menager{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", salaryBonus=" + salaryBonus +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Menager menager = (Menager) o;
        return salaryBonus == menager.salaryBonus;
    }
}

