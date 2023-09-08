package org.Solid;

public class LightsOff implements TurnLights{
    public int[][] toggleLights(int lights[][], int[] xCoordinates, int[] yCoordinates) {
        for(int i = xCoordinates[0] ; i <= xCoordinates[1]; i++) {
            for(int j = yCoordinates[0] ; j <= yCoordinates[1] ; j++) {
                if(lights[i][j] >=1) {
                   lights[i][j] -= 1;
                }
            }
        }
        return lights;
    }
}
