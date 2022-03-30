package collections.service;

import collections.dto.Line;
import collections.dto.Point;

import java.util.HashMap;

public class PointsController {
    private static int belongingCount;
    private static int intersectionCount;

    public static String pointMapping(Point point, Line... lines) {
        HashMap<Point, Integer> pointMap = new HashMap<>();
        StringBuffer stringBuffer = new StringBuffer();
        for (Line line : lines) {
            if (((line.getK() * point.getX() + line.getB()) == point.getY())) {
                belongingCount++;
                if (belongingCount >= 2) {
                    intersectionCount++;
                }
            } else {
                stringBuffer.append(line).append("\n");
            }
        }

        if(!stringBuffer.isEmpty()) {
            System.err.println("Intersections were not found : \n" + stringBuffer);
        }

        pointMap.put(point, intersectionCount);
        System.out.println("Intersections were found : " + intersectionCount + "!");

        intersectionCount = 0;
        String pointMapData = pointMap.toString();
        RecordData.recordCalculations(pointMapData);
        return pointMapData;
    }
}
