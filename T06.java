// 12S24024 - Yesika Nadia Saragih
// 12S24024 - Grasia Gayatri Simanullang
import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nama = new String[4];
        int i;

        i = 0;
        temanSekamar(nama, i);
        i = func_input(nama, i);
        output(nama, i);
    }
    
    public static int func_input(String[] nama, int n) {
        int i;

        i = 0;
        for (n = 0; n <= 3; n++) {
            nama[n] = input.nextLine();
            if (nama[n].equals("---")) {
                n = 10;
            } else {
                n = n;
                i = i + 1;
            }
        }
        
        return i;
    }
    
    public static void output(String[] nama, int i) {
        int h;

        for (h = 0; h <= i - 1; h++) {
            System.out.println(nama[h]);
        }
    }
    
    public static void temanSekamar(String[] nama, int i) {
        int n;

        n = 0;
        for (n = 0; n <= 3; n++) {
            nama[n] = "";
        }
    }
}
