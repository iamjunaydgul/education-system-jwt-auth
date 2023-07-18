package com.example.authjwt.service;

import com.example.authjwt.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CourseService {

    private List<Course> courses= new ArrayList<>();

    public CourseService(){

        courses.add(new Course("1", "English", "abc"));
        courses.add(new Course("2", "Math", "abc"));
        courses.add(new Course(UUID.randomUUID().toString(), "Science", "abc"));
        courses.add(new Course(UUID.randomUUID().toString(), "History", "abc"));
    }

    public List<Course> getCourses(){

        return this.courses;
    }

    public Object getCourse(String courseName){

        for (Course course : courses) {
            if(course.getCourseName().equals(courseName)){
                return course;
            }
        }
        return "No Course Found";
    }

    public List<Course> createCourse(Course course){

        this.courses.add(course);
        return this.courses;
    }

    public Object updateCourse(String courseId, Course updatedCourse){

        for (Course course : courses) {
            if(course.getCourseId().equals(courseId)){
                course.setCourseTeacher(updatedCourse.getCourseTeacher());
                course.setCourseName(updatedCourse.getCourseName());
                return course;
            }
        }
        return "No Course Found";
    }

    public List<Course> deleteCourse(String courseName){
        List<Course> updatedList= new ArrayList<>();
        for (Course cours : courses) {
            if(!cours.getCourseName().equals(courseName)){
                updatedList.add(cours);
            }
        }
        return updatedList;
    }
}
