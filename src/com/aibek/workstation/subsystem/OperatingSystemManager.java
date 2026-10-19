package com.aibek.workstation.subsystem;

public class OperatingSystemManager {
    public void authenticateUser(String username) {
        System.out.println("[OS] User account login: " + username);
    }

    public void applyPerformanceProfile(String profileMode) {
        System.out.println("[OS] Performance profile set: " + profileMode);
    }

    public void setDoNotDisturbMode(boolean enable) {
        String status = enable ? "ON" : "OFF";
        System.out.println("[OS] 'Do Not Disturb' mode: " + status);
    }
}
