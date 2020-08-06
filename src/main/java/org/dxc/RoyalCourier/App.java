package org.dxc.RoyalCourier;

import java.util.Scanner;

import org.dxc.RoyalCourier.model.Courier;
import org.dxc.RoyalCourier.service.CourierService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static CourierService courierService;

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ap=new ClassPathXmlApplicationContext("Beans.xml");
        Scanner s=new Scanner(System.in);
        Courier c=ap.getBean(Courier.class);
        System.out.println("Enter the courier ID");
        c.setCourierId(Integer.parseInt(s.nextLine()));
        System.out.println("Enter the total weight of parcel");
        c.setWeight(Integer.parseInt(s.nextLine()));
        System.out.println("Enter the city");
        c.setCity(s.nextLine());
        c.getChargePerKg();
    
		
        
    }
}
