package com.schoolmanagementsystem;

/**
 * This class is responsible to keep the track
 * of students, name, id, fees, fees paid, grade
 */
public class Student extends CommonInfo
{
    private int grade;
    private int feesPaid;
    private int feesTotal = 30000;


    public Student(){

    }

    public Student(int id, String name, int grade)
    {
        super(id, name);
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.grade = grade;
    }
    // not going to alter student's name and id


    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * Use to update the student's grade
     * @param grade new grade
     */

    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    /**
     * keep adding to fees to feesPaid Field
     * update fees
     * @param fees fees that students pay
     */

    public void payFeesPaid(int fees)
    {
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }
    public int getRemainingFees()
    {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "\nStudent: " + getName() +
                "\nid:" + getId() +
                "\ngrade:" + grade +
                "\nfeesPaid: " + feesPaid +
                "\nfeesTotal: " + feesTotal +
                "\nfeesRemaining: " + getRemainingFees();
    }

}


