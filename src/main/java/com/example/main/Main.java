package com.example.main;

import java.util.List;

//import com.example.entity.Exam;
//import com.example.reports.Reports;
import com.example.entity.Exam;
import com.example.entity.Student;
import com.example.reports.ExamResult;
import com.example.reports.Reports;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

//        Student student = new Student();
//        student.setFirstname("John");
//        student.setLastname("White");
//        student.setAge(35);
//
//        session.save(student); //create, insert

//        Student student = session.get(Student.class,1); //select
//        System.out.println(student);
//        student.setAge(40); //update
//        transaction.commit();

    /*
    Query<Student> query = session.createQuery("from Student where id = 2"); //HQL - запрос
    Student student = query.getSingleResult();
    */





    //Student student = session.get(Student.class, 5);

    /*
    Student student = session.load(Student.class, 3);
    System.out.println(student);

    student.setAge(30);

    StudentAddress studentAddress = new StudentAddress();
    studentAddress.setCountry("Ukraine");
    studentAddress.setCity("Odessa");
    studentAddress.setAddress("Observatorniy Lane");

    student.setAddress(studentAddress);

    transaction.commit();
    */

    /*
    Student student = session.get(Student.class, 2);
    Subject subject = session.get(Subject.class, 2);
    Exam exam = new Exam();
    exam.setSubject(subject);
    exam.setStudent(student);
    exam.setGrade(5);
    session.save(exam);
    */

    //System.out.println(exams);
    //System.out.println(student);

        Reports reports = new Reports();
        List<ExamResult> examResults = reports.getExamResults("John", "White", session);

    //List<Exam> exams = reports.getExamsResultsWithCriteria("Doe", "John", session);

        session.close();
        sessionFactory.close();
    }

}
