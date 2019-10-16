package com.exercise11oop.app;

import com.exercise11oop.model.Dog;

public class DogApp 
{

	public static void main(String[] args) 
	{
	
		//WAY 1
		Dog pluto;
		pluto = new Dog();
		
		System.out.println("Pluto's age: " + pluto.age);
		System.out.println("Pluto's height: " + pluto.height);	
		System.out.println("Pluto's id: " + pluto.id);
		
		
		//WAY 2
		Dog tribilin = new Dog();
		
		pluto.age=15;
		pluto.height=50;
		pluto.id = 10;
		
		System.out.println("Pluto's age: " + pluto.age);
		System.out.println("Pluto's height: " + pluto.height);	
		System.out.println("Pluto's id: " + pluto.id);
		
		Dog firulais = new Dog(1, "Firulais", "Labrador", 5, 62.5);
		
		System.out.println("Firulais age: " + firulais.age);
		System.out.println("Firulais height: " + firulais.height);	
		System.out.println("Firulais id: " + firulais.id);
		
		
	}

}
