package org.dxc.RoyalCourier.service;

import org.dxc.RoyalCourier.BO.CourierBO;
import org.dxc.RoyalCourier.model.Courier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourierService {
	private CourierBO cBoObj;

	public CourierBO getcBoObj() {
		return cBoObj;
	}

	public void setcBoObj(CourierBO cBoObj) {
		this.cBoObj = cBoObj;
	} 
	public double calculateCourierCharge(int courierId, int weight,String city) {
		double couriercharge = 0;
		if(weight>0&&weight<1000) {
		
			ApplicationContext ap=new ClassPathXmlApplicationContext("Beans.xml");
			Courier c=ap.getBean(Courier.class);

			c.setCourierId(courierId);
			c.setWeight(weight);
			couriercharge = cBoObj.caluculateCourierCharge(c,city);

			System.out.println("courier charge:"+cBoObj.caluculateCourierCharge(c, city));
		
		}
		else
		{
			try {
				throw new Exception();
			}
		catch(Exception e) {
			System.out.println("Invalid Parcel Weight");
			System.out.println(e.getMessage());
		}
		}
		return weight;
	
}}
