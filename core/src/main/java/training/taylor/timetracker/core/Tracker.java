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





import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class TimeTracker {
    private Instant startTime;
    private Instant stopTime;

    public void startTimer() {
        startTime = Instant.now();
        System.out.println("Timer started.");
    }

    public void stopTimer() {
        stopTime = Instant.now();
        System.out.println("Timer stopped.");
    }

    public Duration getElapsedTime() {
        if (startTime != null && stopTime != null) {
            return Duration.between(startTime, stopTime);
        } else {
            throw new IllegalStateException("Timer has not been started and stopped yet.");
        }
    }

    public static void main(String[] args) {
        TimeTracker timeTracker = new TimeTracker();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press ENTER to start the timer.");
        scanner.nextLine();
        timeTracker.startTimer();

        System.out.println("Press ENTER to stop the timer.");
        scanner.nextLine();
        timeTracker.stopTimer();

        try {
            Duration elapsedTime = timeTracker.getElapsedTime();
            long seconds = elapsedTime.getSeconds();
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            System.out.println("Elapsed time: " + minutes + " minutes and " + remainingSeconds + " seconds.");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
