package jspbook.ch02;

public class CalcBean { // 멤버변수
	private int num1 = 0, num2 = 0;
	private String operator = "";
	private int result;

// 계산기능 메서드
	public void calculate() {
		if (operator.equals("+")) {
			result = num1 + num2;
		} else if (operator.equals("-")) {
			result = num1 - num2;
		} else if (operator.equals("*")) {
			result = num1 * num2;
		} else if (operator.equals("/")) {
			result = num1 / num2;
		}
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = (num2);
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public void setResult(int result) {
		this.result = result;
	}

   // getXxx 메서드
	public int getResult() {
		return result;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public String getOperator() {
		return operator;
	}
}

