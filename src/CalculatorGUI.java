
import javafx.scene.control.ComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CalculatorGUI {


    //Scanner input = new Scanner(System.in);
    CalculationsClass cal = new CalculationsClass();
    ScientificCalculator sCal = new ScientificCalculator();
    FractionCalculator fCal = new FractionCalculator();





    public int num1,num2,num3,num4;
    public int type, choice,Schoice,fOption;
    String typeAsString,choiceAsString,SchoiceAsString,num1AsString,num2AsString,num3AsString,num4AsString,fOptioneAsString;


       /* System.out.print("1: Normal  2: Scientific");
        System.out.print("\nPlease pick the type of calculator you want:  ");
        type = input.nextInt();*/

    // JOptionPane.showMessageDialog(null,"1: Normal  2: Scientific");

    public CalculatorGUI(){
        typeAsString = JOptionPane.showInputDialog(null,"1:Normal  \n2:Scientific \n3:Fractions"+"\n\t\tPlease pick the type of calculator you want:  ");
        type=Integer.parseInt(typeAsString);

            if(type == 1) {

                /*System.out.print("1-Addition 2-Subtraction" +
                        " 3-Divsion 4-Multiplication 5-modulos\n");

                System.out.print("Please Select one of the operaters: ");
                choice = input.nextInt();

                System.out.print("Please Enter The First Number: ");
                num1 = input.nextDouble();

                System.out.print("Please Enter The Second Number: ");
                num2 = input.nextDouble();*/

            choiceAsString = JOptionPane.showInputDialog(null,"1-Addition \n2-Subtraction \n3-Divsion \n4-Multiplication \n5-modulos" +
                    "\n\t\tPlease pick the type of calculator you want:  ");
            choice=Integer.parseInt(choiceAsString);


            num1AsString = JOptionPane.showInputDialog(null,"Please Enter The First Number: ");
            num1=Integer.parseInt(num1AsString);

            num2AsString = JOptionPane.showInputDialog(null,"Please Enter The Second  Number: ");
            num2=Integer.parseInt(num2AsString);



            switch (choice) {
                case 1:
                    JOptionPane.showMessageDialog(null,cal.addition(num1, num2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,cal.subtraction(num1, num2));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,cal.division(num1, num2));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,cal.multiplication(num1, num2));
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,cal.modulos(num1, num2));
                    break;
                default:

            }
        }
            else if(type == 2){

               /* System.out.print("1-Tan 2-Sin 3-Cos 4-Square Root: ");

                System.out.print(" Please Select one of the operaters: ");
                Schoice = input.nextInt();

                System.out.print("Please Enter The First Number: ");
                num1 = input.nextDouble();*/

            SchoiceAsString = JOptionPane.showInputDialog(null,"1-Tan \n2-Sin \n3-Cos \n4-Square Root " +
                    "\n\t\tPlease Select one of the operaters: ");
            Schoice=Integer.parseInt(SchoiceAsString);

            num1AsString = JOptionPane.showInputDialog(null,"Please Enter The First Number: ");
            num1=Integer.parseInt(num1AsString);


                switch (Schoice) {
                case 1:
                    JOptionPane.showMessageDialog(null,"The tan of " + num1 + " is: "+sCal.tan(num1));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"The sin of " + num1 + " is: "+ sCal.sin(num1));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"The cos of " + num1 + " is: "+  sCal.cos(num1));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"The Sqaure root of " + num1 + " is: "+ sCal.squareR(num1));
                    break;
            }

        }
            else if(type == 3){

                fOptioneAsString = JOptionPane.showInputDialog(null,"1:Adding Fraction \n2:subtracting Fractions \n3:Multiply Fraction \n4:Divide Fraction \n5: Decimal to Fractions");
                fOption=Integer.parseInt(fOptioneAsString);


                switch (fOption) {
                    case 1:
                        num1AsString = JOptionPane.showInputDialog(null, "Please Enter The top Number in the first fraction: ");
                        num1 = Integer.parseInt(num1AsString);

                        num2AsString = JOptionPane.showInputDialog(null, "Please Enter The bottom Number in the first fraction: ");
                        num2 = Integer.parseInt(num2AsString);

                        num3AsString = JOptionPane.showInputDialog(null, "Please Enter The top Number in the Second fraction: ");
                        num3 = Integer.parseInt(num3AsString);

                        num4AsString = JOptionPane.showInputDialog(null, "Please Enter The bottom Number in the Second fraction: ");
                        num4 = Integer.parseInt(num4AsString);

                        JOptionPane.showMessageDialog(null, num1 + "/" + num2 + " + " + num3 + "/" + num4 + ": " + fCal.fAdd(num1,num2,num3,num4));
                        break;
                    case 2:
                        num1AsString = JOptionPane.showInputDialog(null, "Please Enter The top Number in the first fraction: ");
                        num1 = Integer.parseInt(num1AsString);

                        num2AsString = JOptionPane.showInputDialog(null, "Please Enter The bottom Number in the first fraction: ");
                        num2 = Integer.parseInt(num2AsString);

                        num3AsString = JOptionPane.showInputDialog(null, "Please Enter The top Number in the Second fraction: ");
                        num3 = Integer.parseInt(num3AsString);

                        num4AsString = JOptionPane.showInputDialog(null, "Please Enter The bottom Number in the Second fraction: ");
                        num4 = Integer.parseInt(num4AsString);

                        JOptionPane.showMessageDialog(null, num1 + "/" + num2 + " - " + num3 + "/" + num4 + ": " + fCal.fSub(num1,num2,num3,num4));
                        break;
                    case 3:
                        num1AsString = JOptionPane.showInputDialog(null, "Please Enter The top Number in the first fraction: ");
                        num1 = Integer.parseInt(num1AsString);

                        num2AsString = JOptionPane.showInputDialog(null, "Please Enter The bottom Number in the first fraction: ");
                        num2 = Integer.parseInt(num2AsString);

                        num3AsString = JOptionPane.showInputDialog(null, "Please Enter The top Number in the Second fraction: ");
                        num3 = Integer.parseInt(num3AsString);

                        num4AsString = JOptionPane.showInputDialog(null, "Please Enter The bottom Number in the Second fraction: ");
                        num4 = Integer.parseInt(num4AsString);

                        JOptionPane.showMessageDialog(null, num1 + "/" + num2 + " x " + num3 + "/" + num4 + ": " + fCal.fMul(num1,num2,num3,num4));
                        break;
                    case 4:
                        num1AsString = JOptionPane.showInputDialog(null, "Please Enter The top Number in the first fraction: ");
                        num1 = Integer.parseInt(num1AsString);

                        num2AsString = JOptionPane.showInputDialog(null, "Please Enter The bottom Number in the first fraction: ");
                        num2 = Integer.parseInt(num2AsString);

                        num3AsString = JOptionPane.showInputDialog(null, "Please Enter The top Number in the Second fraction: ");
                        num3 = Integer.parseInt(num3AsString);

                        num4AsString = JOptionPane.showInputDialog(null, "Please Enter The bottom Number in the Second fraction: ");
                        num4 = Integer.parseInt(num4AsString);
                        JOptionPane.showMessageDialog(null, num1 + "÷" + num2 + "  " + num3 + "/" + num4 + ": " + fCal.fDiv(num1,num2,num3,num4));
                        break;
                    case 5:
                        num1AsString = JOptionPane.showInputDialog(null, "Please Enter a Number : ");
                        num1 = Integer.parseInt(num1AsString);
                        JOptionPane.showMessageDialog(null,"Decimal to fraction" +  fCal.dFra(num1));
                        break;
                }





                // JOptionPane.showInputDialog("Select what you want to do with fractions " + "1:Fractions to Decimal 2:Adding Fractions");


        }
            else{
            JOptionPane.showMessageDialog(null,"You have entered the wrong number please  1 , 2 or 3");
        }

    }
}
