package ATC;

import java.util.*;

public class TestLease
{
    public static void main(String [] args)
    {
        Lease lease1 = new Lease();
        Lease lease2 = new Lease();
        Lease lease3 = new Lease();
        Lease lease4 = new Lease();

        lease1 = getData(lease1);
        lease2 = getData(lease2);
        lease3 = getData(lease3);

        showValues(lease1);
        showValues(lease2);
        showValues(lease3);
        showValues(lease4);

    }

    public static Lease getData(Lease a)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your tenant name");
        a.setTenantName(input.nextLine());

        System.out.println("What is your apartment number?");
        a.setApartmentNum(input.nextLine());

        System.out.println("What is your rent amount?");
        a.setRentAmount(input.nextInt());

        System.out.println("What is the term of your rent?");
        a.setTerm(input.nextInt());

        return a;
    }

    public static void showValues(Lease s)
    {


        System.out.println("Tenant name: " + s.getTenantName() + ", Apt num " + s.getApartmentNum() + " rent amount: " + s.getRentAmount() + ", term of rent: " + s.getTerm());
        s.addPetFee();

    }


}
