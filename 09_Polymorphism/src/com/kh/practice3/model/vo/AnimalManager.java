package com.kh.practice3.model.vo;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] arr = new Animal[5];
		int random = (int)Math.random() * 2 +1;
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		arr[0] = new Dog("구","리트리버",55);
		arr[1] = new Cat("구","러시안블루","구","구");
		arr[2] = new Dog("구","불독",58);
		arr[3] = new Cat("구","러시안블루","구","구");
		arr[4] = new Dog("구","푸들",33);
		
		for(Animal a : arr) {
			a.speak();
		}
	}
}
