package models;

import java.util.Locale;

public abstract class Person {
    private String fio;
    private PL pl;
    private int age;
    private String gender;

    public Person(String fio, PL pl, int age, String gender) {
        this.fio = fio;
        this.pl = pl;
        this.age = age;
        this.gender = gender;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public PL getPl() {
        return pl;
    }

    public void setPl(PL pl) {
        this.pl = pl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nFIO: " + fio+
                "\nProgramming language: " + pl.name().substring(0,1) + pl.name().substring(1).toLowerCase() +
                "\nAge: " + age +
                "\nGender: " + gender;
    }
}
