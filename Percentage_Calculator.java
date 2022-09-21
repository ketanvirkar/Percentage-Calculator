package com.smv;
import java.util.Scanner;

public class Percentage_Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the marks of Marathi:  ");
        float mar= sc.nextFloat();
        if(mar>100){
            System.out.println("Invalid Marks entered!! Please enter valid Marks");
        }
        System.out.print("Enter the marks of English:  ");
        float eng= sc.nextFloat();
        if(eng>100){
            System.out.println("Invalid Marks entered!! Please enter valid Marks");
        }
        System.out.print("Enter the marks of Science:  ");
        float sci= sc.nextFloat();
        if(sci>100){
            System.out.println("Invalid Marks entered!! Please enter valid Marks");
        }
        System.out.print("Enter the marks of History:  ");
        float his= sc.nextFloat();
        if(his>100){
            System.out.println("Invalid Marks entered!! Please enter valid Marks");
        }
        System.out.print("Enter the marks of Mathamatics:  ");
        float math= sc.nextFloat();
        if(math>100){
            System.out.println("Invalid Marks entered!! Please enter valid Marks");
        }
        float Total = mar + eng + sci + his + math;
        float Percentage= (Total/500)*100;
        System.out.println("Total marks out of 500 is: "+ Total);
        System.out.println("Your Percentage is: "+ Percentage);
        if(Percentage>=35 && mar>=35 && eng>=35 && sci>=35 && his>=35 && math>=35){
            System.out.println("Congrats!! You are Passed.");
        }else {
            System.out.println("Sorry You are Failed !!!");
        }
    }
}
