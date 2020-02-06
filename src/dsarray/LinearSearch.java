/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsarray;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DS-Demabildo
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        arrayclass arre = new arrayclass();
        int asksize = 0, menu = 0, numsearch = 0;
        Scanner input = new Scanner(System.in);
        
       // long startTime = 
        System.out.print("Size?: ");
        asksize = Integer.parseInt(input.nextLine());
        if (asksize < 0) {
            System.out.println("ayaw negative uie");
        } else {
            arre.set_size(asksize);
            arre.andb();
            arre.displayni();
        }

        while (menu != 5) {
            /*  menu = Integer.parseInt(JOptionPane.showInputDialog(null, "[1]Search"));
            if (menu == 1) {*///if naay idungag
            System.out.print("Search?: ");
            numsearch = Integer.parseInt(input.nextLine());
            if (numsearch > asksize - 1 || numsearch < 0) {
                System.out.println("not on list uie, \nsobra or negative wa mi ana, \npang stop pd");
                menu = 5;
            } else {
                System.out.println("index @ " + arre.search(numsearch));
            }

        }
    }
}
