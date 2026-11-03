package org.iis.ajnebro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatisticsTest {

  @Test
  void maximumValueReturnsTheRightValue() {
    // Arrange
    Statistics statistics = new Statistics();
    double[] numbers = {3.5, 2.0, 10.5, 1.2, 9.4};
    double expectedValue = 10.5;

    // Act
    double obtainedValue = statistics.maximumValue(numbers);

    // Assert
    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  void maximumValueRaisesAnExceptionIfTheArrayIsEmpty() {
    // Arrange
    Statistics statistics = new Statistics();
    double[] numbers = {};

    // Act & Assert
    assertThrows(IllegalArgumentException.class, () -> statistics.maximumValue(numbers));
  }

  @Test
  void meanReturnsTheRightValue() {
    // Arrange
    Statistics statistics = new Statistics();
    double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
    double expectedValue = 3.0;

    // Act
    double obtainedValue = statistics.mean(numbers);

    // Assert
    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  void meanRaisesAnExceptionIfTheArrayIsEmpty() {
    // Arrange
    Statistics statistics = new Statistics();
    double[] numbers = {};

    // Act & Assert
    assertThrows(IllegalArgumentException.class, () -> statistics.mean(numbers));
  }

  @Test
  void minimumValueReturnsTheRightValue() {
    // Arrange
    Statistics statistics = new Statistics();
    double[] numbers = {3.5, 2.0, 7.8, 1.2, 9.4};
    double expectedValue = 1.2;

    // Act
    double obtainedValue = statistics.minimumValue(numbers);

    // Assert
    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  void minimumValueRaisesAnExceptionIfTheArrayIsEmpty() {
    // Arrange
    Statistics statistics = new Statistics();
    double[] numbers = {};

    // Act & Assert
    assertThrows(IllegalArgumentException.class, () -> statistics.minimumValue(numbers));
  }
}
