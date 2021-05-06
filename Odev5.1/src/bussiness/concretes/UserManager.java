package bussiness.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import bussiness.abstracts.UserService;
import core.AuthService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
		private UserDao userDao;
		private AuthService authService;
		
		public UserManager(UserDao userDao, AuthService authService) {
			super();
			this.userDao = userDao;
			this.authService = authService;
		}
		
		public boolean add(User user, List<User> userList) {
			
			String regex = "(.+)@(.+)$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(user.geteMail());
			
			if (user.getPassword().length()>=6 && matcher.matches() && user.getName().length() >= 2) {
				for(User userFor : userList) {
					if(user.geteMail()==userFor.geteMail()) {
						System.out.println("bu email zaten kullanýlýyor");
						return false;
					}
				}
				userDao.add(user);
				authService.addUserAuth(user.getName());
				return true;
					
			}else {
				System.out.println(user.getName()+" lütfen girdiðiniz bilgileri kontrol ediniz.");
				return false;
			}
			
			
		}
		
}
