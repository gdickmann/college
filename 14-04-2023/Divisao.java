public class Divisao extends Operacao {

    @Override
    public float calculate() {
        return getNumber1() / getNumber2();
    }

    @Override
    public float calculate(int number1, int number2) {
        return number1 / number2;
    }
}
