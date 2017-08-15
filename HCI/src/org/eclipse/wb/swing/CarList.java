package org.eclipse.wb.swing;

import java.util.ArrayList;

public class CarList {

public ArrayList<Car> cars = new ArrayList<>();
	
	public CarList(){
		
	}
	
	public void newCar(String o, String id, String b, String td, String cc){
		Car c1=new Car(o,id,b,td,cc);
		cars.add(c1);
		
	
	}
	
	public void deleteCar(String name){
		
		for(int i = 0; i < cars.size(); i++){
			if(cars.get(i).getID().equals(name)){
				cars.remove(i);
			}
		}
	}

	public int getSize() {
		return cars.size();
	}

	public Car getItem(int i) {
		// TODO Auto-generated method stub
		return cars.get(i);
	}
	
	
	
}
