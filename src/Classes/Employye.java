package Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employye {
    private String name;
    private String lastname;
    private int age;
    private String id;
    private String email;

    public Employye(String na, String lastna, String id, int ag,String emai){
        this.name=na;
        this.lastname=lastna;
        this.age=ag;
        this.id=id;
        this.email=emai;
    }

    public Employye(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = pat.matcher(email);
        if(mat.find()){
            System.out.println("Correo Válido");
        }else{
            System.out.println("Correo No Válido");
        }
        this.email = email;
    }
}

