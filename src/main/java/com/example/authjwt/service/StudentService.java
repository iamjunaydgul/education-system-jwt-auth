package com.example.authjwt.service;

import com.example.authjwt.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    private List<Student> students= new ArrayList<>();

    public StudentService(){

        students.add(new Student("1", "student1", "student1@gmail.com", "123", "123 Street"));
        students.add(new Student("2", "student2", "student2@gmail.com", "456", "456 Street"));
        students.add(new Student(UUID.randomUUID().toString(), "student3", "student3@gmail.com", "789", "789 Street"));
        students.add(new Student(UUID.randomUUID().toString(), "student4", "student4@gmail.com", "111", "111 Street"));
    }

    public List<Student> getStudents(){

        return this.students;
    }

    public Object getStudent(String studentName){

        for (Student student : students) {
            if(student.getStudentName().equals(studentName)){
                return student;
            }
        }
        return "No Student Found";
    }

    public List<Student> createStudent(Student student){

        this.students.add(student);
        return this.students;
    }

    public Object updateStudent(String studentId, Student updateStudent){

        for (Student student : students) {
            if(student.getStudentId().equals(studentId)){
                student.setStudentName(updateStudent.getStudentName());
                student.setStudentEmail(updateStudent.getStudentEmail());
                student.setStudentTelephoneNumber(updateStudent.getStudentTelephoneNumber());
                student.setStudentAddress(updateStudent.getStudentAddress());
                return student;
            }
        }
        return "No Student Found";
    }

    public List<Student> deleteStudent(String studentName){
        List<Student> updatedList= new ArrayList<>();
        for (Student student : students) {
            if(!student.getStudentName().equals(studentName)){
                updatedList.add(student);
            }
        }
        return updatedList;
    }
}
