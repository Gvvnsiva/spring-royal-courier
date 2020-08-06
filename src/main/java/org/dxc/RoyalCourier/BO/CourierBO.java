package org.dxc.RoyalCourier.BO;

import java.util.Map;
import org.dxc.RoyalCourier.model.Courier;

public class CourierBO {
public double caluculateCourierCharge(Courier c,String city) {
	float courierCharge = c.getWeight() * c.getChargePerKg();
	for (Map.Entry<String, Float> entry : c.getServiceCharge().getLocationServiceCharge().entrySet()) {
		if (entry.getKey().equals(city)) {
			courierCharge = c.getWeight() * c.getChargePerKg();
			courierCharge = courierCharge + entry.getValue();
			break;

		}

	}
	return courierCharge;


	
	
	
	
	
}
}
