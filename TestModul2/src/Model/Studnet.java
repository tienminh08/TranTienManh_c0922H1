package Model;

import java.io.Serializable;

public class Studnet implements Serializable {
    private String IDstudent;
    private String Name;
    private int Age;
    private String Gender;
    private String address;
    private double average;

    public Studnet(String IDstudent, String name, int age, String gender, String address, double average) {
        this.IDstudent = IDstudent;
        Name = name;
        Age = age;
        Gender = gender;
        this.address = address;
        this.average = average;
    }

    public Studnet() {
    }

    public String getIDstudent() {
        return IDstudent;
    }

    public void setIDstudent(String IDstudent) {
        this.IDstudent = IDstudent;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Studnet{" +
                "IDstudent='" + IDstudent + '\'' +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Gender='" + Gender + '\'' +
                ", address='" + address + '\'' +
                ", average=" + average +
                '}';
    }
}
