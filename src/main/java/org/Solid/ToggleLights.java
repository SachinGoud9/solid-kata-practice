package org.Solid;

public class ToggleLights implements TurnLights{
    public int[][] toggleLights(int lights[][], int[] xCoordinates, int[] yCoordinates) {
        for(int i = xCoordinates[0] ; i <= xCoordinates[1]; i++) {
            for(int j = yCoordinates[0] ; j <= yCoordinates[1] ; j++) {
                lights[i][j] += 2;
            }
        }
        return lights;
    }
}
