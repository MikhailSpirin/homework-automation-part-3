package com.wix.automationtraining;

/**
 * Created by mikhails on 15.08.2016
 */

public class CollegeStudent extends Person{
    public CollegeStudent(String name, Address address, int id, int age, int year, Major major) {
        super(name, address, id, age);
        setMajor(major);
        setYear(year);
    }

    public enum Major {
        DEFAULT("Undeclared"),
        ELECTRICAL("Electrical Engineering"),
        COMMUNICATIONS("Communications");
        private final String major;
        Major(String major) {
            this.major = major;
        }
    }

    private int year;
    private Major major = Major.DEFAULT;

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString(){
        return "Person:" + super.toString() + "| Major:" + this.major + " Year:" + this.year;
    }

    @Override
    public boolean equals(Object collegeStudent){
        // i'm not sure about this - will ask question, how to take into
        //   consideration super classes in equals methods
        //
        // later: may be wrong, as equals says false on two same instances

        Person castPerson = (Person) collegeStudent;
        CollegeStudent castCollegeStudent = (CollegeStudent) collegeStudent;

        return super.equals(castPerson) &&
                castCollegeStudent.year == this.year &&
                castCollegeStudent.major == this.major;

    }
}
