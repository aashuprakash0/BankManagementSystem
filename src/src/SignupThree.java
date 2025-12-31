package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener {
	
	JRadioButton saving,fixed,current,recurring;
	JButton submit,cancel;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	String formno; 
	 SignupThree(String formno) {
		 this.formno = formno; 
		 setLayout(null);
		 
		JLabel l1 =new JLabel ("Page 3: Account Details") ;
		l1.setFont (new Font ("Raleway", Font. BOLD, 22) );
		l1.setBounds(280,20,400,40);
		add(l1);
		
		JLabel type =new JLabel ("Accout Type") ;
		type.setFont (new Font ("Raleway", Font. BOLD, 22) );
		type.setBounds(100,120,200,30);
		add(type);
		
		saving=new JRadioButton("Saving Account");
		saving.setFont (new Font ("Raleway", Font. BOLD, 16) );
		saving.setBackground(Color.WHITE);
		saving.setBounds(100,160,150,20);
		add(saving);
		
		fixed=new JRadioButton("Fixed Account");
		fixed.setFont (new Font ("Raleway", Font. BOLD, 16) );
		fixed.setBackground(Color.WHITE);
		fixed.setBounds(350,160,250,20);
		add(fixed);
		
		current=new JRadioButton("Current Account");
		current.setFont (new Font ("Raleway", Font. BOLD, 16) );
		current.setBackground(Color.WHITE);
		current.setBounds(100,200,250,20);
		add(current);
		
		recurring=new JRadioButton("Recurring Account");
		recurring.setFont (new Font ("Raleway", Font. BOLD, 16) );
		recurring.setBackground(Color.WHITE);
		recurring.setBounds(350,200,250,30);
		add(recurring);
		
		
		ButtonGroup groupaccount= new ButtonGroup();
		groupaccount.add(saving);
		groupaccount.add(current);
		groupaccount.add(fixed);
		groupaccount.add(recurring);

		JLabel card =new JLabel ("Card Number") ;
		card.setFont (new Font ("Raleway", Font. BOLD, 22) );
		card.setBounds(100,240,200,30);
		add(card);
		
		JLabel number =new JLabel ("XXXX-XXXX-XXXX-4184") ;
		number.setFont (new Font ("Raleway", Font. BOLD, 22) );
		number.setBounds(330,240,300,30);
		add(number);
		
		JLabel carddetail =new JLabel ("Your 16 Digit Card Number") ;
		carddetail.setFont (new Font ("Raleway", Font. BOLD, 13) );
		carddetail.setBounds(100,260,300,30);
		add(carddetail);
		
		JLabel pin =new JLabel ("PIN") ;
		pin.setFont (new Font ("Raleway", Font. BOLD, 22) );
		pin.setBounds(100,290,200,30);
		add(pin);
		
		JLabel pnumber =new JLabel ("XXXX") ;
		pnumber.setFont (new Font ("Raleway", Font. BOLD, 22) );
		pnumber.setBounds(330,290,300,30);
		add(pnumber);
		
		JLabel pindetail =new JLabel ("Your 4 Digit Password") ;
		pindetail.setFont (new Font ("Raleway", Font. BOLD, 15) );
		pindetail.setBounds(100,310,300,20);
		add(pindetail);
		
		JLabel services =new JLabel ("Services Required") ;
		services.setFont (new Font ("Raleway", Font. BOLD, 22) );
		services.setBounds(100,350,200,30);
		add(services);
		
		
		c1=new JCheckBox("ATM CARD");
		c1.setBackground(Color.white);
		c1.setFont (new Font ("Raleway", Font. BOLD, 16));
		c1.setBounds(100,390,200,30);
		add(c1);
		
		c2=new JCheckBox("Inernet Banking");
		c2.setBackground(Color.white);
		c2.setFont (new Font ("Raleway", Font. BOLD, 16));
		c2.setBounds(350,390,200,30);
		add(c2);
		
		c3=new JCheckBox("Mobile Banking");
		c3.setBackground(Color.white);
		c3.setFont (new Font ("Raleway", Font. BOLD, 16));
		c3.setBounds(100,430,200,30);
		add(c3);
		
		c4=new JCheckBox("Email/SMS");
		c4.setBackground(Color.white);
		c4.setFont (new Font ("Raleway", Font. BOLD, 16));
		c4.setBounds(350,430,200,30);
		add(c4);
		
		c5=new JCheckBox("Cheque Book");
		c5.setBackground(Color.white);
		c5.setFont (new Font ("Raleway", Font. BOLD, 16));
		c5.setBounds(100,470,200,30);
		add(c5);
		
		c6=new JCheckBox("E-Satatement");
		c6.setBackground(Color.white);
		c6.setFont (new Font ("Raleway", Font. BOLD, 16));
		c6.setBounds(350,470,200,30);
		add(c6);
		
		c7=new JCheckBox("I heryby declare that the above entered details are correct to the best of my Knowledge ");
		c7.setBackground(Color.white);
		c7.setFont (new Font ("Raleway", Font. BOLD, 12));
		c7.setBounds(100,520,600,30);
		add(c7);
		
		submit =new JButton("Submit"); 
		submit.setBackground(Color.black);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font ("Raleway", Font. BOLD, 14));
		submit.setBounds(250,590,100,30); 
		submit.addActionListener(this);
		add(submit);
		
		cancel =new JButton("Cancel"); 
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.WHITE);
		cancel.setFont(new Font ("Raleway", Font. BOLD, 14));
		cancel.setBounds(420,590,100,30); 
		cancel.addActionListener(this);
		add(cancel);
		
		
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850,800);
		setLocation(350,200);
		setVisible(true);
	}
	 
	 @Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()== submit) {
			String accountType=null; 
			if(saving.isSelected()) {
				accountType="Saving Account";
			}else if (fixed.isSelected()) {
				accountType="Fixed Deposit Account"; 
			}else if (current.isSelected()) {
				accountType="Current Account";
			}else if (recurring.isSelected()) {
				accountType="Recurring Account"; 
			}
			
			Random random = new Random();

			// proper 16-digit card number
			long cardPrefix = 5040936000000000L;                        
			long suffix = Math.abs(random.nextLong() % 900000L) + 100000L;  
			String cardnumber = String.valueOf(cardPrefix + suffix);

			// proper 4-digit PIN
			String pinnumber = String.format("%04d", random.nextInt(10000));
			
			String facility="";
			if(c1.isSelected())       {
				facility=facility+"Atm Card";
			}else if (c2.isSelected()) {
				facility=facility+"Internet Banking"; 
			}else if (c3.isSelected()) {
				facility=facility+"Mobile Banking";
			}else if (c4.isSelected()) {
				facility=facility+"Email & SMS Alerts"; 
			}else if (c5.isSelected()) {
				facility=facility+"Cheque Book"; 
			}else if (c6.isSelected()) {
				facility=facility+"E-Statement"; 
				}
			try {
				if(accountType.equals("")) {
					JOptionPane.showMessageDialog(null,"Account Type is requred");
				}else {
					Conn conn =new Conn();
					String query1 = "insert into signupthree values ('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
					String query2 = "insert into login values ('"+formno+"','"+cardnumber+"','"+pinnumber+"')";

					conn.s.executeUpdate(query1);
					conn.s.executeUpdate(query2);

					
					JOptionPane.showMessageDialog(null,"Card Number ="+cardnumber+"\n Pin ="+pinnumber);
					setVisible(false);
					new Deposit(pinnumber).setVisible(false);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			
		} else if (ae.getSource()== cancel){
			setVisible(false);
			new Login().setVisible(true); 
		}
		
	}
	
	
	
public static void main(String[] args) {
	new SignupThree("");
}
}
