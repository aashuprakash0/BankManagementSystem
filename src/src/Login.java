package bankmanagementsystem;
import java.awt.ActiveEvent;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {
	JButton login,signup,clear;
	JTextField cardTextField;
	JPasswordField pinTextField ;
	

    Login() {
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(getClass().getClassLoader().getResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
       
        //To label  welcome to ATM
        JLabel text =new JLabel("Welcome to ATM"); 
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        // to get card no 
        JLabel cardno =new JLabel("Card No."); 
        cardno.setFont(new Font("Raleway",Font.BOLD,38));
        cardno.setBounds(120,120,400,30);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,120,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        //To get pin no 
        JLabel pin =new JLabel("Pin"); 
        pin.setFont(new Font("Osward",Font.BOLD,38));
        pin.setBounds(120,200,400,30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 200, 230, 30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
        //button for sign in 
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        //Clear button
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
       
        //button for sign up 
        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
        
        //setting background color 
        getContentPane().setBackground(Color.white);
        //set size of frame
        setSize(800, 500);
        setLocation(350, 200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
    	if(ae.getSource()==clear) {
    		cardTextField.setText("");
    		pinTextField.setText("");
    	}else if (ae.getSource()==login) {
    		Conn conn=new Conn(); 
    		String cardnumber =cardTextField.getText();
    		String pinnumber =pinTextField.getText();
    		
    		String query="select * from login where cardnumber='"+cardnumber+"'and pin='"+pinnumber+"'";
    		try {
			ResultSet rs= 	conn.s.executeQuery(query);
			if (rs.next()) {
				setVisible(false);
				new Transactions(pinnumber).setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null,"Invaild Card NUmber or pin");
			}
			} catch (Exception e) {
				System.out.println(e);
			}
    		
    	}else if(ae.getSource()== signup) {
    		setVisible(false);
    		new SignupOne().setVisible(true);
    	}
    }
    

    public static void main(String[] args) {
        new Login();
    }
}
