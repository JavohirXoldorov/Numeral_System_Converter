import java.util.Scanner;

class ConcatenateStringsProblem {
    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();

        String ans = "", str = String.join("", strings);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - 48 > 9) {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}