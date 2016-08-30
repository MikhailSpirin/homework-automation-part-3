package com.wix.automationtraining;

/**
 * Created by mikhails on 15.08.2016
 */
public class Student extends Person {

    public Student(String name, Address address, int id, int age, int studentID, double gradeAverage) {
        super(name, address, id, age);
        setStudentID(studentID);
        setGradeAverage(gradeAverage);
    }

    private int studentID;
    private double gradeAverage;
    private int justifiedAbsenceCounter;
    private int notJustifiedAbsenceCounter;
    private int latenessCounter;

    // getters
    public int getStudentID() {
        return studentID;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    public int getLatenessCounter() {
        return latenessCounter;
    }

    public int getJustifiedAbsenceCounter() {
        return justifiedAbsenceCounter;
    }

    public int getNotJustifiedAbsenceCounter() {
        return notJustifiedAbsenceCounter;
    }

    // setters
    public void setGradeAverage(double gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    // setters for absence / lateness are absent - those values can be set only via "add" methods (increment by 1)

    public void addJustifiedAbsence() {
        this.justifiedAbsenceCounter++;
    }
    public void addNotJustifiedAbsence() {
        this.notJustifiedAbsenceCounter++;
    }
    public void addLateness() {
        this.latenessCounter++;
    }
    public boolean getStudentState() {
        return (this.latenessCounter < 5) &&
                (this.notJustifiedAbsenceCounter < 5) &&
                (((this.notJustifiedAbsenceCounter)/(this.notJustifiedAbsenceCounter + this.justifiedAbsenceCounter)) < 0.1);
    }
    public String getStudentAverageGrade() {
        if (this.gradeAverage > 90) {
            return "Bravo! You are an excellent student";
        } else if (this.gradeAverage > 70) {
            return "You are a good student";
        } else if (this.gradeAverage > 50) {
            return "you can do better";
        }
        return "Unfortunately you need to repeat the whole year again";
    }

    @Override
    public String toString(){
        return "Person:" + super.toString() + "| Student id: " + this.studentID + " gradeAverage:" + this.gradeAverage;
    }

    @Override
    public boolean equals(Object student){
        // i'm not sure about this - will ask question, how to take into
        //   consideration super classes in equals methods
        //
        // later: may be wrong, as equals says false on two same instances

        Student castStudent = (Student) student;

        return super.equals(student) &&
                castStudent.getStudentID()==(this.studentID) &&
                castStudent.getGradeAverage()==this.gradeAverage;
    }
}
