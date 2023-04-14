import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a operação: 1 - adição, 2 - subtração, 3 - multiplicação, 4 - divisão - 5 - exponenciação, 6 - fatorial: ");

        int option = input.nextInt();

        System.out.println("Digite o valor 1: ");
        int value1 = input.nextInt();
        System.out.println("Digite o valor 2: ");
        int value2 = input.nextInt();

        System.out.println("Usar: 1 - polimorfismo, 2 - parâmetros: ");
        int value3 = input.nextInt();

        input.close();

        Operacao operacao;

        if (value3 == 1) {            
            switch (option) {
                case 1:
                    operacao = new Adicao();
                    operacao.setNumber1(value1);
                    operacao.setNumber2(value2);
                    System.out.println("Adição: " + operacao.calculate(operacao.getNumber1(), operacao.getNumber2()));
                    break;
                case 2:
                    operacao = new Subtracao();
                    operacao.setNumber1(value1);
                    operacao.setNumber2(value2);
                    System.out.println("Subtração: " + operacao.calculate(operacao.getNumber1(), operacao.getNumber2()));
                    break;
                case 3:
                    operacao = new Multiplicacao();
                    operacao.setNumber1(value1);
                    operacao.setNumber2(value2);
                    System.out.println("Multiplicação: " + operacao.calculate(operacao.getNumber1(), operacao.getNumber2()));
                    break;
                case 4:
                    operacao = new Divisao();
                    operacao.setNumber1(value1);
                    operacao.setNumber2(value2);
                    System.out.println("Divisão: " + operacao.calculate(operacao.getNumber1(), operacao.getNumber2()));
                    break;
                case 5:
                    operacao = new Exponenciacao();
                    operacao.setNumber1(value1);
                    operacao.setNumber2(value2);
                    System.out.println("Exponenciação: " + operacao.calculate(operacao.getNumber1(), operacao.getNumber2()));
                    break;
                case 6:
                    operacao = new Fatorial();
                    operacao.setNumber1(value1);
                    operacao.setNumber2(value2);
                    System.out.println("Fatorial: " + operacao.calculate(operacao.getNumber1(), operacao.getNumber2()));
                    break;
                default:  
                    System.out.println("Operação inválida.");
            }
        }
        if (value3 == 2) {
            switch (option) {
                case 1:
                    operacao = new Adicao();
                    System.out.println("Adição: " + operacao.calculate(value1, value2));
                    break;
                case 2:
                    operacao = new Subtracao();
                    System.out.println("Subtração: " + operacao.calculate(value1, value2));
                    break;
                case 3:
                    operacao = new Multiplicacao();
                    System.out.println("Multiplicação: " + operacao.calculate(value1, value2));
                    break;
                case 4:
                    operacao = new Divisao();
                    System.out.println("Divisão: " + operacao.calculate(value1, value2));
                    break;
                case 5:
                    operacao = new Exponenciacao();
                    System.out.println("Exponenciação: " + operacao.calculate(value1, value2));
                    break;
                case 6:
                    operacao = new Fatorial();
                    System.out.println("Fatorial: " + operacao.calculate(value1, value2));
                    break;
                default:  
                    System.out.println("Operação inválida.");
            }
        }
    }
}