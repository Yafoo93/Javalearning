package projectWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	geometrictcalculator();
        });
    }

    private static void geometrictcalculator() {
        JFrame frame = new JFrame("kasand calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(139, 69, 19));

        JLabel titleLabel = new JLabel("KASAND GEO CALCULATOR");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setBounds(150, 20, 500, 30);

        JButton cylinderButton = new JButton("Cylinder");
        cylinderButton.setBounds(100, 250, 80, 30);
        
        JButton sphereButton = new JButton("Sphere");
        sphereButton.setBounds(200, 250, 80, 30);

        JButton cubeButton = new JButton("Cube");
        cubeButton.setBounds(300, 250, 80, 30);
        
        JButton coneButton = new JButton("Cone");
        coneButton.setBounds(400, 250, 80, 30);
        
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setBackground(Color.RED);
        cancelButton.setBounds(500, 300, 100, 50);

        JTextField radiousField = new JTextField();
        radiousField.setBounds(200, 70, 200, 30);
        
        JTextField heightField = new JTextField();
        heightField.setBounds(200, 110, 200, 30);
        
        JTextField sideAreaField = new JTextField();
        sideAreaField.setBounds(200, 150, 200, 30);
        
        JLabel radiousLabel = new JLabel("RADIOUS");
        radiousLabel.setForeground(Color.BLACK);
        radiousLabel.setFont(new Font("Arial", Font.BOLD, 10));
        radiousLabel.setBounds(50, 70, 100, 30);
        
        JLabel heightLabel = new JLabel("HEIGHT");
        heightLabel.setForeground(Color.BLACK);
        heightLabel.setFont(new Font("Arial", Font.BOLD, 10));
        heightLabel.setBounds(50, 110, 100, 30);
        
        JLabel sideareaLabel = new JLabel("SIDE AREA");
        sideareaLabel.setForeground(Color.BLACK);
        sideareaLabel.setFont(new Font("Arial", Font.BOLD, 10));
        sideareaLabel.setBounds(50, 150, 100, 30);
        
        

        JLabel resultLabel = new JLabel();
        resultLabel.setForeground(Color.RED);
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        resultLabel.setBounds(150, 200, 400, 30);

   
        
        

        cylinderButton.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
            	if (radiousField.getText().isEmpty() || heightField.getText().isEmpty()) {
                    resultLabel.setText("Please enter values for Radious and Height.");
                    sideAreaField.setEnabled(false);
                } 
            	else {
                double radius = Double.parseDouble(radiousField.getText());
                double height = Double.parseDouble(heightField.getText());
                double cylinderArea = 2 * Math.PI * radius * (radius + height);
                resultLabel.setText("The surface area of the cylinder is: " + String.format("%.3f", cylinderArea) + " cm²");
            	}
            }
        });

        sphereButton.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
            	if (radiousField.getText().isEmpty()) {
                    resultLabel.setText("Please enter a value for Radious.");
                    heightField.setEnabled(false);
                    sideAreaField.setEnabled(false);
                } 
            	else {
                double radius = Double.parseDouble(radiousField.getText());
                double sphereArea = 4 * Math.PI * radius * radius;
                resultLabel.setText("The surface area of the sphere is: " + String.format("%.3f", sphereArea) + " cm²");
                
                }
            }
        });
        
        cubeButton.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
            	if (sideAreaField.getText().isEmpty()) {
                    resultLabel.setText("Please enter a value for side.");
                    heightField.setEnabled(false);
                    radiousField.setEnabled(false);
                } 
            	else {
                double sideArea = Double.parseDouble(sideAreaField.getText());
                double cubeArea = 6 * sideArea * sideArea;
                resultLabel.setText("The surface area of the CUBE is: " + String.format("%.3f", cubeArea) + " cm²");
                
            	}
            }
        });
        
        coneButton.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
            	 if (radiousField.getText().isEmpty() || heightField.getText().isEmpty()) {
                     resultLabel.setText("Please enter values for Radious and Height.");
                     sideAreaField.setEnabled(false);
                 } 
            	 else {
                double radius = Double.parseDouble(radiousField.getText());
                double height = Double.parseDouble(heightField.getText());
                double coneArea = Math.PI * radius * (radius + Math.sqrt((height * height) + (radius * radius)));
                resultLabel.setText("The surface area of the CONE is: " + String.format("%.3f", coneArea) + " cm²");
                
            	 }
            }
        });
        
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                radiousField.setEnabled(true);
                heightField.setEnabled(true);
                sideAreaField.setEnabled(true);
                resultLabel.setText("");
                radiousField.setText("");
                heightField.setText("");
                sideAreaField.setText("");
            }
        });

        

        
      
        frame.add(titleLabel);
        frame.add(cylinderButton);
        frame.add(sphereButton);
        frame.add(cubeButton);
        frame.add(coneButton);
        frame.add(radiousField);
        frame.add(heightField);
        frame.add(sideAreaField);
        frame.add(resultLabel);
        frame.add(radiousLabel);
        frame.add(heightLabel);
        frame.add(sideareaLabel);
        frame.add(cancelButton);

        frame.setSize(700, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
