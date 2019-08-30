/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package list;

import java.util.*;

/**
 * @author Ahmed Abuwarda, Date: Aug 30,2019.
 */
public class Reverse {

    private int[] arrA;

    /**
     * @param n Any int number.
     */
    private Reverse(int n) {

        arrA = new int[n];

    }

    /**
     * @param n Any int number.
     */
    private void nBits(int n) {

        // If statement.
        if (n <= 0) {

            System.out.println(Arrays.toString(arrA));

        } else {

            arrA[n - 1] = 0;
            nBits(n - 1);
            arrA[n - 1] = 1;
            nBits(n - 1);

        }

    }

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here.

        int n = 3;
        Reverse i = new Reverse(n);
        i.nBits(n);

    }

}