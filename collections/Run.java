/*
 *
 * todo: На площині задано N точок. Необхідно у файл LINES записати два HashMap:
 *   - із ключами у вигляді об’єктів класу Point, що визначаються цілими координатами
 *     точок, та значеннями у вигляді кількості прямих, що проходять через цю точку та, щонайменше,
 *     ще через одну точку,
 *   - із ключами у вигляді об’єктів класу Line, що визначаються параметрами К та В
 *     прямої y = K*x + B, та значеннями у вигляді кількості точок, що належать цій прямій.
 *
 *
 *
 * */

package collections;

import collections.dto.Line;
import collections.dto.Point;
import collections.service.LinearEquationController;
import collections.service.PointsController;

public class Run {
    public static void main(String[] args) {
        Point p1 = new Point(0, 4);
        Point p2 = new Point(1, 6);

        Line l1 = new Line(2, 4);
        Line l2 = new Line(-2, 4);
        Line l3 = new Line(5, 10);
        Line l4 = new Line(10, 10);

        Line[] lines = new Line[]{l1, l2, l3, l4};
        Point[] points = new Point[]{p1, p2};

        PointsController.pointMapping(p1, lines);
        PointsController.pointMapping(p2, lines);

        System.out.println();
        LinearEquationController.pointBelongingToLine(l1, points);
        LinearEquationController.pointBelongingToLine(l2, points);
        System.out.println();
    }
}
