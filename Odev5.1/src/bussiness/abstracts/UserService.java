package bussiness.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
		boolean add(User user,List<User> userList);
}
