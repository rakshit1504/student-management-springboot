package com.example.studentapp;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentService {
    private Map<Integer, Student> studentData = new HashMap<>();

    public StudentService() {
        studentData.put(1, new Student(1, "Rakshit", "CSE"));
        studentData.put(2, new Student(2, "Aarav", "AI"));
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(studentData.values());
    }

    public Student getStudent(int id) {
        return studentData.get(id);
    }

    public Student addStudent(Student s) {
        studentData.put(s.getId(), s);
        return s;
    }

    public Student updateStudent(int id, Student s) {
        studentData.put(id, s);
        return s;
    }

    public void deleteStudent(int id) {
        studentData.remove(id);
    }
}
