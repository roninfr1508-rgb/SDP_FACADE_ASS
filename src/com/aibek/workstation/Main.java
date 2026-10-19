package com.aibek.workstation;
import com.aibek.workstation.facade.WorkstationFacade;

public class Main {
    public static void main(String[] args) {
        WorkstationFacade workstation = new WorkstationFacade();

        workstation.startWorkSession("Aibek");

        workstation.startStudySession("Aibek");

        workstation.startRelaxSession("Aibek");

        workstation.shutdownWorkstation();
    }
}
