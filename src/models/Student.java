package models;

public class Student extends Person {
    private Payment payment;

    public Student(String fio, PL pl, int age, String gender, Payment payment) {
        super(fio, pl, age, gender);
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + "\nPayment: " + payment.name().substring(0,1)+payment.name().substring(1).toLowerCase();
    }
}
