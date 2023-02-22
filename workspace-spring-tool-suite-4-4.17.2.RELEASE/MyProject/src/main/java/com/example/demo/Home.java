package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Home {
	
	
	    public  Home() {
	    	System.out.println("Home Home");
	    }
	
        private String owner;
        private int doorno;
        @Autowired
        private Internetconnection modem;
		public String getOwner() {
			return owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		public int getDoorno() {
			return doorno;
		}
		public void setDoorno(int doorno) {
			this.doorno = doorno;
		}
		public void contect() {
			modem.switchOn();
			System.out.println("Contect the internet");
		}
}
