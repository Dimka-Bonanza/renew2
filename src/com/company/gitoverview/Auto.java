package com.company.gitoverview;

public class Auto extends Person{
    private String autoName;
    private int year;

    public Auto(String autoName, int year) {

        this.autoName = autoName;
        this.year = year;
    }

    public String getAutoName() {
        return autoName;
    }

    public void setAutoName(String autoName) {
        this.autoName = autoName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id= " + super.getCountry()+ "\n" +
                "autoName='" + autoName + '\'' +
                ", year=" + year +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
