package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;


public class task11 {

            public static void main( String[] args )
            {
                List<Student> studentList = new ArrayList<Student>();
                studentList.add(new Student("Sam", 1));
                studentList.add(new Student("Olya", 2));
                studentList.add(new Student("Student3", 3));
                studentList.add(new Student("Ksenia", 4));
                studentList.add(new Student("Anna", 5));

                System.out.println("Find a student by course, enter course");
                Student.printStudents(studentList, new Scanner(System.in).nextInt());

                System.out.println("List sorted by course");
                Collections.sort(studentList, Student.studentByCourseComparator);
                Student.printAllStudents(studentList);

                System.out.println("List sorted by name");
                Collections.sort(studentList, Student.studentByNameComparator);
                Student.printAllStudents(studentList);
            }
        }

