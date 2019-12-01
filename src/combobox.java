import javafx.scene.control.ComboBox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.ItemSelectable;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class combobox extends JFrame {
    public JComboBox comboBox1;
    public JPanel p1;

    public combobox() {
        add(p1);

        setTitle("Fraction Options");
        setSize(450, 150);


        ItemListener itemListener = new ItemListener() {

            public void itemStateChanged(ItemEvent itemEvent) {
                System.out.println(", Selected: ");
                int state = itemEvent.getStateChange();
                System.out.println((state == ItemEvent.SELECTED) ? "Selected" : "Deselected");
                System.out.println("Item: " + itemEvent.getItem());
                ItemSelectable is = itemEvent.getItemSelectable();


            }
        };

        comboBox1 = new JComboBox();
        comboBox1.addItemListener(itemListener);


        /*comboBox1.addActionListener(e-> {
            System.out.println("nnidsa");
            int cNum = comboBox1.getSelectedIndex();
            System.out.println(cNum);}); */

    }
    public JComboBox getComboBox1() {
        return comboBox1;
    }





    /*
    ItemListener itemListener = new ItemListener() {
        public void itemStateChanged(ItemEvent itemEvent) {

            ItemSelectable is = itemEvent.getItemSelectable();
        }
    };
		comboBox1.addItemListener(itemListener);



    public void actionPerformed(ActionEvent actionEvent) {
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String num =(String) comboBox1.getSelectedItem();

                switch(num){
                    case "1:Adding Fraction":
                        JOptionPane.showMessageDialog(null,"hui ");

                        break;

                }
            }
        });
        int cNum = comboBox1.getSelectedIndex();
        System.out.println(cNum);

                String num = actionEvent.getActionCommand();

} */

    public static void main(String[] args) {
        new combobox();
    }
}
