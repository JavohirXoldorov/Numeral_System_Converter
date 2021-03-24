package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int sourceRadix = Integer.parseInt(sc.nextLine());
            String sourceNumber = sc.nextLine();
            int targetRadix = Integer.parseInt(sc.nextLine());

            String ans = "";
            boolean isContinue = true;
            for (int i = 0; i < sourceNumber.length(); i++) {
                if (sourceNumber.charAt(i) == '.') continue;
                int val = sourceNumber.charAt(i) - 48;
                if (val > 9) val = val - 49;
                if (val >= 0 && val <= 36 && val <= sourceRadix) {
                    isContinue = true;
                } else {
                    isContinue = false;
                    break;
                }
            }
            if (isContinue && targetRadix > 0 && targetRadix <= 36 && sourceRadix > 0 && sourceRadix <= 36) {
                int number = 0, k = 1;
                if (sourceNumber.indexOf('.') != -1) {
                    int index = sourceNumber.indexOf('.');
                    ans = Integer.toString(Integer.parseInt(sourceNumber.substring(0, index), sourceRadix), targetRadix).concat(".");
                    double d = 0;
                    for (int j = index + 1; j < sourceNumber.length(); j++) {
                        String ch = "";
                        ch += sourceNumber.charAt(j);
                        d += (Integer.parseInt(ch, sourceRadix)) / Math.pow(sourceRadix, k++);
                    }
                    int in = 0;
                    while (in < 5) {
                        d *= targetRadix;
                        int z = (int) d;
                        ans = ans.concat(Integer.toString(z, targetRadix));
                        d = d - (int) d;
                        in++;
                    }

                } else {
                    int num;
                    if (sourceRadix == 1) {
                        num = sourceNumber.length();
                    } else {
                        num = Integer.parseInt(sourceNumber, sourceRadix);
                    }
                    if (targetRadix == 1) {
                        for (int i = 0; i < num; i++) {
                            ans = ans.concat("1");
                        }
                    } else {
                        ans = Integer.toString(num, targetRadix);
                    }
                }
                System.out.println(ans);
            } else {
                System.out.println("error");
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
