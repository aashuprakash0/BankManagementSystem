package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignupOne extends JFrame {
	
	 SignupOne() {
		 
		 setLayout(null);
		 //To genarte random no for application
		 Random ran =new Random();
		 long random= (Math.abs(ran.nextLong()%9000L)+1000L);
		 //Application form no 
		 JLabel formno =new JLabel("APPLICATION FORM NO. "+ random);
		 formno.setFont(new Font("Raleway",Font.BOLD,38));
		 formno.setBounds(140,20,600,40);
		 add(formno);
		 
		 //Personal Details
		 JLabel persondetails =new JLabel("Page 1: Personal Details ");
		 persondetails.setFont(new Font("Raleway",Font.BOLD,22));
		 persondetails.setBounds(290,80,400,30);
		 add(persondetails);
		 
		//Name
		 JLabel name =new JLabel("Name : ");
		 name.setFont(new Font("Raleway",Font.BOLD,20));
		 name.setBounds(100,140,100,30);
		 add(name);
		 
		 JTextField nameTextField =new JTextField();
		 nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
		 nameTextField.setBounds(300,140,400,30);
		 add(nameTextField);
		 
		//Father name
		 JLabel fname =new JLabel("Father Name : ");
		 fname.setFont(new Font("Raleway",Font.BOLD,20));
		 fname.setBounds(100,190,200,30);
		 add(fname);
		 
		 JTextField fnameTextField =new JTextField();
		 fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
		 fnameTextField.setBounds(300,190,400,30);
		 add(fnameTextField);
		 
		 
		//Date of Birth
		 JLabel dob =new JLabel("Date of Birth : ");
		 dob.setFont(new Font("Raleway",Font.BOLD,20));
		 dob.setBounds(100,240,200,30);
		 add(dob);
		 
		 JDateChooser dateChooser = new JDateChooser();
		 dateChooser.setBounds(300, 240, 400, 30);
		 dateChooser.setForeground(Color.RED);
		 add(dateChooser);
		 
		 
		//gender
		 JLabel gender =new JLabel("Gender : ");
		 gender.setFont(new Font("Raleway",Font.BOLD,20));
		 gender.setBounds(100,290,200,30);
		 add(gender);
		 
		 JRadioButton male = new JRadioButton("Male");
		 male.setBounds(300,290,60,30);
		 male.setBackground(Color.WHITE);
		 add(male);
		 
		 JRadioButton female = new JRadioButton("Male");
		 female.setBounds(450,290,60,30);
		 female.setBackground(Color.WHITE);
		 add(female);
		 
		 ButtonGroup gendergroup =new ButtonGroup();
		 gendergroup.add(male);
		 gendergroup.add(female);
		 
		//email
		 JLabel email =new JLabel("Email Adress : ");
		 email.setFont(new Font("Raleway",Font.BOLD,20));
		 email.setBounds(100,340,200,30);
		 add(email);
		 
		 JTextField emailTextField =new JTextField();
		 emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
		 emailTextField.setBounds(300,340,400,30);
		 add(emailTextField);
		 
		 //marital status
		 JLabel martial =new JLabel("Marital Status  : ");
		 martial.setFont(new Font("Raleway",Font.BOLD,20));
		 martial.setBounds(100,390,200,30);
		 add(martial);
		 JRadioButton married = new JRadioButton("Married");
		 married.setBounds(300,390,100,30);
		 married.setBackground(Color.WHITE);
		 add(married);
		 
		 JRadioButton unmarried = new JRadioButton("Unmarried");
		 unmarried.setBounds(450,390,100,30);
		 unmarried.setBackground(Color.WHITE);
		 add(unmarried);
		 
		 JRadioButton others = new JRadioButton("Others");
		 others.setBounds(630,390,100,30);
		 others.setBackground(Color.WHITE);
		 add(others);
		 
		 ButtonGroup marriedrgroup =new ButtonGroup();
		 marriedrgroup.add(married);
		 marriedrgroup.add(unmarried);
		 marriedrgroup.add(others);
		 

		 //Adress
		 JLabel adress =new JLabel("Adress  : ");
		 adress.setFont(new Font("Raleway",Font.BOLD,20));
		 adress.setBounds(100,440,200,30);
		 add(adress);
		 
		 JTextField adressTextField =new JTextField();
		 adressTextField.setFont(new Font("Raleway",Font.BOLD,14));
		 adressTextField.setBounds(300,440,400,30);
		 add(adressTextField);
		 
		//City
		 JLabel city =new JLabel("City  : ");
		 city.setFont(new Font("Raleway",Font.BOLD,20));
		 city.setBounds(100,490,200,30);
		 add(city);
		 
		 JTextField cityTextField =new JTextField();
		 cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
		 cityTextField.setBounds(300,480,400,30);
		 add(cityTextField);
		 
		//State
		 JLabel state =new JLabel("State  : ");
		 state.setFont(new Font("Raleway",Font.BOLD,20));
		 state.setBounds(100,540,200,30);
		 add(state);
		 
		 JTextField stateTextField =new JTextField();
		 stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
		 stateTextField.setBounds(300,540,400,30);
		 add(stateTextField);
		 
		//Pincode
		 JLabel pincode =new JLabel("Pincode  : ");
		 pincode.setFont(new Font("Raleway",Font.BOLD,20));
		 pincode.setBounds(100,580,200,30);
		 add(pincode);
		 
		 JTextField pinTextField =new JTextField();
		 pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
		 pinTextField.setBounds(300,580,400,30);
		 add(pinTextField);
		 
		 JButton next = new JButton("Next");
		 next.setBackground(Color.BLACK);
		 next.setForeground(Color.WHITE);
		 next.setFont(new Font("Raleway",Font.BOLD,14));
		 next.setBounds(620,660,80,30);
		 add(next);
		
		 getContentPane().setBackground(Color.WHITE);
		 
		setSize(850,800);
		setLocation(350,200);
		setVisible(true);
	}
	
public static void main(String[] args) {
	new SignupOne();
}
}
