package base;/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        float subTotal;
        double taxRate = 0.055;
        double tax = 0;
        double total = 0;
        String state;
        String taxVal;
        String output;

        Scanner stateIn = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("###.##");
        dF.setGroupingUsed(false);

        System.out.print("What is the order amount? ");
        subTotal = stateIn.nextFloat();
        System.out.print("What is the state? ");
        state = stateIn.next();

        if (state.equals("WI"))
        {
            tax = 10 * taxRate;
            total = 10 + (10 * taxRate);

            output = "The subtotal is $" + dF.format(subTotal) + System.lineSeparator() +
                    "The tax is $"+ dF.format(tax) + System.lineSeparator() +
                    "The total is $" + dF.format(total) + ".";
            System.out.print(output);
            System.exit(0);
        }

        output = "The total is $" + dF.format(subTotal) + ".";
        System.out.print(output);
    }
}
