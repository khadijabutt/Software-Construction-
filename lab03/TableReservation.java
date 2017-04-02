/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablereservation;

/**
 *
 * @author Khadija
 */
import java.util.*;
import static java.lang.System.*; // Main method is used to test the reservation system
public class TableReservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restaurant R = new Restaurant();


        R.reserve(12, "Hassan", 11, 4);

        R.reserve(7,"Saad",9,12);             //Testing different cases

        R.reserve(2, "Ali", 15, 4);

        R.reserve(5, "Ahmed", 14, 0);
    }
    
}
