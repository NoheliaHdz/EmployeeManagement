package Application;

import Business.Engineer;
import Business.Marketing;
import Classes.Employye;
import Classes.Supervisor;
import Classes.Colaborador;
import Utils.Information;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Employye emp1 = new Employye("Carlos","Rodriguez","89389636",20,"carloro09@gmail.com");
        emp1.setEmail("carloro09@gmail.com");
        System.out.println(emp1.getEmail());
        emp1.setEmail("$carol.hdq 15");
        System.out.println(emp1.getEmail());

        Supervisor e1 = new Supervisor("1000","Uayeb", "Caballero", 1000,"uayedC@gmail.com");
        Supervisor e2 = new Supervisor("1112", "Ixchel", "Rodriguez", 33,"Ix65@gmail.com");
        Colaborador c1 = new Colaborador("1111", "Imix", "Rodriguez", 33,"im28@gmail.com");
        Colaborador c2 = new Colaborador("1113", "Max", "Lazo", 35,"maxl@gmail.com");
        c1.setMi_supervisor(e1);

        c1.AddNewLanguage("PHP");
        c1.AddNewLanguage("NODE");
        c1.AddNewLanguage("SCALA");
        c1.AddNewLanguage("R");

        c1.PrintMyLanguages();

        e1.AssignNewEmployee(c1);
        e1.PrintEmployees();
        e2.AssignNewEmployee(c2);

        System.out.println( c1.getSalaryInfo() );
        e1.setEmployeeSalary(c1, 5000);
        System.out.println( c1.getSalaryInfo() );
        e2.setEmployeeSalary(c1, 7000);

        Engineer engineer = new Engineer("Ingenieria de Procesos", e1);
        Marketing marketing = new Marketing("Mercado Cuantitativo", e2);

        engineer.MainActivities();
        marketing.MainActivities();

        e1.setBu(engineer);
        e2.setBu(marketing);
        e1.getBu().MainActivities();
        e2.getBu().MainActivities();
        System.out.println(e1.getBu().getSupervisor().Presentation());
        System.out.println(e2.getBu().getSupervisor().Presentation());
        Information.MainHolidays();

        System.out.println(Information.SALARY_SUPERVISOR_TAX_PERCENTAGE);

        System.out.println("METODOS REALIZADOS EN STATIC");
        System.out.println(Information.CalcularImpuestoColaborador(10002.4));
        Information.MainGerarquia();


    }
}
