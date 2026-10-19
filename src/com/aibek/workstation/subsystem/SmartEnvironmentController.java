package com.aibek.workstation.subsystem;

public class SmartEnvironmentController {
    public void setSmartLighting(String mode) {
        System.out.println("[Environment] Setting smart lighting mode: " + mode);
    }

    public void startAudioStream(String playlist) {
        System.out.println("[Audio] Starting playback audio: " + playlist);
    }

    public void stopAudioStream() {
        System.out.println("[Audio] Stopping audio playback");
    }
}
