import javax.swing.*;

public class login {

    private JPanel login;
    private JFormattedTextField emailField;
    private JPasswordField passwordField;
    private JButton prijavaButton;

    public static int id_;
    private JTextField textField1;
    private JTextField textField2;

    public login()
    {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 150);
        frame.setVisible(true);

        //setActionListeners();


    }

   /* private void setActionListeners()
    {
        prijavaButton.addActionListener(e -> {


        });

    }
*/
}

