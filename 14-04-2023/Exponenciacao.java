public class Exponenciacao extends Operacao {

    @Override
    public float calculate() {
        // Professor, não entendi como você queria o resultado final da exponenciação
        // dos dois fatores. Por isso, fiz uma operação de adição no resultado final.
        return (getNumber1() * getNumber1()) + (getNumber2() + getNumber2());
    }

    @Override
    public float calculate(int number1, int number2) {
        return (number1 * number1) + (number2 * number2);
    }
}
