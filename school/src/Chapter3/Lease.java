package ATC;

import javax.swing.*;
import java.util.*;
import java.time.*;

public class Lease
{
    String tenantName;
    String apartmentNum;
    int rentAmount;
    int term;

    public Lease()
    {
        tenantName = "XXX";
        apartmentNum = "0";
        rentAmount = 1000;
        term = 12;
    }

    public void setTenantName(String name)
    {
        this.tenantName = name;
    }

    public String getTenantName()
    {
        return this.tenantName;
    }


    public void setApartmentNum(String num)
    {
        this.apartmentNum = num;
    }

    public String getApartmentNum()
    {
        return this.apartmentNum;
    }


    public void setRentAmount(int amount)
    {
        this.rentAmount = amount;
    }

    public int getRentAmount()
    {
        return this.rentAmount;
    }


    public void setTerm(int term)
    {
        this.term = term;
    }

    public int getTerm()
    {
        return this.term;
    }

    public void addPetFee()
    {
        this.rentAmount += 10.00;
    }

    public static void explainPetPolicy()
    {
        System.out.println("There is a $10 pet fee");
    }


}

