package JavaCoreLamda_1_1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); // На ноль делить нельзя
        calc.println.accept(c);
    }
}
