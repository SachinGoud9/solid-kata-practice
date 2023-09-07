package org.Solid;

import java.util.Scanner;

public class ChristmasLights {

    public SwitchLightsOn switchLightsOn;
    public SwitchLightsOff switchLightsOff;
    public ToggleLights toggleLights;
    public void christmasLights() {
        Scanner scanner = new Scanner(System.in);
        switchLightsOn = new SwitchLightsOn();
        String[][] lights = new String[1000][1000];
        int[] xCoordinates = new int[2];
        int[] yCoordinates = new int[2];
        String instruction = "";
        String onOff = "";
        for(int i=0;i<1000; i++) {
            for(int j=0;j<1000;j++) {
                lights[i][j] = "off";
            }
        }
        for(int ins=0; ins < 9; ins++) {
            System.out.println("Enter the instruction: ");
            onOff = "";
            instruction = scanner.nextLine();
            String coordinates[] = instruction.split(" ");
            if(coordinates.length == 4) {
                int splitIndex = coordinates[1].indexOf(",");
                xCoordinates[0] = Integer.parseInt(coordinates[1].substring(0, splitIndex));
                yCoordinates[0] = Integer.parseInt(coordinates[1].substring(splitIndex+1));
                xCoordinates[1] = Integer.parseInt(coordinates[3].substring(0, splitIndex));
                yCoordinates[1] = Integer.parseInt(coordinates[3].substring(splitIndex+1));
            } else {
                int splitIndex = coordinates[2].indexOf(",");
                xCoordinates[0] = Integer.parseInt(coordinates[2].substring(0, splitIndex));
                yCoordinates[0] = Integer.parseInt(coordinates[2].substring(splitIndex+1));
                xCoordinates[1] = Integer.parseInt(coordinates[4].substring(0, splitIndex));
                yCoordinates[1] = Integer.parseInt(coordinates[4].substring(splitIndex+1));
                onOff = coordinates[1];
            }
            if(onOff.toLowerCase().equals("on")) {
                lights = switchLightsOn.toggleLights(lights, xCoordinates, yCoordinates);
            } else if(onOff.toLowerCase().equals("off")) {
                lights = switchLightsOff.toggleLights(lights, xCoordinates, yCoordinates);
            } else {
                lights = toggleLights.toggleLights(lights, xCoordinates, yCoordinates);
            }
        }
        System.out.println("Lights after performing instructions: ");
        for(int i=0;i<1000; i++) {
            for(int j=0;j<1000;j++) {
                System.out.print(lights[i][j] + " ");
            }
            System.out.println();
        }
    }
}