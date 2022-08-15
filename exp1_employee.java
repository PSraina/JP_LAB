import java.util.Scanner;
public class exp1_employee {
    public static void main (String [] args) {
        double sal, hra, da, cca = 240, pf, pt = 100, gross, net;
        String empname;
        int empno;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");
        empname = sc.nextLine();
        System.out.println("Enter Employee Number: ");
        empno = sc.nextInt();
        System.out.println("Enter Your Basic Salary: ");
        sal = sc.nextDouble();

        hra = (30/100)*sal;
        da = (70/100)*sal;
        pf = (10/100)*sal;
        gross = hra + da + sal + pf + cca;
        net = gross - pf - pt;

        System.out.println("Gross Salary: "+gross);
        System.out.println("Net Salary: "+net);

    }
}