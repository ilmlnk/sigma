package collections.service;

import collections.dto.Line;
import collections.dto.Point;

import java.util.HashMap;

public class PointsController {
    private static int belongingCount;
    private static int intersectionCount;

    public static void pointMapping(Point point, Line... lines) {
        HashMap<Point, Integer> pointMap = new HashMap<>();
        StringBuffer notFoundLines = new StringBuffer();
        for (Line line : lines) {
            if (((line.getK() * point.getX() + line.getB()) == point.getY())) {
                belongingCount++;
                if (belongingCount >= 2) {
                    intersectionCount++;
                }
            } else {
                notFoundLines.append(line).append("\n");
            }
        }

        if (!notFoundLines.isEmpty()) {
            System.err.println("Intersections were not found : \n" + notFoundLines);
        }

        if (intersectionCount > 0) {
            System.out.println("Intersections were found : " + intersectionCount + "!");
        }

        pointMap.put(point, intersectionCount);
        intersectionCount = 0;
        RecordData.recordCalculations(pointMap);
    }
}
