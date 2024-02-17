package com.example.IncuByteTDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void shouldReturnZero() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(0, calculator.add(""));
	}

	@Test
	void shouldReturnNumber() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(5, calculator.add("5"));
	}

}
