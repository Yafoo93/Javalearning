package learning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class trial {
    public static void main(String[] args) {
 

        JFrame frame = new JFrame("Guess the Number Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.getContentPane().setBackground(Color.BLUE); // Set blue background

        // Add an icon to the frame
        ImageIcon icon = new ImageIcon("icon.png"); // Replace with your icon file path
        frame.setIconImage(icon.getImage());

        // Create and style components
        JLabel titleLabel = new JLabel("Guess the Number Game");
        titleLabel.setForeground(Color.YELLOW); // Set yellow text color
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Bold and size 20

        JTextField guessTextField = new JTextField(10);
        guessTextField.setBackground(Color.YELLOW); // Set yellow background
          // Set black text color

        JButton playButton = new JButton("Play");
        playButton.setBackground(Color.YELLOW); // Set yellow background
        playButton.setForeground(Color.BLACK); // Set black text color

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBackground(Color.YELLOW); // Set yellow background
        cancelButton.setForeground(Color.BLACK); // Set black text color

        // Add components to the frame
        frame.setLayout(new BorderLayout());
        frame.add(titleLabel, BorderLayout.NORTH);
        
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.BLUE); // Set blue background
        centerPanel.setLayout(new FlowLayout());
        centerPanel.add(new JLabel("Enter your guess:"));
        centerPanel.add(guessTextField);
        frame.add(centerPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.BLUE); // Set blue background
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(playButton);
        buttonPanel.add(cancelButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Add ActionListeners for buttons
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your game logic here
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to reset the game or close the application
                // You can use System.exit(0) to close the application
            }
        });

        // Set frame visibility
        frame.add(titleLabel);
		frame.add(guessTextField);
		frame.add(playButton);
		frame.add(cancelButton);
		
		frame.setSize(700,700);
	    frame.setLayout(null);
	    frame.setVisible(true);
    }
}
