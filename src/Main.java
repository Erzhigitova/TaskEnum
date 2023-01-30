import models.*;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        PL[] pls = PL.values();
        for (PL pl: pls) {
            System.out.println(pl.ordinal() +". "+ pl.name());
        }
        System.out.println("---------------------------------");
        Person gulzina = new Student("Gulzina Erzhigitova", PL.JAVA, 22, "Female", Payment.HALFPAYED);
        Person danill = new Student("Danill Protopopov", PL.valueOf("JAVA"), 20, "Male", Payment.PAYED);
        Person meerim = new Student("Meerim Akmatova", PL.FLUTTER, 19, "Female", Payment.FREE);

        Person iskandar = new Mentor("Iskandar Dadabaev", PL.JAVA, 29, "Male", Degree.MIDDLE);
        Person dima = new Mentor("Dmitry Ivanov", PL.JAVA, 20, "Male", Degree.JUNIOR);
        Person adam = new Mentor("Adam Tomson", PL.valueOf("PYTHON"), 35, "Male", Degree.SENIOR);

        Person[] people = new Person[]{iskandar, dima, adam, gulzina, danill, meerim};
        for (Person p: people) {
            System.out.println(p+"\n");
        }
    }
}
