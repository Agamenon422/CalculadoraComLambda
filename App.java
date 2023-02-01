package calculadoraLambda;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Digite um número: ");
        Integer numero1 = input.nextInt();
        System.out.println();

        System.out.print("Digite outro número: ");
        Integer numero2 = input.nextInt();

        while (numero1 < 0 || numero2 < 0){
            System.out.println("\nDigite um número positivo ou zero!");
            System.out.print("Digite um número: ");
            numero1 = input.nextInt();
            System.out.print("Digite outro número: ");
            numero2 = input.nextInt();
        }
        Double resultado;


        BiFunction<Integer, Integer, Double> soma = (num1, num2) -> (double) num1 + num2;
        resultado = calculadora.calcular(numero1, numero2, soma);//atribuindo o valor de um mét a UMA VARIÁVEL;
        System.out.println("\nSoma = " + resultado);
        System.out.println("*******************************");

        BiFunction<Integer, Integer, Double> subtracao = (num1, num2) -> (double) num1 - num2;
        resultado = calculadora.calcular(numero1, numero2, subtracao);
        System.out.println("Subtração = " + resultado);
        System.out.println("*******************************");

        BiFunction<Integer, Integer, Double> multiplicacao = (num1, num2) -> (double) num1 * num2;
        resultado = calculadora.calcular(numero1, numero2, multiplicacao);
        System.out.println("Multiplicação = " + resultado);
        System.out.println("*******************************");

        BiFunction<Integer, Integer, Double> divisao = (num1, num2) -> (double) num1 / num2;
        resultado = calculadora.calcular(numero1, numero2, divisao);
        System.out.println("Divisão = %.2f".formatted(resultado));
        System.out.println("*******************************");

    }

}
