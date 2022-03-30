package collections.service;

import collections.dto.Line;
import collections.dto.Point;

import java.util.HashMap;

public class LinearEquationController {
    private static int belongingCount;
    public static void pointBelongingToLine(Line line, Point... points) {
        StringBuffer notFoundPoints = new StringBuffer();
        HashMap<Line, Integer> lineMap = new HashMap<>();
        for (Point point : points) {
            if ((line.getK() * point.getX() + line.getB()) == point.getY()) {
                belongingCount++;
            } else {
                notFoundPoints.append(point).append("\n");
            }
        }
        if (!notFoundPoints.isEmpty()) {
            System.err.println("Intersections were not found in lines : \n" + notFoundPoints);
        }

        if (belongingCount > 0) {
            System.out.println("Amount of points which are on line: " + belongingCount);
        }
        lineMap.put(line, belongingCount);

        belongingCount = 0;
        RecordData.recordCalculations(lineMap);
    }
}
