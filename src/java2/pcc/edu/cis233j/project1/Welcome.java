package java2.pcc.edu.cis233j.project1;

import java.util.Date;

/**
 * Simple Text Printing Class to produce Welcome message
 * for my first IntelliJ project
 * Creator Christopher Williams -CIS 233j
 * 02-06-2017
 *
 */
public class Welcome {
    public static void main(String[] args)  {
        System.out.println("Welcome to my first Project");
        System.out.println(new Date());
        int i, j, k;
        for(i=5;i>=1;i--)
        {
            for(j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<(i*2);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

        }
