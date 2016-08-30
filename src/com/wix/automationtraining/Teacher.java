package com.wix.automationtraining;

/**
 * Created by mikhails on 15.08.2016
 */

public class Teacher extends Person {
    public Teacher(String name, Address address, int id, int age, int  degree, int salary, Subject subject) {
        super(name, address, id, age);
        setSalary(salary);
        setSubject(subject);
        setDegree(degree);
    }

    public enum Subject {
        DEFAULT("Other"),
        COMPUTER_SCIENCE("Computer Science"),
        ENGLISH("English"),
        CHEMISTRY("Chemistry");
        private final String subject;
        Subject(String subject) {
            this.subject = subject;
        }
    }

    private int degree = 0;
    private int salary;
    private Subject subject = Subject.DEFAULT;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public String getDegree() {
        switch (this.degree) {
            case 0: return "No Degree";
            case 1: return "BA Degree";
            case 2: return "Master Degree";
            case 3: return "Ph.D Degree";
        }
        return "Wrong degree ID";
    }

    @Override
    public String toString(){
        return "Person:" + super.toString() + "| Salary:" + this.salary +
                " Degree:" + this.degree + " Subject:" + this.subject;
    }

    @Override
    public boolean equals(Object teacher){
        // i'm not sure about this - will ask question, how to take into
        //   consideration super classes in equals methods
        //
        // later: may be wrong, as equyals says false on two same instances

        Teacher castTeacher = (Teacher) teacher;

        return super.equals(teacher) &&
                castTeacher.salary == this.salary &&
                castTeacher.degree == this.degree &&
                castTeacher.subject == this.subject;
    }
}
