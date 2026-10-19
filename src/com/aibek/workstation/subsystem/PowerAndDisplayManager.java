package com.aibek.workstation.subsystem;

public class PowerAndDisplayManager {
    public void turnOnPC() {
        System.out.println("[Power] PC is on and sending signals to monitors.");
    }

    public void setMonitorConfiguration(String profile) {
        System.out.println("[Display] Switching monitor profiles to: " + profile);
    }

    public void turnOffPC() {
        System.out.println("[Power] Shutting down the PC and putting monitors into standby mode.");
    }
}