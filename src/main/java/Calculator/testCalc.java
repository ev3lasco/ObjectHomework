package Calculator;

public class testCalc {
    public static void main(String[] args) {
        RichCalculator calculations = new RichCalculator();
        calculations.num1 = 5;
        calculations.num2 = 10;
        calculations.add();
        calculations.subtract();
        calculations.multiply();
        calculations.divide();
    }
}
