import javax.swing.*;

public class comboBox2 extends JFrame {
    private JComboBox comboBox1;
    private JPanel panel1;
    private JButton button1;


    public comboBox2(){

        add(panel1);

        setTitle("Fraction Options");
        setSize(450, 150);


        JComboBox comboBox2 = new JComboBox();
        comboBox2.addItem("1:Adding Fraction");
        comboBox2.addItem("2:Minus  Fraction");
        comboBox2.addItem("3:Multiply Fraction");
        comboBox2.addItem("4:Divide Fraction");
        comboBox2.addItem("5:Fractions to Decimal");
        comboBox2.setSelectedItem(null);


    }
}

