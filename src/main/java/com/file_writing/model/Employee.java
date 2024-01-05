package com.file_writing.model;

public class Employee {

    private String name;
    private String salary;
    private Integer age;
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
