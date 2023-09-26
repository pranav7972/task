package com.cjc.ims.app.serviceimpl;

import com.cjc.ims.app.model.*;
import com.cjc.ims.app.servicei.*;
import java.util.*;
import java.util.Scanner;

public class karvenagar implements Cjc {

    Scanner sc = new Scanner(System.in);
    List<Course> clist = new ArrayList<>();
    List<Batch> blist = new ArrayList<>();
    List<Faculty> flist = new ArrayList<>();
    List<Student> slist = new ArrayList<>();

    @Override
    public void addCourse() {
        Course c1 = new Course();
        System.out.print("Enter Course ID: ");
        c1.setCid(sc.nextInt());
        System.out.print("Enter Course Name: ");
        c1.setCname(sc.next());
        clist.add(c1);
        System.out.println("Course added successfully!");
    }

    @Override
    public void viewCourse() {
        System.out.println("List of Courses:");
        for (Course course : clist) {
            System.out.println("Course ID: " + course.getCid() + ", Course Name: " + course.getCname());
        }
    }

    @Override
    public void addFaculty() {
        Faculty faculty = new Faculty();
        System.out.print("Enter Faculty ID: ");
        faculty.setFid(sc.nextInt());
        System.out.print("Enter Faculty Name: ");
        faculty.setFname(sc.next());
        flist.add(faculty);
        System.out.println("Faculty member added successfully!");
    }

    @Override
    public void viewFaculty() {
        System.out.println("List of Faculty Members:");
        for (Faculty faculty : flist) {
            System.out.println("Faculty ID: " + faculty.getFid() + ", Faculty Name: " + faculty.getFname());
        }
    }

    @Override
    public void addBatch() {
        Batch batch = new Batch();
        System.out.print("Enter Batch ID: ");
        batch.setBid(sc.nextInt());
        System.out.print("Enter Batch Name: ");
        batch.setBname(sc.next());
        blist.add(batch);
        System.out.println("Batch added successfully!");
    }

    @Override
    public void viewBatch() {
        System.out.println("List of Batches:");
        for (Batch batch : blist) {
            System.out.println("Batch ID: " + batch.getBid() + ", Batch Name: " + batch.getBname());
        }
    }

    @Override
    public void addStudent() {
        Student student = new Student();
        System.out.print("Enter Student ID: ");
        student.setSid(sc.nextInt());
        System.out.print("Enter Student Name: ");
        student.setSname(sc.next());
        slist.add(student);
        System.out.println("Student added successfully!");
    }

    @Override
    public void viewStudent() {
        System.out.println("List of Students:");
        for (Student student : slist) {
            System.out.println("Student ID: " + student.getSid() + ", Student Name: " + student.getSname());
        }
    }
}
