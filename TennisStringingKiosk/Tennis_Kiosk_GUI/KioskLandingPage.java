package TennisStringingKiosk.Tennis_Kiosk_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TODO update java doc here
/**
 * The TennisKioskGUI class is the driver class of the 
 * TennisKiosk package. This GUI creates the interactable
 * layer of the tennis kiosk, manages when to add different 
 * objects to the TennisKiosk, tracks the current state of the 
 * tennis kiosk, and reports useful information to either a 
 * normal user or an admin user!
 * 
 * @author Jake Gertz
 * @date 11/14/2025
 * @version 1.0
 */
public class KioskLandingPage extends JFrame  implements ActionListener{
    private Toolkit toolKit = Toolkit.getDefaultToolkit();
    private Dimension screenSize = toolKit.getScreenSize();
    private int screenWidth = screenSize.width;
    private int screenHeight = screenSize.height;

    private JButton submissionButton;
    private JTextField enterUserName;
    private JTextField enterUserID;

    private String userName;
    private int userID;

    private final int USER_ID_LENGTH = 4;

    public KioskLandingPage() {
        this.setTitle("Kiosk Landing Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(screenWidth, screenHeight);

        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        this.add(new JLabel("Name:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        enterUserName = new JTextField(25);
        this.add(enterUserName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        this.add(new JLabel("User ID:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        enterUserID = new JTextField(USER_ID_LENGTH);
        this.add(enterUserID, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; 
        gbc.anchor = GridBagConstraints.CENTER;
        submissionButton = new JButton("Submit");
        submissionButton.addActionListener(this);
        this.add(submissionButton, gbc);

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }



    // TODO add a check for just user ID to see if any players match userID and then pass in 
    // the TennisPlayer object to the next window if the player does match, throw an error otherwise

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submissionButton) {
            userName = enterUserName.getText();
            try {
                userID = Integer.parseInt(enterUserID.getText());
            } catch (NumberFormatException nfe) {
                userID = 0;
            }
            if(userName.trim().isEmpty() | userID == 0) {
                submissionButton.setText("Invalid input please try again!");
                enterUserID.setText("");
                enterUserName.setText("");
                JOptionPane.showMessageDialog(this,"Invalid user name or user ID please try again");
                submissionButton.setText("Submit");
            } else {
                new TennisKioskUserPage(userName, userID);
                this.dispose();
            }
        }
    }
}
