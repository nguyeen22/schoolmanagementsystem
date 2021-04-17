package com.schoolmanagementsystem;

import java.util.Scanner;

public class Menu
{
    static School school = new School();
    static Scanner input = new Scanner(System.in);
    static String cmd = "YES";
    static int choice;

    public static void menu()
    {


        do {
            displayMenu();
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addTeacher();
                    break;
                case 3:
                    System.out.println("1.Student List\n2.Teacher List");
                    System.out.println("Enter your choice:");
                    int choice1 = input.nextInt();
                    if (choice1 == 1)
                    {
                        System.out.println(school.getStudents());
                    }
                    else
                    {
                        System.out.println(school.getTeachers());
                    }
                    break;
                case 4:
                    System.out.println("1.Pay fees for students.\n2.Pay salary for all teachers\n3.Reward teacher");
                    System.out.println("Enter your choice:");
                    int choice2 = input.nextInt();
                    if (choice2 == 1)
                    {
                        studentPayFees();
                    }
                    else if (choice2 == 2)
                    {
                        payTeacherSalary();
                    }
                    else
                    {
                        rewardTeacher();
                    }
                    break;
                case 5:
                    System.out.println(school);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Choice must be a value between 1 and 6.");
                    break;

            }
        } while (choice != 6);

    }
    public static void displayMenu()
    {
        System.out.println("--------------Menu------------");
        System.out.println("1. Add student");
        System.out.println("2. Add teacher");
        System.out.println("3. Display all students and teachers");
        System.out.println("4. Make payment");
        System.out.println("5. About school");
        System.out.println("6. Exit");
        System.out.printf("Enter your choice from 1-6: ");
    }
    public static void addStudent()
    {
        Student student = new Student();
        System.out.println("Enter a new student? (yes/no)");
        cmd = input.next();
        if (cmd.toUpperCase().equals("YES"))
        {

            System.out.println("Enter student's id");
            int id = input.nextInt();
            student.setId(id);
            System.out.println("Enter student's full name:");
            input.nextLine();
            String name = input.nextLine();
            student.setName(name);
            System.out.println("Enter student's grade");
            int grade = input.nextInt();
            student.setGrade(grade);
            school.addStudents(student);
        }
        //input.close();
        System.out.println("Student's information: ");
        System.out.println(student);
        System.out.println();
    }

    public static void addTeacher()
    {
        Teacher teacher = new Teacher();
        System.out.println("Enter a new teacher? (yes/no)");
        cmd = input.next();
        if (cmd.toUpperCase().equals("YES"))
        {

            System.out.println("Enter teacher's id");
            int id = input.nextInt();
            teacher.setId(id);
            System.out.println("Enter teacher's full name:");
            input.nextLine();
            String name = input.nextLine();
            teacher.setName(name);
            System.out.println("Enter teacher's salary");
            int salary = input.nextInt();
            teacher.setSalary(salary);
            school.addTeachers(teacher);
        }
        //input.close();
        System.out.println("Teacher's information: ");
        System.out.println(teacher);
        System.out.println();
    }

    public static void studentPayFees()
    {
        System.out.println("What is student's id");
        int id = input.nextInt();
        System.out.println("How much?");
        int money = input.nextInt();
        for (Student student : school.getStudents()) {
            if (student.getId() == id)
            {
                student.payFeesPaid(money);
                System.out.println("Pay successfully " + money + "$" );
                System.out.println("The remaining feed is " + student.getRemainingFees());
            }
        }
    }
    public static void payTeacherSalary()
    {
        System.out.println("Pay salary for all teachers? (yes/no)");
        cmd = input.next();
        if (cmd.toUpperCase().equals("YES"))
        {
            for (Teacher teacher : school.getTeachers()) {
                teacher.receiveSalary(teacher.getSalary());
            }
        }
        System.out.println("Successfully!");
    }
    public static void rewardTeacher()
    {
        System.out.println("What is teacher's id");
        int id = input.nextInt();
        System.out.println("How much?");
        int money = input.nextInt();
        for (Teacher teacher : school.getTeachers())
        {
            if (teacher.getId() == id)
            {
                teacher.receiveSalary(money);
                System.out.println("Teacher " + teacher.getName() + "is rewarded $" + money);
            }

        }
    }

}
