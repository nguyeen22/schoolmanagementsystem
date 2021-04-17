package com.schoolmanagementsystem;

public class Main extends Menu
{
    public static void main(String[] args)
    {
       menu();
    }

    /**public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melisa = new Teacher(2,"Melisa",700);
        Teacher bob = new Teacher(3, "Bob", 1000);
        Teacher mama = new Teacher(4, "Mama", 1000);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melisa);
        teacherList.add(bob);


        Student nguyen = new Student(1,"Nguyen", 10);
        Student richard = new Student(2,"Richard", 10);
        Student linh = new Student(3,"Linh", 8);
        Student nadal = new Student(4,"Nadal", 9);

        List<Student> studentList = new ArrayList<>();
        studentList.add(nguyen);
        studentList.add(richard);
        studentList.add(nadal);
        studentList.add(linh);

        School vinschool = new School(teacherList, studentList);
        System.out.println("Vinschool has earned " + vinschool.getTotalMoneyEarned());

        nguyen.payFeesPaid(5000);
        nadal.payFeesPaid(10000);
        nguyen.payFeesPaid(15000);
        nguyen.payFeesPaid(22222);
        System.out.println("Vinschool has earned " + vinschool.getTotalMoneyEarned());
        System.out.println("Tuition fees Nadal has to pay is ");
        System.out.println(nadal.getRemainingFees());

        System.out.println("-------Making school pay salary");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("Vinschool has spent for salary to " + lizzy.getName()
                + " and now has " + vinschool.getTotalMoneyEarned());

        System.out.println(nadal);
        melisa.receiveSalary(melisa.getSalary() * 2);
        System.out.println(melisa);

        vinschool.addTeachers(mama);
        System.out.println(mama);






    }**/
}
