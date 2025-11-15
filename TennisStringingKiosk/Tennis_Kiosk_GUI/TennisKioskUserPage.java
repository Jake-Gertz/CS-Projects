package TennisStringingKiosk.Tennis_Kiosk_GUI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TennisKioskUserPage extends JFrame implements ActionListener {
    private String userName;
    private int userID;

    private Toolkit toolKit = Toolkit.getDefaultToolkit();
    private Dimension screenSize = toolKit.getScreenSize();
    private int screenWidth = screenSize.width;
    private int screenHeight = screenSize.height;

    public TennisKioskUserPage(String userName, int userID) {
        this.userName = userName;
        this.userID = userID;

        this.setTitle("Home Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(screenWidth, screenHeight);

        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 7;
        this.add(new JLabel("Welcome: " + userName), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 7;
        this.add(new JLabel("Select an option"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 3;
        gbc.gridheight = 2;
        JButton seeMyRackets = new JButton("See my strung and unstrung rackets");
        seeMyRackets.addActionListener(this);
        this.add(seeMyRackets, gbc);

        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 3;
        gbc.gridheight = 2;
        JButton dropOffRacket = new JButton("Drop Off Racket To String");
        dropOffRacket.addActionListener(this);
        this.add(dropOffRacket, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 3;
        gbc.gridheight = 2;
        JButton pickUpRacket = new JButton("Pick Up Strung Racket");
        pickUpRacket.addActionListener(this);
        this.add(pickUpRacket, gbc);

        gbc.gridx = 4;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 3;
        gbc.gridheight = 2;
        JButton seeStringList = new JButton("See Available String Options");
        seeStringList.addActionListener(this);
        this.add(seeStringList, gbc);

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
    }


    // TODO when the user selects a string or stringer out of the options set the color of their selection to a new color 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
    

}
