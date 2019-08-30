package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_ArrayList {

    public static void main(String[] args) {

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