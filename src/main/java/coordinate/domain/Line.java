package coordinate.domain;


import java.util.LinkedHashMap;
import java.util.Objects;

public class Line implements Comparable<Line> {
    private Double length;

    public Line(Double length) {
        this.length = length;
    }

    public double findSquareArea(Line length) {
        return this.length * length.length;
    }

    public boolean isTriangle(Line length, Line longestLine) {
        return (this.length + length.length) > longestLine.length;
    }

    @Override
    public int compareTo(Line o) {
        return Double.compare(o.length, length);
    }

    @Override
<<<<<<< HEAD
    double findArea() {
        Point firstPoint = coordinate.getPoint(0);
        Point secondPoint = coordinate.getPoint(1);
        return Math.sqrt(Math.pow(firstPoint.getPoint_x() - secondPoint.getPoint_x(), 2)
                + Math.pow(firstPoint.getPoint_y() - secondPoint.getPoint_y(), 2));
=======
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return length.equals(line.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }

    double findTriangleArea(Line line, Line line2) {
        double s = (this.length + line.length + line2.length) / 2;
        return Math.sqrt(s * (s - this.length) * (s - line.length) * (s - line2.length));
>>>>>>> fair/imkimheejoo
    }
}
