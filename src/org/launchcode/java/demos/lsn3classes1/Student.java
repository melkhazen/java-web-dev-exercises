package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }
    public int getStudentId(){
        return studentId;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public double getGpa() {
        return gpa;
    }
    public void setName(String aName) {
        name = aName;
    }
    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }
    private void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }
    private void setGpa(double aGpa) {
        gpa = aGpa;
    }

    public static void main(String[] args) {
        Student mohamed = new Student("mohamed", 1, 1, 4.0);
    }

}