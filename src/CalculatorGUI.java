import javax.swing.*;

public class CalculatorGUI extends JFrame{

    //Scanner input = new Scanner(System.in);
    CalculationsClass cal = new CalculationsClass();
    ScientificCalculator scal = new ScientificCalculator();

    public double num1,num2,num3,num4;
    public int type, choice,Schoice;
    String typeAsString,choiceAsString,SchoiceAsString,num1AsString,num2AsString;


       /* System.out.print("1: Normal  2: Scientific");
        System.out.print("\nPlease pick the type of calculator you want:  ");
        type = input.nextInt();*/

    // JOptionPane.showMessageDialog(null,"1: Normal  2: Scientific");

    public CalculatorGUI(){
        typeAsString = JOptionPane.showInputDialog(null,"1: Normal  2: Scientific 3: Adding Fractions"+"\n\t\tPlease pick the type of calculator you want:  ");
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

            choiceAsString = JOptionPane.showInputDialog(null,"1-Addition 2-Subtraction 3-Divsion 4-Multiplication 5-modulos" +
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

            SchoiceAsString = JOptionPane.showInputDialog(null,"1-Tan 2-Sin 3-Cos 4-Square Root " +
                    "\n\t\tPlease Select one of the operaters: ");
            Schoice=Integer.parseInt(SchoiceAsString);

            num1AsString = JOptionPane.showInputDialog(null,"Please Enter The First Number: ");
            num1=Integer.parseInt(num1AsString);


                switch (Schoice) {
                case 1:
                    JOptionPane.showMessageDialog(null,"The tan of " + num1 + " is: "+scal.tan(num1));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"The sin of " + num1 + " is: "+ scal.sin(num1));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"The cos of " + num1 + " is: "+  scal.cos(num1));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"The Sqaure root of " + num1 + " is: "+ scal.squareR(num1));
                    break;
            }

        }
            else if(type == 3){



        }
            else{
            JOptionPane.showMessageDialog(null,"You have entered the wrong number please  1 or 2");
        }
    }
}
