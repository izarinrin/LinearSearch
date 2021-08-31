/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

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
        int asksize = 0, numsearch =0, flint = 0;
        float flsearch=0;
        boolean menu=false;
        Scanner input = new Scanner(System.in);
        
       // long startTime = 
        while (flint!=3) {
            menu=false;            
            System.out.println("[1]Int [2]Float [3]Exit");
            flint = Integer.parseInt(input.nextLine());
            switch(flint){
                case 1:
                            
                System.out.print("Size?: ");
                asksize = Integer.parseInt(input.nextLine());
                if (asksize < 0) {
                    System.out.println("ayaw negative uie");
                } else {
                    arre.set_size(asksize);
                    arre.andb();
                    arre.displayni();
                }

                while (menu != true) {
                    /* menu = Integer.parseInt(JOptionPane.showInputDialog(null, "[1]Search"));
                    if (menu == 1) {*///if naay idungag
                    int intmenu=0;
                    System.out.println("[1]Seach using number [2] Display Array [3]Exit");
                    intmenu = Integer.parseInt(input.nextLine());
                    switch(intmenu){
                        case 1:
                            System.out.print("Number?: ");
                            numsearch = Integer.parseInt(input.nextLine());
                            if (numsearch > asksize - 1 || numsearch < 0) {
                            System.out.println("not on list ");
                            } 
                            else{
                            System.out.println("index @ " + arre.search(numsearch));
                            }                
                            break;
                        case 2:
                            arre.displayni();

                            break;
                        case 3:
                            menu =true;

                            break;
                    }
                }
                            break;
                    
                case 2:
                            
                    System.out.print("Size?: ");
                    asksize = Integer.parseInt(input.nextLine());
                    if (asksize < 0) {
                        System.out.println("ayaw negative uie");
                    } else {
                        arre.set_size(asksize);
                        arre.flandb();
                        arre.fldisplayni();
                    }
                    
                    while (menu != true) {
                    /* menu = Integer.parseInt(JOptionPane.showInputDialog(null, "[1]Search"));
                    if (menu == 1) {*///if naay idungag
                    int flmenu=0;
                    System.out.println("[1]Display float array with index in a range [2] Display Array [3]Exit");
                    flmenu = Integer.parseInt(input.nextLine());
                    switch(flmenu){
                        case 1:
                            int fra=0,lra =0, sz=arre.get_size()-1;
                            boolean ttt=false;
                            while(ttt!=true){
                                System.out.println("choose from 0 - " + sz + "\nFrom what index?:");
                                fra = Integer.parseInt(input.nextLine());
                                if (fra<=sz) {
                                    arre.set_frange(fra);
                                    ttt=true;
                                } else{
                                    System.out.println("wrong input");
                                }
 
                            }
                            ttt=false;
                            while (ttt!=true) {
                                System.out.println("choose from " + fra + " - " + sz + "\nto what index?:");
                                lra = Integer.parseInt(input.nextLine());                                
                                if (lra <=sz && lra >= fra) {
                                    arre.set_lrange(lra);
                                    ttt=true;
                                }else {
                                    System.out.println("wrong input");
                                }
                            }
                            ttt=false;
                            arre.flwrange();
                            break;
                        case 2:
                            arre.fldisplayni();

                            break;
                        case 3:
                            menu =true;
                            /*  keeping this basin lngSystem.out.print("Number(with decimals): ");
                            flsearch = Float.parseFloat(input.nextLine());
                            int hhh = Integer.parseInt(arre.flsearch(flsearch));
                            if (flsearch > asksize - 1 || flsearch < 0 || hhh==-1) {
                            System.out.println("not on list");
                            } else {
                            System.out.println("index @ " + arre.flsearch(flsearch));
                            }*/

                            break;
                    }
                }
                            break;

            }
        }  
    }
}
