/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DS-Demabildo
 */
public class arrayclass {
    //pangbilin nko mga print hh

    int i = 0, j = 0, matches = 0, random = 0, size = 0,frange =0,lrange =0;
    float flrandom = 0;
    int arraynisya[];
    float flarray[];

    DefaultTableModel displayt = new DefaultTableModel();
    JTable table = new JTable(displayt);

    void andb() {
        set_size(get_size());
        arraynisya = new int[size];
        i=0;
        while (i != size) {
            int l = i;
            j = 0;
            while (j != 1) {
                //System.out.println("array# " + i);
                j = 0;
                matches = 0;
                l = i;
                random = (int) (Math.random() * size);
                do {
                    arraynisya[i] = random;
                    if (arraynisya[l] == random) {
                        matches++;
                    }
                    //System.out.println("random =" + random + " | array " + l + "=" + arraynisya[l] + " | matches " + matches);
                    l--;
                } while (l >= 0);
                if (matches > 1) {
                    j = 0;
                } else if (matches <= 1) {
                    j = 1;
                }
            }
            i++;
        }
    }
    
        void flandb() {
        set_size(get_size());
        flarray = new float[size];
        i=0;
        while (i != size) {
            int l = i;
            j = 0;
            while (j != 1) {
                //System.out.println("array# " + i);
                j = 0;
                matches = 0;
                l = i;
                flrandom = (float) (Math.random() * size);
                do {
                    flarray[i] = (float)flrandom;
                    //System.out.println("flarray "+flarray[i]+" flrandom "+flrandom);
                    //float array was not comparing so,,, string :'D it just works!
                    if (Float.toString(flarray[i]) == Float.toString(flrandom)) {
                        matches++;
                    }
                    //System.out.println("random =" + random + " | array " + l + "=" + arraynisya[l] + " | matches " + matches);
                    l--;
                } while (l >= 0);
                if (matches > 1) {
                    j = 0;
                } else if (matches <= 1) {
                    j = 1;
                }
            }
            i++;
        }
    }

    void displayni() {
        System.out.println(Arrays.toString(arraynisya));
    }
    
    void fldisplayni() {
        System.out.println(Arrays.toString(flarray));
    }

    void set_size(int s) {
        size = s;
    }

    int get_size() {
        return size;
    }
    
    void set_frange(int r) {
        frange = r;
    }

    int get_frange() {
        return frange;
    }
    
    void set_lrange(int r) {
        lrange = r;
    }

    int get_lrange() {
        return lrange;
    }

    int search(int num) {
        int k = 0, i = 0;
        for (k = 0; i != 1; k++) {
            if (arraynisya[k] == num) {
                i = 1;
            }
        }
        return k - 1;
    }
    int insearch(int num) {
        int k = 0, i = 0;
        for (k = 0; i != 1; k++) {
            if (arraynisya[k] == num) {
                i = 1;
            }
        }
        return k - 1;
    }
    
    String flsearch(float num) {
        int flsz=get_size();
        int k = 0, i = 0;
        for (k = 0; i != 1; k++) {
            if (flarray[k] == num ) {
            i = 1;
            }else if(k==flsz){
            i=1;
            }
        }
        k=k-1;
        return Float.toString(k);
    }
    
    void flwrange(){
        int fr =0, lr =0;
        fr = get_frange(); lr = get_lrange();
        System.out.println("");
        for (int k = fr; k <= lr; k++) {
            System.out.print(flarray[k]+" @ index #"+ k+", ");
        }
        System.out.println("");
    }

}
