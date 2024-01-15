package employeeApp;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
    Healthplan h1 = new Healthplan(1,"A Insurance", Plan.BASIC);
    Healthplan h2 = new Healthplan(2,"B Insurance", Plan.ADVANCE);
    String[] healthPlans = new String[3];
    healthPlans[0]=h1.getName();
    healthPlans[1]=h2.getName();
    Employee e1 = new Employee(1,"aysin maysin","aysin@aysin.com", "123456",healthPlans);
    e1.addHealthplan(0,"C Insurance");
    e1.addHealthplan(3,"C Insurance");
    e1.addHealthplan(2,"C Insurance");
    System.out.println(Arrays.toString(e1.getHealthPlans()));
    String[] developerNames = new String[4];
    Company c1 = new Company(7,"aysin company", 1200.50, developerNames  );
    Company c2 = new Company(5,"zeus company", -500.00, developerNames) ;

    c1.addEmployee(-3,"ayse");
    c1.addEmployee(0,"star");
    c1.addEmployee(4,"kemal");
    c1.addEmployee(0,"semiramis");
    c1.addEmployee(1,"nemesis");
    c1.addEmployee(2,"zeus");
    c1.addEmployee(2,"pokemon");
    System.out.println(Arrays.toString(developerNames));
    System.out.println("giro: "+c2.getGiro());

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
