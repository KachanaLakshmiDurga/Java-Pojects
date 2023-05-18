package com.main;

import com.students.StudentManagement;
import com.students.Students;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        StudentManagement std=new StudentManagement();
        Students record=new Students();

        record.setId(1);
        record.setName("Durga");
        record.setDepartment("Cse");
        std.addStudent(record);
        int option=0;
        do{
            menu();
            option=o.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter the student id");
                    int id=o.nextInt();
                    System.out.println("Enter the studmet name");
                    String name=o.next();
                    System.out.println("Enter the student department");
                    String department=o.next();
                    record=new Students(id,name,department);
                    std.addStudent(record);
                    System.out.println("Students record is added sucessfully");
                    System.out.println(record.toString());
                    break;
                case 2:
                    System.out.println("Enter the student id");
                    int sid=o.nextInt();
                    if(!std.find(sid)){
                        System.out.println("The student with"+sid+"is not found");
                    }else
                        System.out.println("The student with"+sid+"is  found");
                    break;
                case 3:
                    std.display();
                    break;
                default:
                    System.out.println("\nInvalid input\n");
                    break;

            }
        }
        while(option>2);
    }
    public static void menu(){
        System.out.println("menu");
        System.out.println("1.Add the student record");
        System.out.println("2.Find the student Record");
        System.out.println("3.Display");
    }
}