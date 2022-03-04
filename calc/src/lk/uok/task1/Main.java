package lk.uok.task1;

import java.util.Scanner;

public class Main {

    //function for print instructions
    public static void toPrint(){

        System.out.println("press num 1 for sum");
        System.out.println("press num 2 for subtraction");
        System.out.println("press num 3 for multiplication");
        System.out.println("press num 4 for division");
        System.out.print("What do you want to do: ");

    }// end of toPrint

    //function for addition
    public static double toAdd(double n1, double n2){

        return n1+n2;
    }// end of toAdd

    // function for subtraction
    public static double toSub(double n1, double n2){

        return n1-n2;
    }// end of toSub

    // function for multiplication
    public static double toMulti(double n1, double n2){

        return n1*n2;
    }// end of toMulti

    //function for division
    public static double toDiv(double n1, double n2){

        return n1/n2;
    }// end of toDiv

    public static void main(String[] args) {
        System.out.println("--------- Simple Calculator ---------");
        System.out.println("\t\t\tHello! _/o  o\\_");
        System.out.println("-------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double num1 = input.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = input.nextDouble();

        toPrint();
        int option = input.nextInt();

        double ans =0;
        switch (option){
            case 1 :
                ans = toAdd(num1,num2);
                System.out.println("Answer is: "+ans);
                break;
            case 2 :
                ans = toSub(num1,num2);
                System.out.println("Answer is: "+ans);
                break;
            case 3 :
                ans = toMulti(num1,num2);
                System.out.println("Answer is: "+ans);
                break;
            case 4 :
                ans = toDiv(num1,num2);
                System.out.println("Answer is: "+ans);
                break;
            default:
                System.out.println("Invalid operation...");
                break;
        }
        System.out.println("\nHave a nice day !");
    }
}
