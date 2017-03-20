package Serveur;

import javax.xml.ws.Endpoint;

import Service.BanqueService;

public class Serveur {

	public static void main(String[] args){
		String url = "http://localhost:8585/";
		Endpoint.publish(url, new BanqueService()); //pour publier le webService BanqueService
		//Endpoint va ouvrir un webservice sur le port 8585
		
		System.out.println(url);
	}
}
