package me.remind;

import java.util.Scanner;

/**
 * A class containing the different menus for the console UI
 */
public class Menus
{
    public static int mainMenu()
    {
        int choice;
        
        System.out.println("1.All notes");
        System.out.println("2.Reminders");
        System.out.println("3.Archive");
        System.out.println("4.Add notes");
        System.out.println("5.Mark list items");
        System.out.println("6.Pin note");
        System.out.println("7.Unpin note");
        System.out.println("8.Archive note");
        System.out.println("9.Delete note");
        System.out.println("10.Clear all");
        System.out.println("11.Empty archive");
        System.out.println("0.Exit");
        
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.print("\nChoice: ");
            choice = input.nextInt();
        } while (choice < 0 || choice > 11);
        
        return choice;
    }
    
    public static int addSubMenu()
    {
        int choice;
        
        System.out.println("1.Add text note");
        System.out.println("2.Add checkbox list");
        System.out.println("3.Add voice note");
        System.out.println("4.Add photo note");
        System.out.println("0.Exit");
        
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.print("\nChoice: ");
            choice = input.nextInt();
        } while (choice < 0 || choice > 5);
        
        return choice;
    }
    
    public static int hasReminderMenu()
    {
        int choice;
    
        System.out.println("\n1.Reminder on");
        System.out.println("2.Reminder off\n");
    
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.print("Choice: ");
            choice = input.nextInt();
        } while (choice < 0 || choice > 3);
    
        return choice;
    }
}