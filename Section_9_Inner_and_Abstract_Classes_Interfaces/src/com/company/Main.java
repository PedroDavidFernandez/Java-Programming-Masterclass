package com.company;

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
    }
}
