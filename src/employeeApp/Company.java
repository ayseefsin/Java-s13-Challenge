package employeeApp;

import com.sun.nio.sctp.SctpSocketOption;

import javax.swing.*;
import java.util.Arrays;

public class Company {
   private int id;
   private String name;
   private double giro;
   private String[] developerNames;

    public Company(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        if(giro<0){System.out.println("Giro cannot be smaller than zero");}else{
        this.giro = giro;}
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if(giro<0){
            System.out.println("The value of giro cannot be smaller than zero");
        }else{
            this.giro = giro;
        }

    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
        if(index<0){
            System.out.println("Index cannot be smaller than zero");
        }else{
            try{
                if(developerNames[index]==null){
                    developerNames[index]=name;
                }else{
                    System.out.println("This index already has a value");
                }
            }
            catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Invalid index: "+ index);}
            catch (Exception exception){
                System.out.println("Error"+ exception.getMessage());}
        }

    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
