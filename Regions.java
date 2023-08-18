package sem2;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class Regions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame myFrame = new JFrame("Regions in Ghana");
		
		String[] regions = {"Northern Region", "Upper East Region", "Upper West Region", "North East Region", "Savannah Region", "Ashanti Region",
				"Eastern Region", "Oti Region", "Volta Region", "Western North Region", "Western Region", "Central Region", "Greater Accra Region",
				"Ahafo Region", "Bono East Region", "Bono Region"};
		JComboBox myCombobox = new JComboBox(regions);
		myCombobox.setBounds(50, 50, 150, 25);
		
		JLabel myLabel = new JLabel("Name:");
		myLabel.setBounds(230, 50, 70, 20);
		
		JTextField name = new JTextField();
		name.setForeground(Color.blue);
		name.setFont(new Font("Verdana", Font.PLAIN, 14));
		name.setBounds(270, 50, 200, 20);
		
		JLabel myLabel1 = new JLabel("Districts");
		myLabel1.setBounds(50, 100, 350, 50);
		
		
		JButton click = new JButton("Click");
		click.setForeground(Color.white);
		click.setBackground(Color.green);
		click.setBounds(80, 200, 70, 25);
		
		JButton clear = new JButton("Clear");
		clear.setBounds(220, 200, 70, 25);
		
		JButton close = new JButton("Close");
		close.setForeground(Color.white);
		close.setBackground(Color.red);
		close.setBounds(370, 200, 70, 25);
		
		click.addActionListener(new ActionListener() {
			
		@Override
		 public void actionPerformed(ActionEvent e) {
			 if (e.getSource() == click) {
		            String region = (String) myCombobox.getSelectedItem();
		            String myname = name.getText();

	            if (region.equals("Northern Region")) {
	            	String district = ("Tamale, Sagnarigu or Savelegu.");
	                myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " +district+"</html>");
	                
	                if (myname.isEmpty()) {	                	
		            	myLabel1.setText(district);
		            };
	                };
		            
	            if (region.equals("Savannah Region")) {
	            	String district = ("Damango, East Gonja or Bole.");
	                myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " + district+"</html>");
	                
	                if (myname.isEmpty()) {
	                	myLabel1.setText(district);
		            };
	                };
		            
	            if (region.equals("Ashanti Region")) {
	            	String district = ("Adansi North, Offinso North or Amansie South.");
	                myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " + district+"</html>");
	                
	                if (myname.isEmpty()) {	                	
		            	myLabel1.setText(district);
		            };
	                };
	            
	            if (region.equals("Upper East Region")) {
	            	String district = ("Bawku West, Garu or Pusiga.");
	                myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " + district+"</html>");
	                
	                if (myname.isEmpty()) {
		            	myLabel1.setText(district);
		            };
	                };
		            
	            if (region.equals("Upper West Region")) {
	            	String district = ("Sissala West, Wa East or WA West.");
	                myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " + district+"</html>");
	                
	                if (myname.isEmpty()) {
		            	myLabel1.setText(district);
		            };
	                };
		                
	            if (region.equals("North East Region")) {
	            	String district = ("Mamprugu Moagduri, Chereponi or Yunyoo-Nasuan.");
	            	myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " + district+"</html>");
	                
	                if (myname.isEmpty()) {
		            	myLabel1.setText(district);
		            };
	              	};
	              	
	          	if (region.equals("Eastern Region")) {
	            	String district = ("Kwahu East, okere or Atiwa East.");
	            	myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " + district+"</html>");
	                
	                if (myname.isEmpty()) {
		            	myLabel1.setText(district);
		            };
	              	};
		              	
              	if (region.equals("Oti Region")) {
	            	String district = ("Jasikan, Krachi East or Nkwanta North.");
	            	myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " + district+"</html>");
	                
	                if (myname.isEmpty()) {
		            	myLabel1.setText(district);
		            };
	              	};
			              	
              	if (region.equals("Volta Region")) {
	            	String district = ("Ho West, North Dayi or South Tongo.");
	            	myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " + district+"</html>");
	                
	                if (myname.isEmpty()) {
		            	myLabel1.setText(district);
		            };
	              	};
				              	
              	if (region.equals("Western North Region")) {
	            	String district = ("Bodi, Suaman or Bia West.");
	            	myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " + district+"</html>");
	                
	                if (myname.isEmpty()) {
		            	myLabel1.setText(district);
		            };
	              	};
					              	
              	if (region.equals("Western Region")) {
	            	String district = ("EllemBelle, Shama or Wassa East.");
	            	myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " + district+"</html>");
	                
	                if (myname.isEmpty()) {
		            	myLabel1.setText(district);
		            };
	              	};
	              	
              	if (region.equals("Central Region")) {
	            	String district = ("Assin North, Assin South or Ekumfi.");
	            	myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " + district+"</html>");
	                
	                if (myname.isEmpty()) {
		            	myLabel1.setText(district);
		            };
	              	};
		              	
              	if (region.equals("Greater Accra Region")) {
	            	String district = ("Ada East, Adenta or Ga North.");
	            	myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " + district+"</html>");
	                
	                if (myname.isEmpty()) {
		            	myLabel1.setText(district);
		            };
	              	};
	              	
	          	if (region.equals("Ahafo Region")) {
	            	String district = ("Asutifi North, Asutifi South or Tano North.");
	            	myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " + district+"</html>");
	            	
	                if (myname.isEmpty()) {
		            	myLabel1.setText(district);
		            };
	              	};
		              	
              	if (region.equals("Bono East Region")) {
	            	String district = ("Kintampo North, Sene East or Techiman.");
	            	myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " + district+"</html>");
	                
	                if (myname.isEmpty()) {
		            	myLabel1.setText(district);
		            };
	              	};
			              	
              	if (region.equals("Bono Region")) {
	            	String district = ("Banda, Jaman North or Berekum West.");
	            	myLabel1.setText("<html>" +myname +" hails from " +region +" and possibly comes from " + district+"</html>");
	                
	                if (myname.isEmpty()) {
		            	myLabel1.setText(district);
		            };
	              	 }              	       
			 	};
		 	};
		});
		 
		 
		 clear.addActionListener(new ActionListener() {
			 
		   public void actionPerformed(ActionEvent e) {
		  if (e.getSource() == clear) {
	            name.setText("");
	            myLabel1.setText("");
	        }}

		});
		 
		 close.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == close) {
	            System.exit(0);
	        }
	    }
		 });

		        
		myFrame.add(myCombobox);
		myFrame.add(name);
		myFrame.add(myLabel1);
		myFrame.add(click);
		myFrame.add(clear);
		myFrame.add(close);
		myFrame.add(myLabel);
		
		myFrame.setSize(500, 300);
		myFrame.setLayout(null);
		myFrame.setVisible(true);
	}
}
		
	




