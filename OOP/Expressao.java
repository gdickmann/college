import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author: Gustavo Henrique Dickmann
 */

public class Expressao {

    public static void main(String[] args) {
        Expressao expressao = new Expressao("(1111112))");
        System.out.println(String.valueOf(expressao.estaCorretaSintaticamente()));
    }
    
    private String expressao;

    public Expressao(String expressao) {
        this.expressao = expressao;
    }

    public boolean estaCorretaSintaticamente() {
        Stack<Character> stack  = new Stack<Character>();
        for (int i = 0; i < this.expressao.length(); i++) {
            char c = this.expressao.charAt(i);

            if(c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }           
            }
        }
        return stack.isEmpty();
    }

    public int getQtdDivisores() {
        int quantity = this.expressao.length() - this.expressao.replace("/", "").length();
        return quantity;
    }

    public int getPosicaoOperador() {
        /** Com certeza existem maneiras mais fáceis de fazer isso, mas estou com 
         * preguiça de refatorar esse código.
         */

        String[] operators = new String[] {"+", "-", "*", "/"};
        List<Integer> operatorsFound = new ArrayList<Integer>();

        boolean contains = false;
        int characterIndex = 0;

        for (String operator : operators) {
            if (this.expressao.contains(operator)) {
                contains = true;

                characterIndex = this.expressao.indexOf(operator);
                operatorsFound.add(characterIndex);
    
                characterIndex = Collections.min(operatorsFound);
            }
        }

        if (contains)
            return characterIndex;

        return -1;
    }
}