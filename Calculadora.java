package calculadoraLambda;

import java.util.function.BiFunction;

public class Calculadora {

      public Double calcular(Integer num1, Integer num2, BiFunction<Integer, Integer, Double> biFunction) {
          return biFunction.apply(num1, num2);
      }

}
