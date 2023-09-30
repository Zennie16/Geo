/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Controller.Manager;
import java.util.ArrayList;
import Model.Country;


public class Main {

    public static void main(String[] args) {
        ArrayList<Country> lc = new ArrayList<>();
        //loop until user want to exist
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.inputCountry(lc);
                    break;
                case 2:
                    Manager.printCountry(lc);
                    break;
                case 3:
                    Manager.searchByName(lc);
                    break;
                case 4:
                    Manager.printCountrySorted(lc);
                    break;
                case 5:
                    return;
            }
        }
    }
}
