package com.example.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremented
    @Column(name = "id")
    private int id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Embedded
    private StudentAddress address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private Set<Exam> exams;

    public int getId() {
    return id;
    }

    public void setId(int id) {
    this.id = id;
    }

    public String getFirstName() {
    return firstName;
    }

    public void setFirstName(String firstName) {
    this.firstName = firstName;
    }

    public String getLastName() {
    return lastName;
    }

    public void setLastName(String lastName) {
    this.lastName = lastName;
    }

    public int getAge() {
    return age;
    }

    public void setAge(int age) {
    this.age = age;
    }

    public StudentAddress getAddress() {
    return address;
    }

    public void setAddress(StudentAddress address) {
    this.address = address;
    }
//
    public Set<Exam> getExams() {
    return exams;
    }

    public void setExams(Set<Exam> exams) {
    this.exams = exams;
    }

    @Override
    public String toString() {
    return "Student{" +
        "id=" + id +
        ", firstname='" + firstName + '\'' +
        ", lastname='" + lastName + '\'' +
        ", age=" + age +
        ", address=" + address +
        ", exams=" + exams +
        '}';
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", firstname='" + firstName + '\'' +
//                ", lastname='" + lastName + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
