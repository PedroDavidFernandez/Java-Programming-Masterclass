package com.interfaces;

public class Main {

    public static void main(String[] args) {
	    ITelephone pedroPhone;
	    pedroPhone = new DeskPhone(1234567);
	    pedroPhone.powerOn();
	    pedroPhone.callPhone(1234567);
	    pedroPhone.answer();

	    pedroPhone = new MobilePhone(999666);
	    pedroPhone.callPhone(999666);
	    pedroPhone.answer();

	    // abstract classes
		Dog dog = new Dog("Yorkie");
		dog.eat();
		dog.breathe();

		Parrot parrot = new Parrot("Australian ringneck");
		parrot.eat();
		parrot.fly();
    }
}
