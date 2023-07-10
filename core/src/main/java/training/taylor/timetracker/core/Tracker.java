import javax.swing.*;

public class TimeTracker {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create the window
        JFrame frame = new JFrame("Time-Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label with the text
        JLabel label = new JLabel("Time-Tracker");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        frame.getContentPane().add(label);

        // Display the window
        frame.pack();
        frame.setSize(300, 200);  // Adjust the size as needed
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }
}
