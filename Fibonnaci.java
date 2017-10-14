/**
 * Created by martinluternainggolan on 10/14/17.
 */

public class Fibonnaci {
    private void Solution(int length) {
        int[] a = new int[length];
        String word = "";
        int avr = 0;

        a[0] = 1;
        a[1] = 2;

        for (int i = 2; i < length; i++) {
            a[i] = a[i - 2] + a[i - 1];
        }

        for (int i = 0; i < a.length; i++) {
            avr = avr + a[i];
            word = word + "" + a[i] + ", ";
        }

        System.out.println("Sum Average: " + avr / a.length);
        System.out.println("Fibonnaci output: " + word);
    }

    public static void main(String[] args) {
        new Fibonnaci().Solution(10);
    }
}
