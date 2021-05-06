import java.util.ArrayList;

import bussiness.abstracts.UserService;
import bussiness.concretes.UserManager;
import core.GoogleAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		ArrayList<User> listUser = new ArrayList<User>();
		User ege = new User("Ege Çýnar", "ege123cinar@gmail.com", "123456yedi");
		User selin = new User("Selin Akdoðan", "sln321akd@hotmail.com", "1597");
		User umut = new User("Umut Katar", "umut", "umt2233");
		User zeynep = new User("Zeynep Bozkurt", "2277zynabc@mynet.com", "zyn01zyn");
	
	UserService userService = new UserManager(new HibernateUserDao(),new GoogleAdapter());
		
	if(userService.add(ege, listUser)) {
		listUser.add(ege);
	}
	if(userService.add(selin, listUser)) {
		listUser.add(selin);
	}
	if(userService.add(umut, listUser)) {
		listUser.add(umut);
	if(userService.add(zeynep, listUser)) {
		listUser.add(zeynep);
		}
	}
}
}

