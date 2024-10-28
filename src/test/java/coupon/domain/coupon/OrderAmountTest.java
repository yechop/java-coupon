package coupon.domain.coupon;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class OrderAmountTest {

    @Test
    void 오천원_미만이면_예외가_발생한다() {
        assertThatThrownBy(() -> new OrderAmount(new BigDecimal(4999)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 십만원을_초과하면_예외가_발생한다() {
        assertThatThrownBy(() -> new OrderAmount(new BigDecimal(100001)))
                .isInstanceOf(IllegalArgumentException.class);
    }
}