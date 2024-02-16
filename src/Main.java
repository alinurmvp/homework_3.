//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] NUM = {2.3, 3.4, -5.6, 7.8, -9.3, 4.1, 5.5, 4.2, 1.1, -1.1, 3.3, 5, 5, -8.1, 9.4, -4.5};
        boolean ali = false;
        int zero = 0;
        double zeroDouble = 0;
        for (double numbers : NUM) {
            if (numbers < 0) {
                ali = true;
            } else if (numbers > 0 && ali) {
                zeroDouble = numbers;
                zero++;
                System.out.println(numbers);
            }
        }
        System.out.println("вывод среднего арифметического числа " + zeroDouble / zero);
    }
}