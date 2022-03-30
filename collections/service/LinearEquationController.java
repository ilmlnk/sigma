package collections.service;

import collections.dto.Line;
import collections.dto.Point;

import java.util.HashMap;

public class LinearEquationController {
    private static int belongingCount;
    public static String pointBelongingToLine(Line line, Point... points) {
        StringBuffer stringBuffer = new StringBuffer();
        HashMap<Line, Integer> lineMap = new HashMap<>();
        for (Point point : points) {
            if ((line.getK() * point.getX() + line.getB()) == point.getY()) {
                belongingCount++;
            } else {
                stringBuffer.append(point).append("\n");
            }
        }
        if (!stringBuffer.isEmpty()) {
            System.err.println("Intersections were not found in lines : \n" + stringBuffer);
        }

        lineMap.put(line, belongingCount);
        System.out.println("Amount of points which are on line: " + belongingCount);

        belongingCount = 0;
        String lineMapData = lineMap.toString();
        RecordData.recordCalculations(lineMapData);
        return lineMapData;
    }
}
