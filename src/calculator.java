import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CalculationsClass cal = new CalculationsClass();

        double num1,num2;
        int choice;

        System.out.print("Please Enter The First Number: ");
        num1 = input.nextDouble();
        System.out.print("Please Enter The Second Number: ");
        num2 = input.nextDouble();

        System.out.print(" Please Select one of the operaters: ");
        System.out.print("1-Addition 2-Subtraction" +
                        "\n 3-Divsion 4-Multiplication: ");
        choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println(cal.addition(num1,num2));
                break;
            case 2:
                System.out.println(cal.subtraction(num1,num2));
                break;
            case 3:
                System.out.println(cal.division(num1,num2));
                break;
            case 4:
                System.out.println(cal.multiplication(num1,num2));
                break;
        }

    }
}
