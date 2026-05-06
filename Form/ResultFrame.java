import java.awt.*;
import javax.swing.*;

class ResultFrame extends JFrame {

    ResultFrame(String name, String age, String email, String phone, String course) {

        setTitle("Result");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5,1));

        add(new JLabel("Name: " + name));
        add(new JLabel("Age: " + age));
        add(new JLabel("Email: " + email));
        add(new JLabel("Phone: " + phone));
        add(new JLabel("Course: " + course));

        setVisible(true);
    }
}