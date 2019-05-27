package coordinate.domain;

import coordinate.InputValidator;

import java.util.ArrayList;
import java.util.List;

public class PointFactory {

    public static Points generatePoints(List<String> input) {
        List<Point> points = new ArrayList<>();

        for (String inputCoordinate : input) {
            String[] splitPoints = inputCoordinate.split(",");
            Point newPoint = generatePoint(splitPoints[0], splitPoints[1]);
            points.add(newPoint);
        }
        return new Points(points);
    }

    public static Point generatePoint(String xPoint, String yPoint) {
        if (InputValidator.isNotInteger(xPoint, yPoint)) {
            throw new IllegalArgumentException("문자열이 아닌 숫자를 입력해 주세요.");
        }

        return new Point(generateScala(xPoint), generateScala(yPoint));
    }

    private static Scala generateScala(String scala) {
        return new Scala(Integer.parseInt(scala));
    }

}
