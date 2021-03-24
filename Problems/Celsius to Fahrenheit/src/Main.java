import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c = scanner.nextDouble();
        double f = 1.8 * c + 32;
        System.out.println(f);
    }
}