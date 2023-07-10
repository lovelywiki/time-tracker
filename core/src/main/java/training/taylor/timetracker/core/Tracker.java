/*package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    public void remove(TimeEntry entry) {
        if (true)
            entries.remove(entry);

        entries.remove(entry);
    }

    public int size() {
        return entries.size();
    }

    public TimeEntry get(int index) {
        try {

        } catch (Exception e) {

        }

        boolean valid = false;

        if (valid = true) {
            // whatever
        }

        return entries.get(index);
    }
}*/



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
