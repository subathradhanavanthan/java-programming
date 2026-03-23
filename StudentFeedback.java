import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentFeedback {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Feedback Form");
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 30, 200, 25);

       
        JLabel deptLabel = new JLabel("Department:");
        deptLabel.setBounds(30, 70, 100, 25);
        String dept[] = {"CS", "AI", "BCA", "EEE"};
        JComboBox<String> deptBox = new JComboBox<>(dept);
        deptBox.setBounds(150, 70, 200, 25);

        
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(30, 110, 100, 25);
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        male.setBounds(150, 110, 80, 25);
        female.setBounds(230, 110, 100, 25);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

      
        JLabel skillLabel = new JLabel("Skills:");
        skillLabel.setBounds(30, 150, 100, 25);
        JCheckBox java = new JCheckBox("Java");
        JCheckBox python = new JCheckBox("Python");
        java.setBounds(150, 150, 80, 25);
        python.setBounds(230, 150, 100, 25);

      
        JLabel rateLabel = new JLabel("Rating:");
        rateLabel.setBounds(30, 190, 100, 25);
        String ratings[] = {"Excellent", "Good", "Average"};
        JList<String> list = new JList<>(ratings);
        JScrollPane listScroll = new JScrollPane(list);
        listScroll.setBounds(150, 190, 200, 60);

     
        JLabel feedbackLabel = new JLabel("Feedback:");
        feedbackLabel.setBounds(30, 270, 100, 25);
        JTextArea area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);
        scroll.setBounds(150, 270, 200, 100);

   
        JToggleButton toggle = new JToggleButton("Agree Terms");
        toggle.setBounds(150, 390, 150, 30);

       
        JButton submit = new JButton("Submit");
        submit.setBounds(180, 440, 100, 30);

     
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                String dept = deptBox.getSelectedItem().toString();

                String gender = "";
                if (male.isSelected()) gender = "Male";
                if (female.isSelected()) gender = "Female";

                String skills = "";
                if (java.isSelected()) skills += "Java ";
                if (python.isSelected()) skills += "Python";

                String rating = list.getSelectedValue();
                String feedback = area.getText();

                JDialog dialog = new JDialog(frame, "Result", true);
                dialog.setSize(300, 300);
                dialog.setLayout(new FlowLayout());

                dialog.add(new JLabel("Name: " + name));
                dialog.add(new JLabel("Dept: " + dept));
                dialog.add(new JLabel("Gender: " + gender));
                dialog.add(new JLabel("Skills: " + skills));
                dialog.add(new JLabel("Rating: " + rating));
                dialog.add(new JLabel("Feedback: " + feedback));

                dialog.setVisible(true);
            }
        });

        
        frame.add(nameLabel); frame.add(nameField);
        frame.add(deptLabel); frame.add(deptBox);
        frame.add(genderLabel); frame.add(male); frame.add(female);
        frame.add(skillLabel); frame.add(java); frame.add(python);
        frame.add(rateLabel); frame.add(listScroll);
        frame.add(feedbackLabel); frame.add(scroll);
        frame.add(toggle);
        frame.add(submit);

        frame.setVisible(true);
    }
}