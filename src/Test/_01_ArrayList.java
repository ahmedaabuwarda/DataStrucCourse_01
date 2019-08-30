/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ahmed Abuwarda, Date: Aug 30,2019.
 */
public class _01_ArrayList {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = input.nextInt();
        AddToArray(age);
        //System.out.println();

    }

    private static void AddToArray(int age) {

        try {

            ArrayList<Integer> array = new ArrayList<>();
            //array.add(age);
            array.set(age, 0);
            System.out.println(array.get(0));

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Error");

        }

    }

}