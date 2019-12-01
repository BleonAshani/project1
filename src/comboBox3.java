import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//https://www.youtube.com/watch?v=Tan5cHm8OtM help from this:)

public class comboBox3 {

    String[] options ={"1:Adding Fraction", "2:Minus  Fraction","3:Multiply Fraction", "4:Divide Fraction","5:Fractions to Decimal"};


    JComboBox<String> comboBox = new JComboBox<String>(options);
    ItemHandler handler = new ItemHandler();
    public JComboBox comboBox3;
    JFrame frame = new JFrame();



    public comboBox3(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        ItemHandler handler = new ItemHandler();
        comboBox.addItemListener(handler);
        frame.setSize(300,300);


        frame.add(comboBox);
        comboBox.addItemListener(handler);

        frame.setTitle("Fractions");
    }
    public class ItemHandler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent event) {

            if(event.getSource() == comboBox){
                if(comboBox.getSelectedItem().equals("fds")){
                    JOptionPane.showMessageDialog(null,"hello");
                }

            }
        }
    }
    public JComboBox getComboBox3() {
        return comboBox3;
    }

}
