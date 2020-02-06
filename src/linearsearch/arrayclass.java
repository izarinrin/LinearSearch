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

    int i = 0, j = 0, matches = 0, random = 0, size = 0;
    int arraynisya[];

    DefaultTableModel displayt = new DefaultTableModel();
    JTable table = new JTable(displayt);

    void andb() {
        set_size(get_size());
        arraynisya = new int[size];
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

    void displayni() {
        System.out.println(Arrays.toString(arraynisya));
    }

    void set_size(int s) {
        size = s;
    }

    int get_size() {
        return size;
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

}
