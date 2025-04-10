package com.employeemanagementsystem;

import java.util.HashMap;
import java.util.Map;

public class Attendance {
    private Map<String, Integer> attendanceRecord;

    public Attendance() {
        this.attendanceRecord = new HashMap<>();
    }

    // Method to mark attendance
    public void markAttendance(String employeeId, int daysPresent) {
        attendanceRecord.put(employeeId, daysPresent);
    }

    // Method to display attendance
    public void displayAttendance() {
        for (Map.Entry<String, Integer> entry : attendanceRecord.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + " - Days Present: " + entry.getValue());
        }
    }
}
