package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getName()+"adl� kullan�c� eklendi.");
		System.out.println(user.getName()+" adl� "+user.geteMail()+" mail adresli kullan�c�m�za do�rulama mesaj� g�nderildi.");
		System.out.println("Hesap onayland�");
	}

}
