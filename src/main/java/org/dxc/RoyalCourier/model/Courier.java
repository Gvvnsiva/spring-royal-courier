package org.dxc.RoyalCourier.model;

public class Courier {
private int courierId;
private int weight;
private float chargePerKg ;
private String city;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
private ServiceChargeInfo serviceCharge ;
public int getCourierId() {
	return courierId;
}
public void setCourierId(int courierId) {
	this.courierId = courierId;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public float getChargePerKg() {
	return chargePerKg;
}
public void setChargePerKg(float chargePerKg) {
	this.chargePerKg = chargePerKg;
}
public ServiceChargeInfo getServiceCharge() {
	return serviceCharge;
}
public void setServiceCharge(ServiceChargeInfo serviceCharge) {
	this.serviceCharge = serviceCharge;
}


}
