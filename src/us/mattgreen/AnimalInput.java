/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mattgreen;

import java.util.*;

/**
 *
 * @author bitstudent
 */
public class AnimalInput {

    Scanner keyboard = new Scanner(System.in);
    private ArrayList list;

    public AnimalInput() {

    }

    public void addCat(ArrayList list) {
        int i = Integer.MAX_VALUE;

        System.out.println("Enter the name of the cat: ");
        String catName = keyboard.nextLine();
        while (i == Integer.MAX_VALUE) {
            System.out.println("Enter the number of mice killed");
            String miceKilled = keyboard.nextLine();
            try {
                i = Integer.parseInt(miceKilled);
            } catch (NumberFormatException e) {
                System.out.println("");
            }

            new Cat(i, catName);
        }
    }
   

    public void prompt(ArrayList list) {

        System.out.println("press 1. to add cat\n2. to add dog\n3. to add stud"
                + "ent");
        String ans = keyboard.nextLine();
        if (ans.equals("1")) {
            addCat(list);

        } else if (ans.equals("2")) {

        }
    }

}
