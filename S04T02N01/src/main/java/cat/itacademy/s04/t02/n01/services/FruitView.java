package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.model.Fruit;

public class FruitView {
	
	public void printFruitDetails(Fruit fruit) {
        System.out.println("Fuit (ID:" + fruit.getId());
        System.out.println("Name: " + fruit.getName());
        System.out.println("Quantity (kilo): " + fruit.getKiloQuantity());
    }


}



    