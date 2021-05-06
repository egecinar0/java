package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getName()+"adlý kullanýcý eklendi.");
		System.out.println(user.getName()+" adlý "+user.geteMail()+" mail adresli kullanýcýmýza doðrulama mesajý gönderildi.");
		System.out.println("Hesap onaylandý");
	}

}
