import javax.swing.*;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CalculationsClass cal = new CalculationsClass();
        ScientificCalculator scal = new ScientificCalculator();

        double num1,num2;
        int choice,type,Schoice;

        System.out.print("1: Normal  2: Scientific");

        System.out.print("\nPlease pick the type of calculator you want:  ");
        type = input.nextInt();

        if(type == 1) {

            System.out.print("1-Addition 2-Subtraction" +
                    " 3-Divsion 4-Multiplication 5-modulos\n");

            System.out.print("Please Select one of the operaters: ");
            choice = input.nextInt();

            System.out.print("Please Enter The First Number: ");
            num1 = input.nextDouble();

            System.out.print("Please Enter The Second Number: ");
            num2 = input.nextDouble();



            switch (choice) {
                case 1:
                    System.out.println(cal.addition(num1, num2));
                    break;
                case 2:
                    System.out.println(cal.subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println(cal.division(num1, num2));
                    break;
                case 4:
                    System.out.println(cal.multiplication(num1, num2));
                    break;
                case 5:
                    System.out.println(cal.modulos(num1, num2));
                    break;
            }
        }
        else if(type == 2){

            System.out.print("1-Tan 2-Sin" +
                    "\n\t\t\t 3-Cos 4-Square Root: ");
            System.out.print("Please Enter The First Number: ");
            num1 = input.nextDouble();

            System.out.print(" Please Select one of the operaters: ");
            Schoice = input.nextInt();

            switch (Schoice) {
                case 1:
                    System.out.println("The tan of" + num1 + "is: "+  scal.tan(num1));
                    break;
                case 2:
                    System.out.println("The sin of" + num1 + "is: "+ scal.sin(num1));
                    break;
                case 3:
                    System.out.println("The cos of" + num1 + "is: "+  scal.cos(num1));
                    break;
                case 4:
                    System.out.println("The √ of" + num1 + "is: "+ scal.squareR(num1));
                    break;
            }

        }
        else{
            System.out.print("You have entered the wrong number please  1 or 2");
        }

    }
}
