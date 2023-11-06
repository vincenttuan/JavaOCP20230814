package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import day21.Calc;

public class TestCalc {
	
	@Test
	// 測試腳本
	// 利用 3A 法則來測試物件資源/服務
	// Arrange(安排), Act(實際得到的值), Assert(期望得到的值)
	public void test1() {
		// Arrange(安排)
		Calc calc = new Calc();
		int x = 2;
		int y = 3;
		
		// Act(實際得到的值)
		int result = calc.add(x, y);
		
		// Assert(期望得到的值)
		int value = 5;
		assertEquals("add error1", value , result);
	}
	
	@Test
	// 自行使用 assert
	public void test2() {
		// Arrange(安排)
		Calc calc = new Calc();
		int x = 2;
		int y = 3;
		
		// Act(實際得到的值)
		int result = calc.add(x, y);
		
		// Assert(期望得到的值)
		int value = 5;
		assert(value == result): "add error2";
	}
	
	
}
