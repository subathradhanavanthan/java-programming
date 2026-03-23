import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingProjectDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Form");
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(10, 2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        
        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressArea = new JTextArea(3, 15);
        JScrollPane scroll = new JScrollPane(addressArea);

        
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        
        JCheckBox agree = new JCheckBox("I Agree");

       
        JLabel courseLabel = new JLabel("Course:");
        String courses[] = {"CS", "AI","BSc", "BCom"};
        JComboBox<String> combo = new JComboBox<>(courses);

       
        JLabel langLabel = new JLabel("Languages:");
        String langs[] = {"Java", "Python", "C++"};
        JList<String> list = new JList<>(langs);

      
        JButton submit = new JButton("Submit");
        JButton clear = new JButton("Clear");

        
        JToggleButton toggle = new JToggleButton("ON/OFF");

      
        JDialog dialog = new JDialog(frame, "Message", true);
        dialog.setSize(250, 150);
        JLabel msg = new JLabel("", JLabel.CENTER);
        dialog.add(msg);

       
        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(addressLabel);
        frame.add(scroll);

        frame.add(genderLabel);
        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);
        frame.add(genderPanel);

        frame.add(courseLabel);
        frame.add(combo);

        frame.add(langLabel);
        frame.add(list);

        frame.add(new JLabel("Terms:"));
        frame.add(agree);

        frame.add(toggle);
        frame.add(new JLabel(""));

        frame.add(submit);
        frame.add(clear);

       
        submit.addActionListener(e -> {
            msg.setText("Form Submitted Successfully!");
            dialog.setVisible(true);
        });

        
        clear.addActionListener(e -> {
            nameField.setText("");
            addressArea.setText("");
            bg.clearSelection();
            agree.setSelected(false);
        });

        frame.setVisible(true);
    }
}