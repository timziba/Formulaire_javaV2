package com.objis.gestionformationssession.service;

import com.objis.gestionformationssession.dao.UserDAO;
import com.objis.gestionformationssession.metier.User;

public class ServiceGestion {
	
	private UserDAO userDAO;
	
	public ServiceGestion() {
		userDAO = new UserDAO();
	}
	
	public boolean authentification(User user) {
		return userDAO.authentification(user.getLogin(), user.getPassword());
	}
	
	public void insert(String nom, String prenom, String mail, String mdp) {
		userDAO.insert(nom, prenom, mail, mdp);
	}
}
