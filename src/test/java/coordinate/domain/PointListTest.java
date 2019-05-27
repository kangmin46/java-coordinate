package coordinate.domain;

import coordinate.domain.PointFactory;
import coordinate.domain.Points;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class PointListTest {
    @Test
    void 중복좌표테스트() {
        assertThatIllegalArgumentException().isThrownBy(() ->{
            PointFactory.generatePoints(Arrays.asList("0,0","0,0","7,5","10,0"));
        });
    }

}
