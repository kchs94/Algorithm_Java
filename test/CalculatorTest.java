import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
  Calculator cal;

  @BeforeEach // 각각의 테스트 메소드가 실행되기 전에 실행되는 메소드
  void setUp() {
    cal = new Calculator();
  }

  @Test
  void 덧셈() {
    assertEquals(7, cal.add(3, 4));
  }

  @Test
  void 뺄셈() {
    assertEquals(-1, cal.subtract(3, 4));
  }

  @Test
  void 곱셈() {
    assertEquals(12, cal.multiply(3, 4));
  }

  @Test
  void 나눗셈() {
    assertEquals(0, cal.divide(3, 4));
  }

  @AfterEach
  void tearDown() {
    cal = null;
  }
}