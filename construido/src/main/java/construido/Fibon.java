package construido;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Fibon {
	static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
	static in n = 30;
	static int[] resultado = new int[n];
	public static void main(String[] args) {
		for (int i = 0; i < n; i++) {
            //System.out.print("(" + i + "):" + fibo(i) + "\t");
            resultado[i] = fibo(i);
        }

		JOptionPane.showMessageDialog(null, Arrays.toString(resultado));
		
	}

}
