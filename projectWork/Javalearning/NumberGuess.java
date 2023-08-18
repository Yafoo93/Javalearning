package projectWork;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGuess {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            numberGuesser();
        });
    }

    private static void numberGuesser() {
        JFrame frame = new JFrame("KASAND LUCKY NUMBER");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLUE);

        ImageIcon icon = new ImageIcon("C:/Users/kierratys2/Sem1Project/src/projectWork/game.jpg");
        frame.setIconImage(icon.getImage());

        JLabel titleLabel = new JLabel("KASAND NUMBER GUESS ");
        titleLabel.setForeground(Color.ORANGE);
        titleLabel.setFont(new Font("SANS_SERIF", Font.BOLD, 40));
        titleLabel.setBounds(50, 10, 600, 100);

        JTextField guessNumber = new JTextField(10);
        guessNumber.setBackground(Color.ORANGE);
        guessNumber.setForeground(Color.BLACK);
        guessNumber.setBounds(400, 100, 50, 30);

        JLabel guessLabel = new JLabel("ENTER YOUR LUCKY NUMBER");
        guessLabel.setForeground(Color.ORANGE);
        guessLabel.setFont(new Font("Arial", Font.BOLD, 15));
        guessLabel.setBounds(100, 110, 300, 20);

        JLabel resultLabel = new JLabel();
        resultLabel.setForeground(Color.RED);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 50));
        resultLabel.setBounds(100, 180, 2000, 50);
        
        JLabel warnLabel = new JLabel();
        warnLabel.setForeground(Color.YELLOW);
        warnLabel.setFont(new Font("Arial", Font.BOLD, 20));
        warnLabel.setBounds(100, 250, 2000, 50);

        JButton playButton = new JButton("PLAY");
        playButton.setForeground(Color.RED);
        playButton.setBackground(Color.WHITE);
        playButton.setBounds(110, 300, 100, 50);

        JButton cancelButton = new JButton("CANCEL");
        cancelButton.setForeground(Color.RED);
        cancelButton.setBackground(Color.WHITE);
        cancelButton.setBounds(350, 300, 100, 50);

        // Logic code integration
        int lowerNumber = 1;
        int upperNumber = 100;
        int secretNumber = ThreadLocalRandom.current().nextInt(lowerNumber, upperNumber + 1);
        int attempts = 5;
        final int[] attempt = {0};

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (attempt[0] < attempts) {
                    int userGuess = Integer.parseInt(guessNumber.getText());
                    attempt[0]++;
                

                if (userGuess > upperNumber || userGuess < lowerNumber) {
                        resultLabel.setText("Invalid Number, Enter a number between " + lowerNumber + " and " + upperNumber);
                        guessNumber.setText("");
                    } 
                else if (userGuess == secretNumber) {
                        resultLabel.setText("Success! You guessed the correct number: " + secretNumber);
                    } 
                else if (userGuess < secretNumber) {
                        resultLabel.setText("Go higher!");
                        guessNumber.setText("");
                    }
 
                else {
                        resultLabel.setText("Go lower!");
                        guessNumber.setText("");
                    }
                
                	if (attempt[0] == attempts - 1) {
                    warnLabel.setText("You have one attempt left!");
                }

                    if (attempt[0] == attempts) {
                        resultLabel.setText("Flop! You've used all your attempts. The correct number was: " + secretNumber);
                        warnLabel.setText("");
                    }
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
		 try {
			if (e.getSource() == clone()) {
			        System.exit(0);
			    }
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    }
		 });

        
        frame.add(titleLabel);
        frame.add(guessNumber);
        frame.add(guessLabel);
        frame.add(resultLabel);
        frame.add(playButton);
        frame.add(cancelButton);
        frame.add(warnLabel);

        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
