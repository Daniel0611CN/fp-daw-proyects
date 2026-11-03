# JUnit 5 & Maven Learning Project

This project was created to test and understand the core concepts of **Unit Testing** using **JUnit 5**. 

### Objectives
This repository focuses on learning and applying the following technologies:
* **JUnit 5:** Writing and executing unit tests to ensure code quality.
* **Maven (`pom.xml`):** Managing project structure and downloading dependencies automatically.
* **Javadoc Plugin:** Generating automated and standardized documentation directly from the source code.

### What's inside?

* **[`Calculator.java`](./src/main/java/org/iis/ajnebro/Calculator.java)**: A simple class containing the core logic for basic mathematical operations. It implements four methods: `add`, `subtract`, `multiply`, and `divide`.
* **[`CalculatorTest.java`](./src/test/java/org/iis/ajnebro/CalculatorTest.java)**: The unit testing class designed to verify the calculator's functionality and handle edge cases. It includes the following test methods:
  * `testAdd()`: Verifies that the addition operation returns the correct sum.
  * `testSubtract()`: Checks that the subtraction operation works as expected.
  * `testMultiply()`: Validates that the multiplication operation calculates the exact product.
  * `testDivide()`: Ensures that the division operation returns the proper quotient under normal conditions.
  * `testIllegalArgumentException()`: Verifies error handling for edge cases, specifically ensuring that the proper exception is thrown when attempting to divide by zero.
* **[`Statistics.java`](./src/main/java/org7iis/ajnebro/Statistics.java)**: A class providing statistical utility methods for arrays of numbers, utilizing `Apache Commons Math` for percentile calculations. It implements four methods: `maximumValue`, `minimumValue`, `mean`, and `median`.
* **[`StatisticsTest.java`](./src/test/java/org/iis/ajnebro/StatisticsTest.java)**: The unit testing class designed to verify the statistical calculations and handle edge cases (like empty arrays). It includes the following test methods:
  * `maximumValueReturnsTheRightValue()`: Verifies that the operation successfully identifies and returns the highest number in the array.
  * `maximumValueRaisesAnExceptionIfTheArrayIsEmpty()`: Ensures that an `IllegalArgumentException` is correctly thrown when attempting to find the maximum of an empty array.
  * `minimumValueReturnsTheRightValue()`: Checks that the operation correctly identifies the lowest number in the array.
  * `minimumValueRaisesAnExceptionIfTheArrayIsEmpty()`: Ensures that an `IllegalArgumentException` is thrown when attempting to find the minimum of an empty array.
  * `meanReturnsTheRightValue()`: Validates that the mean operation calculates the exact average of the provided numbers.
  * `meanRaisesAnExceptionIfTheArrayIsEmpty()`: Verifies that an `IllegalArgumentException` is thrown when calculating the mean of an empty array.
