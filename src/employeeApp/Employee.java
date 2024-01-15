package employeeApp;

import java.util.Arrays;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String password;

    private String[] healthPlans;

    public Employee(int id, String name){
        this.id=id;
        this.name=name;
    }

    public Employee(int id, String name, String email, String password, String[] healthPlans) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public void addHealthplan(int index, String name){
        if(index<0){System.out.println("Index value cannot be smaller than zero");}
        else{
            try{
                if(healthPlans[index]==null){
                    healthPlans[index]=name;
                }else{
                    System.out.println("This index already has a value- Index: "+index);
                }

            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Invalid index: " + index);

            }catch(Exception exception ){
                System.out.println("error "+ exception.getMessage());

            }

            }
        }
    @Override

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    };
    }



