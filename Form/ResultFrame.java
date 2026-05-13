import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class ResultFrame extends JFrame {

    ResultFrame(String name, String age, String email, String phone, String course) {

        setTitle("Student Details");
        setSize(450, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(240, 245, 255));

        JLabel title = new JLabel("Submitted Student Data", JLabel.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 24));
        title.setForeground(new Color(0, 70, 140));
        title.setBorder(new EmptyBorder(20, 10, 20, 10));

        mainPanel.add(title, BorderLayout.NORTH);

        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(5, 1, 10, 15));
        infoPanel.setBackground(Color.WHITE);

        infoPanel.setBorder(new CompoundBorder(
                new LineBorder(new Color(180, 200, 255), 2, true),
                new EmptyBorder(20, 20, 20, 20)
        ));

        Font labelFont = new Font("Segoe UI", Font.PLAIN, 18);

        JLabel l1 = new JLabel("👤 Name : " + name);
        JLabel l2 = new JLabel("🎂 Age : " + age);
        JLabel l3 = new JLabel("📧 Email : " + email);
        JLabel l4 = new JLabel("📱 Phone : " + phone);
        JLabel l5 = new JLabel("📘 Course : " + course);

        JLabel[] labels = {l1, l2, l3, l4, l5};

        for (JLabel label : labels) {
            label.setFont(labelFont);
            label.setForeground(new Color(50, 50, 50));
            infoPanel.add(label);
        }

        JPanel wrapper = new JPanel(new BorderLayout());
        wrapper.setBackground(new Color(240, 245, 255));
        wrapper.setBorder(new EmptyBorder(10, 30, 30, 30));

        wrapper.add(infoPanel);
        mainPanel.add(wrapper, BorderLayout.CENTER);
        add(mainPanel);
        setVisible(true);
    }
}