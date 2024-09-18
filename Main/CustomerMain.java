/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Controllers.CustomerController;
<<<<<<< HEAD
import Models.CustomerSet;
import Views.CustomerFrame;
=======
import Models.CustomerList;
import Models.CustomerSet;
import Views.CostumerFrame;
import Views.CustomerConsole;
>>>>>>> b7fec65 (Se agregan cambios)

/**
 *
 * @author jprod
 */
public class CustomerMain {

    /**
     * @param args the command line arguments
     */
<<<<<<< HEAD
    public static void main(String[] args) {       
        CustomerSet model = new CustomerSet();
        CustomerFrame view = new CustomerFrame();
=======
    public static void main(String[] args) { 
        CustomerSet model = new CustomerSet();
        CostumerFrame view = new CostumerFrame();
>>>>>>> b7fec65 (Se agregan cambios)
        CustomerController controller = new CustomerController(model,view);
        view.setController(controller);
        view.show();
    }
    
}
