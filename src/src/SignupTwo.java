package bankmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{
		JComboBox religion1,category1,income1,Education,Occupation;
		JTextField  pannoTextField,aadharTextField;
		JRadioButton syes,sno,eyes,eno;
		JButton next;
		String formno;
		
		SignupTwo(String formno) {
		 this.formno=formno;
		 setLayout(null);
		 
		 setTitle("NEW ACCOUNT APPLICATION FORM-PAGE-2");
		 
		 
		 //Additional Details
		 JLabel additionaldetails =new JLabel("Page 2: Additional Details ");
		 additionaldetails.setFont(new Font("Raleway",Font.BOLD,22));
		 additionaldetails.setBounds(290,80,400,30);
		 add(additionaldetails);
		 
		//Religion
		 JLabel religion =new JLabel("Religon : "); 
		 religion.setFont(new Font("Raleway",Font.BOLD,20));
		 religion.setBounds(100,140,100,30);
		 add(religion);
		 
		 String valReligion[]= {"Hindu","Muslim","Sikh","Christan","Others"};
		 religion1 = new JComboBox(valReligion);
		 religion1.setBackground(Color.WHITE);
		 religion1.setBounds(300,140,400,30);
		 add(religion1);
		 
		 
		 
		//category
		 JLabel category =new JLabel("Category : ");
		 category.setFont(new Font("Raleway",Font.BOLD,20));
		 category.setBounds(100,190,200,30);
		 add(category);
		 
		 String valCategory[]= {"General","OBC","SC","ST","Others"};
		 category1 = new JComboBox(valCategory);
		 category1.setBackground(Color.WHITE);
		 category1.setBounds(300,190,400,30);
		 add(category1);
		 
		 
		//Income
		 JLabel income =new JLabel("Income : ");
		 income.setFont(new Font("Raleway",Font.BOLD,20));
		 income.setBounds(100,240,200,30);
		 add(income);
		 
		 String valincome[]= {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
		 income1 = new JComboBox(valincome);
		 income1.setBackground(Color.WHITE);
		 income1.setBounds(300,240,400,30);
		 add(income1);
		 
		 
		//Educational Details
		 JLabel educational =new JLabel("Educational : ");
		 educational.setFont(new Font("Raleway",Font.BOLD,20));
		 educational.setBounds(100,290,200,30);
		 add(educational);
		 
		 String valEducation[]= {"Non-Gradution","Graduate","Post-Graducation","Doctrate","Others"};
		 Education = new JComboBox(valEducation);
		 Education.setBackground(Color.WHITE);
		 Education.setBounds(300,315,400,30);
		 add(Education);
		 
		 
		//Qualification
		 JLabel qualification =new JLabel("Qualification : ");
		 qualification.setFont(new Font("Raleway",Font.BOLD,20));
		 qualification.setBounds(100,310,200,30);
		 add(qualification);
		 
		
		 
		 //Occupation
		 JLabel occupation =new JLabel("Occupation  : ");
		 occupation.setFont(new Font("Raleway",Font.BOLD,20));
		 occupation.setBounds(100,390,200,30);
		 add(occupation);
		 
		 String valoccupation[]= {"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
		 Occupation = new JComboBox(valoccupation);
		 Occupation.setBackground(Color.WHITE);
		 Occupation.setBounds(300,390,400,30);
		 add(Occupation);
		 

		 //Pan Number
		 JLabel panno =new JLabel("PAN Number  : ");
		 panno.setFont(new Font("Raleway",Font.BOLD,20));
		 panno.setBounds(100,440,200,30);
		 add(panno);
		 
		 pannoTextField =new JTextField();
		 pannoTextField.setFont(new Font("Raleway",Font.BOLD,14));
		 pannoTextField.setBounds(300,440,400,30);
		 add(pannoTextField);
		 
		//TO GET AADHAR NO
		 JLabel aadhar =new JLabel("AADHAR Number  : ");
		 aadhar.setFont(new Font("Raleway",Font.BOLD,20));
		 aadhar.setBounds(100,490,200,30);
		 add(aadhar);
		 
		 aadharTextField =new JTextField();
		 aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
		 aadharTextField.setBounds(300,490,400,30);
		 add(aadharTextField);
		 
		//Senior Citizen
		 JLabel seniorC =new JLabel("Senior Citizen  : ");
		 seniorC.setFont(new Font("Raleway",Font.BOLD,20));
		 seniorC.setBounds(100,540,200,30);
		 add(seniorC);
		 
		 syes=new JRadioButton("Yes");
		 syes.setBounds(300,540,100,30);
		 syes.setBackground(Color.WHITE);
		 add(syes);
		 
		 sno=new JRadioButton("No");
		 sno.setBounds(450,540,100,30);
		 sno.setBackground(Color.WHITE);
		 add(sno);
		 
		 ButtonGroup seniorGroup=new ButtonGroup();
		 seniorGroup.add(syes);
		 seniorGroup.add(sno);
		 
		//Existing Account
		 JLabel eaccount =new JLabel("Existing Account  : ");
		 eaccount.setFont(new Font("Raleway",Font.BOLD,20));
		 eaccount.setBounds(100,580,200,30);
		 add(eaccount);
		 
		 eyes=new JRadioButton("Yes");
		 eyes.setBounds(300,580,100,30);
		 eyes.setBackground(Color.WHITE);
		 add(eyes);
		 
		 eno=new JRadioButton("No");
		 eno.setBounds(450,580,100,30);
		 eno.setBackground(Color.WHITE);
		 add(eno);
		 
		 ButtonGroup existGroup=new ButtonGroup();
		 existGroup.add(eyes);
		 existGroup.add(eno);
		 
		 next = new JButton("Next");
		 next.setBackground(Color.BLACK);
		 next.setForeground(Color.WHITE);
		 next.setFont(new Font("Raleway",Font.BOLD,14));
		 next.setBounds(620,660,80,30);
		 next.addActionListener(this);
		 add(next);
		
		 getContentPane().setBackground(Color.WHITE);
		 
		setSize(850,800);
		setLocation(350,200);
		setVisible(true);
	}
		public void actionPerformed(ActionEvent ae) {
			
		    String religion = (String)religion1.getSelectedItem();
		    String category = (String)category1.getSelectedItem();
		    String Income = (String) income1.getSelectedItem();
		    String education = (String) Education.getSelectedItem();
		    String occupation = (String) Occupation.getSelectedItem();
		    String panno = pannoTextField.getText();
		    String aadhar = aadharTextField.getText();
		    String seniorC = null;
		    if (syes.isSelected()) {
		    	seniorC = "Yes";
		    } else if (sno.isSelected()) {
		    	seniorC = "No";
		    }


		    String eaccount = null;
		    if (eyes.isSelected()) {
		    	eaccount = "Yes";
		    } else if (eno.isSelected()) {
		    	eaccount = "No";
		    }

		   
		   
		   

		    try {
		            Conn c = new Conn();
		            String query = "INSERT INTO signupTwo VALUES('" + formno + "','" + religion + "','" + category + "','" + Income + "','" + education + "','" + occupation + "','" + panno + "','" + aadhar + "','" + seniorC+ "','" + eaccount + "')";
		            c.s.executeUpdate(query);
		            System.out.println("✅ Data inserted successfully!");
		  
		            
		     } catch (Exception e) {
		        System.out.println("❌ Error: " + e);
		    }
		    
		}

public static void main(String[] args) {
	new SignupTwo("");
}
}
