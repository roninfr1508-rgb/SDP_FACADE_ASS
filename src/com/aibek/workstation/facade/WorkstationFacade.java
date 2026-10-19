package com.aibek.workstation.facade;
import com.aibek.workstation.subsystem.ApplicationLauncher;
import com.aibek.workstation.subsystem.OperatingSystemManager;
import com.aibek.workstation.subsystem.PowerAndDisplayManager;
import com.aibek.workstation.subsystem.SmartEnvironmentController;

import java.util.Arrays;
import java.util.List;

public class WorkstationFacade {
    private final PowerAndDisplayManager powerAndDisplay;
    private final OperatingSystemManager osManager;
    private final ApplicationLauncher appLauncher;
    private final SmartEnvironmentController environment;

    public WorkstationFacade() {
        this.powerAndDisplay = new PowerAndDisplayManager();
        this.osManager = new OperatingSystemManager();
        this.appLauncher = new ApplicationLauncher();
        this.environment = new SmartEnvironmentController();
    }

    /**
     * Preparing a PC for development mode.
     */
    public void startWorkSession(String user) {
        System.out.println("\n=== STARTING THE WORKING SESSION ===");
        powerAndDisplay.turnOnPC();
        powerAndDisplay.setMonitorConfiguration("Two monitors (Extended mode)");

        osManager.authenticateUser(user);
        osManager.applyPerformanceProfile("Maximum performance");
        osManager.setDoNotDisturbMode(true);

        environment.setSmartLighting("White daylight (Focus)");
        environment.startAudioStream("Lo-Fi / Coding Focus Playlist");

        List<String> devApps = Arrays.asList("IntelliJ IDEA", "Docker Desktop", "PostgreSQL Client", "Slack");
        appLauncher.openApplications(devApps);

        System.out.println(">>> The workspace has been successfully prepared! <<<\n");
    }

    /**
     * Preparing a PC for study.
     */
    public void startStudySession(String user) {
        System.out.println("\n=== STARTING A STUDYING SESSION ===");
        powerAndDisplay.turnOnPC();
        powerAndDisplay.setMonitorConfiguration("One monitor (Primary)");

        osManager.authenticateUser(user);
        osManager.applyPerformanceProfile("Balanced");
        osManager.setDoNotDisturbMode(false);

        environment.setSmartLighting("Warm, soft light");

        List<String> studyApps = Arrays.asList("Google Chrome", "My-DU", "PDF Reader");
        appLauncher.openApplications(studyApps);

        System.out.println(">>> Studying mode activated! <<<\n");
    }

    /**
     * Preparing a PC for relax mode
     */
    public void startRelaxSession(String user) {
        System.out.println("\n=== ACTIVATING REST MODE ===");
        powerAndDisplay.turnOnPC();
        powerAndDisplay.setMonitorConfiguration("Cinematic / Big Screen");

        osManager.authenticateUser(user);
        osManager.applyPerformanceProfile("Quiet mode");
        osManager.setDoNotDisturbMode(true);

        environment.setSmartLighting("soft, cozy light (Atmospheric)");
        environment.startAudioStream("Madk1d & VILLIAN / ДИНАСТИЯ");

        List<String> mediaApps = Arrays.asList("Google Chrome (YouTube & Netflix)", "Spotify");
        appLauncher.openApplications(mediaApps);

        System.out.println(">>> Relaxation mode activated! Enjoy watching and listening! <<<\n");
    }

    /**
     * Shutting down the PC and powering off the environment.
     */
    public void shutdownWorkstation() {
        System.out.println("\n===  FINISHING WORK AND SHUTTING DOWN ===");
        appLauncher.closeAllApplications();
        environment.stopAudioStream();
        environment.setSmartLighting("OFF");
        osManager.setDoNotDisturbMode(false);
        powerAndDisplay.turnOffPC();
        System.out.println(">>> The computer and its surroundings are completely disconnected.. <<<\n");
    }
}
