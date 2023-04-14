public class Fatorial extends Operacao {

    @Override
    public float calculate() {
        // Aqui também não entendi a relação entre os dois fatores com o fatorial. Por conta disso,
        // também somei o resultado final.
        float value1 = 0;
        float value2 = 0;

        while (getNumber1() != 0) {
            value1 += getNumber1();
            setNumber1(getNumber1() - 1);
        }

        while (getNumber2() != 0) {
            value2 += getNumber2();
            setNumber2(getNumber2() - 1);
        }

        return value1 - value2;
    }

    @Override
    public float calculate(int number1, int number2) {
        float value1 = 0;
        float value2 = 0;

        for (int i = 1; i < number1; i++) {
            value1 = value1 * i;
        }

        for (int i = 1; i < number2; i++) {
            value2 = value2 * i;
        }

        return value1 - value2;
    }
}
