package models;

public class Mentor extends Person {
    private Degree degree;

    public Mentor(String fio, PL pl, int age, String gender, Degree degree) {
        super(fio, pl, age, gender);
        this.degree = degree;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Mentor: " + super.toString() + "\nDegree: " + degree.name().substring(0,1) + degree.name().substring(1).toLowerCase();
    }
}
