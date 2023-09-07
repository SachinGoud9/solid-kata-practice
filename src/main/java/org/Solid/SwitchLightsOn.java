package org.Solid;

public class SwitchLightsOn implements TurnLights{

    public String[][] toggleLights(String lights[][], int[] xCoordinates, int[] yCoordinates) {
        for(int i = xCoordinates[0] ; i <= xCoordinates[1]; i++) {
            for(int j = yCoordinates[0] ; j <= yCoordinates[1] ; j++) {
                lights[i][j] = "on";
            }
        }
        return lights;
    }
}