package com.schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement teacher and student in ArrayList
 */
public class School
{
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School()
    {

    }


    public School(List<Teacher> teachers, List<Student> students)
    {
        this.teachers = teachers;
        this.students = students;
        totalMoneySpent = 0;
        totalMoneyEarned = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

    @Override
    public String toString() {
        return "----------School----------\n" +
                "Our school has" + students.size() + " students" +
                "and " + teachers.size() + " teachers\n" +
                "Teacher list\n" + teachers +
                "\nStudent list\n" + students;
    }
}
