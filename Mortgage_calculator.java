package com.cyberspace;
 
import java.text.NumberFormat;
import java.util.Scanner;

public  class  Main{
    public static void{(String[]  args) {
        final byte MONTH_IN_YEAR = 12;
        final PERCENT  = 100;

        Scanner scanner  = new Scanner(system.in);

        system.out.println("Principal: ");
        int principal = scanner.nextInt();
        
        system.out.println("Annual Intrest Rate: ");
        float annualInterest  = scanner.nextFloat();
        float  monthlyInterest = annualInterest / PERCENT  /MONTH_IN_YEAR;

        system.out.print("Period  (Years): ");
        byte  years = scanner.nextByte();
        int numberOfPayments  =  years * MONTH_IN_YEAR;

        double mortage  = principal  * (monthlyInterest  * Math.pow(1 + monthlyInterest, numberOfPayments ))  / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortageFormatted  =  NumberFormat.getCurrencyInstance();

        system.out.println("Mortgage: " + mortageFormatted);
    }
}