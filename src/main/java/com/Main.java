package com;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        LogAndReg logandreg = new LogAndReg();

        Scanner scan = new Scanner(System.in);

        String com;

        String[] command = {"reg", "log"};

        while (1==1)
        {
            System.out.println("Введите reg или log");
            com = scan.nextLine();
            for(int i = 0; i<=1; i++)
            {
                if (com.startsWith(command[i]))
                {
                    if(com.equals(command[0]))
                    {
                        logandreg.reg();
                    }

                    if(com.startsWith(command[1]))
                    {
                        logandreg.log();
                    }
                }
            }
        }
    }
}
