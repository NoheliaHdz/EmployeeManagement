package Application;

import Classes.Employye;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Employye emp = new Employye();
        Employye emp1 = new Employye("Carlos","Rodriguez","89389636",20,"carloro09@gmail.com");
        emp1.setEmail("carloro09@gmail.com");
        System.out.println(emp1.getEmail());
        emp.setEmail("$carol.hdq 15");
        System.out.println(emp.getEmail());


    }
}
