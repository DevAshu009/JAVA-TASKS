import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMInterface {

    private static String accountHolder;
    private static String pin;
    private static double balance = 1000.00; // Opening balance
    
    // Username and Password for Login
    static String Username = "admin";
    static String Password = "12345";

    public static void main(String[] args) {
        showLoginPage();
    }

    public static void showLoginPage() {
        JFrame frame = new JFrame("ATM Login");

        JLabel nameLabel = new JLabel("Account Holder Name:");
        nameLabel.setBounds(30, 30, 200, 30);

        JTextField nameField = new JTextField();
        nameField.setBounds(200, 30, 150, 30);

        JLabel pinLabel = new JLabel("PIN:");
        pinLabel.setBounds(30, 80, 200, 30);

        JPasswordField pinField = new JPasswordField();
        pinField.setBounds(200, 80, 150, 30);

        JButton loginButton = new JButton("Continue");
        loginButton.setBounds(150, 130, 100, 30);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(pinLabel);
        frame.add(pinField);
        frame.add(loginButton);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       

        // Action listener for login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accountHolder = nameField.getText();
                pin = new String(pinField.getPassword());
                

                // Check if Holdername and pin are correct
                if (accountHolder.equals(Username) && pin.equals(Password) ) {
                    frame.dispose(); // Close login screen
                    showMenuScreen(); // Show ATM menu screen
                } else {
                    JOptionPane.showMessageDialog(frame, "Please enter account Holdername: "+ Username + " and Pin:" + Password);
                }
            }
        });
    }

    // Function to display the ATM menu
    public static void showMenuScreen() {
        JFrame frame = new JFrame("ATM Menu");

        JLabel welcomeLabel = new JLabel("Welcome, " + accountHolder + "!");
        welcomeLabel.setBounds(50, 20, 300, 30);

        JButton depositButton = new JButton("1. Deposit");
        depositButton.setBounds(50, 60, 200, 30);

        JButton withdrawButton = new JButton("2. Withdraw");
        withdrawButton.setBounds(50, 100, 200, 30);

        JButton checkBalanceButton = new JButton("3. Check Balance");
        checkBalanceButton.setBounds(50, 140, 200, 30);

        JButton exitButton = new JButton("4. Exit");
        exitButton.setBounds(50, 180, 200, 30);

        frame.add(welcomeLabel);
        frame.add(depositButton);
        frame.add(withdrawButton);
        frame.add(checkBalanceButton);
        frame.add(exitButton);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Action listener for deposit button
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String amount = JOptionPane.showInputDialog(frame, "Enter deposit amount:");
                balance += Double.parseDouble(amount);
                JOptionPane.showMessageDialog(frame, "Deposit successful! New balance: $" + balance);
            }
        });

        // Action listener for withdraw button
        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String amount = JOptionPane.showInputDialog(frame, "Enter withdrawal amount:");
                double withdrawAmount = Double.parseDouble(amount);
                if (withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    JOptionPane.showMessageDialog(frame, "Withdrawal successful! New balance: $" + balance);
                } else {
                    JOptionPane.showMessageDialog(frame, "Insufficient balance!");
                }
            }
        });

        // Action listener for check balance button
        checkBalanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Your current balance is: $" + balance);
            }
        });

        // Action listener for exit button
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Thank you for using our ATM! Goodbye.");
                frame.dispose(); // Close the menu window
            }
        });
    }
}
