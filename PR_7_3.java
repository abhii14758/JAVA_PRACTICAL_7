/* Created By 21CE013 ABHI BHIMANI
Question : Personal Loan Eligibility Criteria for Salaried Applicant is as follows:
Eligible Age Group - 21 years to 60 years
Minimum Net Monthly Income - Rs. 15,000
Minimum Total Work Experience - 1 year
Citizenship – Indian
Create a class AccountHolder to store above given information entered by a user. Create 5
objects of AccountHolder class and store them in an ArrayList. Display names of account
holders , who are eligible to get a loan based on given criteria */

import java.util.*;

class AccountHolder
{
    private int age;
    private float monthly_income;
    private int work_experience;
    private String citizenship;

    AccountHolder(int age,float monthly_income,int work_experience,String citizenship)
    {
        this.age=age;
        this.monthly_income=monthly_income;
        this.work_experience=work_experience;
        this.citizenship=citizenship;
    }

    boolean isEligible()
    {
        if(this.age>=21 && this.age<=60 && this.monthly_income>=15000 && this.work_experience>=1 && this.citizenship.equals("Indian"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class PR_7_3
{
    public static void main(String... args)
    {
        ArrayList<AccountHolder> arr=new ArrayList<AccountHolder>();

        arr.add(new AccountHolder(28,50000,3,"Indian"));
        arr.add(new AccountHolder(48,25000,20,"Indian"));
        arr.add(new AccountHolder(31,1000,1,"American"));
        arr.add(new AccountHolder(18,20000,0,"Indian"));
        arr.add(new AccountHolder(43,5200,5,"Pakistani"));

        for(AccountHolder A:arr)
        {
            if(A.isEligible())
            {
                System.out.println("Eligible for loan");
            }
            else
            {
                System.out.println("Not Eligible fot loan");
            }
        }
    }
}
