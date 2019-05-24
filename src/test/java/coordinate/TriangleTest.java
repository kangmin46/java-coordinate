package coordinate;

import coordinate.domain.FigureFactory;
import coordinate.domain.PointFactory;
import coordinate.domain.PointList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    void 삼각형예외() {
        PointList points = new PointList(PointFactory.generateCoordinateList(Arrays.asList("1,0","2,0","3,0")));
        assertThatIllegalArgumentException().isThrownBy(() ->{
            FigureFactory.generateFigure(points);
        });
    }

    @Test
    void 삼각형넓이() {
        PointList points = new PointList(PointFactory.generateCoordinateList(Arrays.asList("0,0","2,0","0,2")));
        assertEquals(FigureFactory.generateFigure(points).findArea(),2,0.001);

    }
}
