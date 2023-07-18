package com.example.authjwt.controller;

import com.example.authjwt.model.Course;
import com.example.authjwt.model.Student;
import com.example.authjwt.model.User;
import com.example.authjwt.service.CourseService;
import com.example.authjwt.service.StudentService;
import com.example.authjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class APIController {

    @Autowired
    private UserService userService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private StudentService studentService;

    @GetMapping("/users")
    public List<User> getUser(){

        System.out.println("getting users");
        return this.userService.getUsers();
    }

    /*REST Web Service for Courses*/
    @GetMapping("/courses")
    public List<Course> getCourses(){

        System.out.println("getting courses");
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseName}")
    public Object getCourse(@PathVariable String courseName){

        System.out.println("getting course");
        return this.courseService.getCourse(courseName);
    }

    @PostMapping(path = "courses",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Course> createCourse(@RequestBody Course course){

        System.out.println("saving course");
        return this.courseService.createCourse(course);
    }

    @PutMapping(path = "courses/{courseId}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Object updateCourse(@PathVariable String courseId, @RequestBody Course course){

        System.out.println("updating course");
        return this.courseService.updateCourse(courseId, course);
    }

    @DeleteMapping("/courses/{courseName}")
    public List<Course> deleteCourse(@PathVariable String courseName){

        System.out.println("deleting course");
        return this.courseService.deleteCourse(courseName);
    }

    /*REST Web Service for Students*/
    @GetMapping("/students")
    public List<Student> getStudents(){

        System.out.println("getting students");
        return this.studentService.getStudents();
    }

    @GetMapping("/students/{studentName}")
    public Object getStudent(@PathVariable String studentName){

        System.out.println("getting student");
        return this.studentService.getStudent(studentName);
    }

    @PostMapping(path = "students",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> createStudent(@RequestBody Student student){

        System.out.println("saving student");
        return this.studentService.createStudent(student);
    }

    @PutMapping(path = "students/{studentId}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Object updateStudent(@PathVariable String studentId, @RequestBody Student student){

        System.out.println("updating student");
        return this.studentService.updateStudent(studentId, student);
    }

    @DeleteMapping("/students/{studentName}")
    public List<Student> deleteStudent(@PathVariable String studentName){

        System.out.println("deleting student");
        return this.studentService.deleteStudent(studentName);
    }
}
