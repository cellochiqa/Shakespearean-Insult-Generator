// Main.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    private static Color lastColor = null; // Variable to store the last used color

    public static void main(String[] args) {
        // Create instances of the list classes
        StringList1 list1 = new StringList1();
        StringList2 list2 = new StringList2();
        StringList3 list3 = new StringList3();

        // Create a window for displaying
        JFrame frame = new JFrame("Shakespearean Insult Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 300); // Set window size

        // Center the window on the screen
        frame.setLocationRelativeTo(null); // This will center the window

        // Create a panel and set its layout to GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        frame.add(panel, BorderLayout.CENTER);
        panel.setBackground(new Color (189, 189, 189));

        // Create a GridBagConstraints object to control the placement of components, for centering vertically
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; // Place in the first column
        gbc.gridy = 0; // Place in the first row
        gbc.anchor = GridBagConstraints.CENTER; // Center components in their cell
        gbc.insets = new Insets(10, 10, 10, 10); // Add some space around the components

        // Create a label for displaying the selected items
        JLabel label = new JLabel("Click the button to generate a Shakespearean insult.", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 36)); // Set font for label
        label.setForeground(new Color(100, 0, 48)); // Set a reddish color for the text
        label.setPreferredSize(new Dimension(1000, 100)); // Set the label size
        panel.add(label, gbc); // Add label to the panel

        // Create a button that will trigger the generation of a random insult
        JButton button = new JButton("Generate insult");
        button.setFont(new Font("Arial", Font.BOLD, 26)); // Set font for button
        button.setBackground(new Color(68, 142, 68)); // Set green background for button
        button.setForeground(Color.WHITE); // Set white text color
        button.setPreferredSize(new Dimension(250, 50)); // Set button size
        button.setFocusPainted(false); // Remove focus outline

        // Move the button downwards by 50 units, vertically centered
        gbc.gridy = 1; // Now place the button in the second row
        panel.add(button, gbc); // Add button to the panel

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pick a random item from each list when the button is clicked
                String randomItem1 = list1.getRandomItem();
                String randomItem2 = list2.getRandomItem();
                String randomItem3 = list3.getRandomItem();

                // Use the random items to generate the insult and update the label
                String insult = "Thou art a " + randomItem1 + ", " + randomItem2 + " " + randomItem3 + "!";

                // Randomly select a color from a list of colors
                Color randomColor = getRandomColor();
                label.setText(insult); // Update the label with the generated insult
                label.setForeground(randomColor); // Change the color of the insult text

                /*
                // Print the insult and the color name to the console
                System.out.println(insult);
                System.out.println("Insult color: " + getColorName(randomColor)); // Print color name
                */
            }
        });

        frame.setVisible(true); // Make the frame visible after all components have been added
    }

    // Method to get a random dark color, ensuring it's different from the last one
    private static Color getRandomColor() {
        Random random = new Random();
        Color newColor;

        do {
            // Define an array of dark colors to choose from
            Color[] darkColors = {
                new Color(0, 0, 0),          // Black
                new Color(34, 34, 34),       // Very dark gray
                new Color(47, 79, 79),       // Dark slate gray
                new Color(0, 0, 139),        // Dark blue
                new Color(139, 0, 0),        // Dark red
                new Color(0, 100, 0),        // Dark green
                new Color(72, 61, 139),      // Dark slate blue
                new Color(25, 25, 112),      // Midnight blue
                new Color(139, 69, 19),      // Dark goldenrod
            };

            // Randomly select a color
            newColor = darkColors[random.nextInt(darkColors.length)];
        } while (newColor.equals(lastColor)); // Keep generating until the color is different from the last one

        // Update the last color used
        lastColor = newColor;

        return newColor;
    }
/*/
    // Method to map the Color object to a name
    private static String getColorName(Color color) {
        if (color.equals(new Color(0, 0, 0))) {
            return "Black";
        } else if (color.equals(new Color(34, 34, 34))) {
            return "Very Dark Gray";
        } else if (color.equals(new Color(47, 79, 79))) {
            return "Dark Slate Gray";
        } else if (color.equals(new Color(0, 0, 139))) {
            return "Dark Blue";
        } else if (color.equals(new Color(139, 0, 0))) {
            return "Dark Red";
        } else if (color.equals(new Color(0, 100, 0))) {
            return "Dark Green";
        } else if (color.equals(new Color(72, 61, 139))) {
            return "Dark Slate Blue";
        } else if (color.equals(new Color(25, 25, 112))) {
            return "Midnight Blue";
        } else if (color.equals(new Color(139, 69, 19))) {
            return "Dark Goldenrod";
        } else {
            return "Unknown Color"; // In case a new color is added
        }
    }*/
}


// Insults information gathered from https://nosweatshakespeare.com/resources/shakespeare-insults/

