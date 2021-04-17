package com.schoolmanagementsystem;

public class Teacher extends CommonInfo
{
    private int salary;
    private int salaryEarned;

    public Teacher()
    {

    }

    public Teacher(int id, String name, int salary)
    {
        super(id, name);
        this.salary = salary;
        this.salaryEarned = 0;
    }



    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    /**
     * add salary
     * remove from total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary)
    {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "\nTeacher: " + getName() +
                "\nid:" + getId() +
                "\nsalary:" + salary +
                "\nsalaryEarned: " + salaryEarned;
    }
}
