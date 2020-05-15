import java.util.*;

import dependancy_inversion.bad.DatabaseHandler;
import liskov_substitution.bad.CorporateCustomer;
import liskov_substitution.bad.Customer;
import liskov_substitution.bad.IndividualCustomer;
import liskov_substitution.bad.Subscriber;
import open_close.bad.BadGreeter;
import open_close.good.CasualPersonality;
import open_close.good.FormalPersonality;
import open_close.good.Greeter;
import open_close.good.Personality;
import single_responsibility.bad.Book;
import interface_segregation.bad.*;
import single_responsibility.good.BookReader;

public class Main {
    public static void main(String[] args) throws Exception {
        //==Open Close example
        System.out.println("\nOpen Close Principle Violation");
        BadGreeter badGreeter = new BadGreeter();
        badGreeter.setFormality("casual");
        badGreeter.setFormality("intimate");
        Personality formalPersonality = new FormalPersonality();
        Personality casualPersonality = new CasualPersonality();
        Greeter greeter = new Greeter(casualPersonality);

        //==Single Responsibility Example
        System.out.println("\nSingle Responsibility Principle Violation");




        //==Liskov Substituion example
        System.out.println("\nLiskov Substituion Principle Violation");
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new IndividualCustomer("Jane", "individual"));
        customerList.add(new CorporateCustomer("BI Group", "corporate"));
        customerList.add(new Subscriber("Alice"));

        for(Customer customer : customerList){
            customer.addToDatabase();
        }
        //for(Customer customer : customerList){
            //customer.receiveCashback();
        //}

        //==Interface Segregation Example
        System.out.println("Interface segregation principle violation");
        Kitchen kitchen = new Kitchen();
        Order order1 = new Order(true, false);
        Order order2 = new Order(false, true);
        System.out.println(kitchen.cookOrder(order1).getName());
        System.out.println(kitchen.cookOrder(order2).getName());

        //
        DatabaseHandler databaseHandler = new DatabaseHandler();
        databaseHandler.connect();
        databaseHandler.disconnect();

    }
}
