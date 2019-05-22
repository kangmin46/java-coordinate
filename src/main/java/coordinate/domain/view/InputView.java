package coordinate.domain.view;

import coordinate.domain.Coordinate;
import coordinate.domain.Point;
import coordinate.domain.CoordinateFactory;

import java.util.*;
import java.util.stream.Collectors;

public class InputView {
    private static final String DEFAULT_DELIMITERS = "\\([0-9]{1,2},[0-9]{1,2}\\)";

    public static Coordinate InputCoordinate() {
        try {
            List<Point> points = new ArrayList<>();
            System.out.println("좌표를 입력하세요");
            Scanner scanner = new Scanner(System.in);

            List<String> coordinates = Arrays.asList(scanner.nextLine().split("-"));
            coordinates.stream().forEach(c -> isValidFormat(c));
            coordinates = coordinates.stream().map(s -> s.substring(1, 5)).collect(Collectors.toList());
            return CoordinateFactory.generateCoordinate(coordinates, points);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return InputCoordinate();
        }
    }

    private static void isValidFormat(String coordinate) {
        if (!coordinate.matches(DEFAULT_DELIMITERS)) {
            throw new IllegalArgumentException("올바른 형식을 입력하세요.");
        }
    }

}
