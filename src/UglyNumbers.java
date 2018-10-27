import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Program to find the nth ugly number
 * Ugly numbers are numbers whose only prime factors are 2,3,5
 */
public class UglyNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println("Nth ugly number is: " + getNthUglyNumber(n));
    }

    private static int getNthUglyNumber(int n) {
        int i = 1;
        int i2, i3, i5;
        i2 = i3 = i5 = 0;
        int uglyNumbers[] = new int[n];
        int multOf2, multOf3, multOf5, min;
        min = multOf2 = multOf3 = multOf5 = 1;
        uglyNumbers[0] = min;
        while (i < n) {
//            System.out.println("Mult of 2:" + multOf2 + "mult of 3:" + multOf3 + "mult of 5:" + multOf5);
//            System.out.println(min);
            multOf2 = uglyNumbers[i2] * 2;
            multOf3 = uglyNumbers[i3] * 3;
            multOf5 = uglyNumbers[i5] * 5;
            min = Math.min(multOf2, Math.min(multOf3, multOf5));

            uglyNumbers[i++] = min;
            if (min == multOf2) {
                i2 += 1;
            }
            if (min == multOf3) {
                i3 += 1;
            }
            if (min == multOf5) {
                i5 += 1;
            }
        }
        return uglyNumbers[n - 1];
    }
}
