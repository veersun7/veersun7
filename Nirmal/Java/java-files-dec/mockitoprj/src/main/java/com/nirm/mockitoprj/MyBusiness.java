package com.nirm.mockitoprj;

import java.util.ArrayList;
import java.util.List;

public class MyBusiness {

	public MyService myService;

	public MyBusiness(MyService myService) {
		this.myService = myService;
	}
	public List<String>getServicesForJava(String user){
	List<String> selectedServices = new ArrayList<String>();
	List<String> availableServices = myService.getServices(user); 
	
	for(String s: availableServices) {
		if(s.contains("Java")){
		selectedServices.add(s);
	}
	}
	return selectedServices;
}
	List<String> getServicesForSpring(String user) {
	List<String> springServices = new ArrayList<String>();
	List<String> allServices = myService.getServices(user);
	for(String service : allServices) {
		if (service.contains("Spring")|| service.contains("Spring")) {
		springServices.add(service);
	
		}
	}
	return springServices ;
}
}
