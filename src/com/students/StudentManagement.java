
package com.students;
import java.util.*;

public class StudentManagement {
    private List<Students> studentsList;
    public StudentManagement(){
        studentsList=new ArrayList<>();
    }
    public boolean find(int studentId){
       for(Students s:studentsList){
           if(s.getId()==studentId) {
               System.out.println(s);
               return true;
           }
       }
       return false;
    }
    public void addStudent(Students student){
       if(!find(student.getId())){
           studentsList.add(student);
       }
       else{
           System.out.println("The student is already found");
       }
    }
    public void display(){
        if (studentsList.isEmpty()) {
            System.out.println("The list has no records\n");
        }
        for(Students student:studentsList){
            System.out.println(student.toString());
        }
    }


}
