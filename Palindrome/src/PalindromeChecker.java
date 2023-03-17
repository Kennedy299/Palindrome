import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PalindromeChecker extends JFrame implements ActionListener {

    JTextField textField;
    JLabel resultLabel;

    public PalindromeChecker() {
        super("Palindrome Checker");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel inputLabel = new JLabel("Enter a number:");
        textField = new JTextField(10);
        inputPanel.add(inputLabel);
        inputPanel.add(textField);
        add(inputPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton checkButton = new JButton("Check");
        checkButton.addActionListener(this);
        buttonPanel.add(checkButton);
        add(buttonPanel, BorderLayout.CENTER);

        JPanel resultPanel = new JPanel(new FlowLayout());
        resultLabel = new JLabel();
        resultPanel.add(resultLabel);
        add(resultPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = textField.getText().trim();

        if (isPalindrome(input)) {
            resultLabel.setText(input + " is a palindrome.");
        } else {
            resultLabel.setText(input + " is not a palindrome.");
        }
    }

    public boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
    }

}
