import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = "1";
        while (true) {
            number = sc.next();
            if (number.equals("0")) break;
            try {
                System.out.println(Integer.parseInt(number) * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + number);
            }
        }
    }
}