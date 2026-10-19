package com.aibek.workstation.subsystem;
import java.util.List;

public class ApplicationLauncher {
    public void openApplications(List<String> apps) {
        System.out.println("[Apps] Launching programs: " + String.join(", ", apps));
    }

    public void closeAllApplications() {
        System.out.println("[Apps] Saving state and closing all running applications.");
    }
}
