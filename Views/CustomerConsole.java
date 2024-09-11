/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import Models.Customer;
import Models.CustomerList;
import Utils.UtilConsole;
import Utils.UtilDate;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author jprod
 */
public class CustomerConsole{
    CustomerList list;
    

    public CustomerConsole() {
        list=new CustomerList();
    }
    
    public void show(){
        int op=0;
        do{
            op=menu();
            switch(op){
                case 1->{
                    insert();
                }
                case 2->{
                    update();
                }
                case 3->{
                    delete();
                }
                case 4->{
                    read();
                }
                case 5->{
                    readAll();
                }
            }
        }while(op!=0);
    }
    
    private int menu(){
        UtilConsole.print("1 - Agregar");
        UtilConsole.print("2 - Modificar");
        UtilConsole.print("3 - Eliminar");
        UtilConsole.print("4 - Buscar");
        UtilConsole.print("5 - Mostrar Todo");
        UtilConsole.print("0 - Salir");
        return UtilConsole.getInputInt("Seleccione una opcion");
    }
    
    private void insert(){
        int id= UtilConsole.getInputInt("Ingrese el id");
        String name=UtilConsole.getInputString("Ingrese el Nombre");
        String date=UtilConsole.getInputString("Ingrese la Fecha de Nacimiento");
        LocalDate birthDate = UtilDate.stringToLocalDate(date);        
        String phone=UtilConsole.getInputString("Ingrese el Telefono");
        String email=UtilConsole.getInputString("Ingrese el correo electronico");
        Customer customer = new Customer(id,name,birthDate,phone,email);
        if (list.add(customer))
            showMessage("Cliente agregado.");
        else
            showErrorMessage("Error al agregar.");
    }
    
    private void update(){
        int id= UtilConsole.getInputInt("Ingrese el id");
        Customer customer = new Customer(id);
        customer=list.get(customer);
        if (customer!=null){
            String phone=UtilConsole.getInputString("Ingrese el Telefono");
            customer.setPhone(phone);
            if (list.set(customer))
                showMessage("Cliente actualizado.");
            else
               showErrorMessage("Error al actualizar.");
        }else{
            showErrorMessage("Error cliente no encontrado");
        }
    }
    
    private void delete(){
        int id= UtilConsole.getInputInt("Ingrese el id");
        Customer customer = new Customer(id);
        customer=list.get(customer);
        if (customer!=null){
            list.remove(customer);
            showMessage("Cliente eliminado.");
        }else{
            showErrorMessage("Error cliente no encontrado");
        }
    }
    
    private void read(){
        int id= UtilConsole.getInputInt("Ingrese el id");
        Customer customer = new Customer(id);
        customer=list.get(customer);
        if (customer!=null){
            display(customer);
        }else{
            showErrorMessage("Error cliente no encontrado");
        }
    }
    
    private void readAll(){
        List<Customer> customers=list.getAll();
        if(customers!=null){
            displayAll(customers);
        }else{
            showMessage("No hay datos");
        }
        
    }
    
    public void showMessage(String str){
        UtilConsole.print(str);
        UtilConsole.getInputString("Presione enter para continuar");
    }
    
    public void showErrorMessage(String str){
        UtilConsole.print(str,UtilConsole.COLOR_RED);
        UtilConsole.getInputString("Presione enter para continuar");
    }
    
    public void display(Customer customer){
        UtilConsole.print(customer.toString(), UtilConsole.COLOR_BLUE);
        UtilConsole.getInputString("Presione enter para continuar");
    }
    
    public void displayAll(List<Customer> customers){
        for(Customer customer:customers){
            UtilConsole.print(customer.toString(), UtilConsole.COLOR_GREEN);
        }
        UtilConsole.getInputString("Presione enter para continuar");
    }

}
