package com.hsbc.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;

public class FileBackedDao implements UserDao{

	private List<User> userList = deserialize();
	
	@Override
	public User store(User user) {
		int id = userList.size();
		user.setUserId(++id);
		userList.add(user);
		serialize(userList);
		return user;
	}

	@Override
	public User[] fetchUsers() {
		userList = deserialize();
		User[] userArray = userList.toArray(new User[userList.size()]); 
		return userArray;
	}

	@Override
	public User updateUser(int userId, User user) throws UserNotFoundException {
		userList = deserialize();
		for(int i = 0;i<userList.size();i++){
			if(userList.get(i).getUserId() == userId){
				userList.add(i, user);
				serialize(userList);
				return user;
			}
		}
		throw new UserNotFoundException();
	}

	@Override
	public User fetchById(int userId) throws UserNotFoundException {
		userList = deserialize();
		for(int i = 0;i<userList.size();i++){
			if(userList.get(i).getUserId() == userId){
				return userList.get(i);
			}
		}
		throw new UserNotFoundException();
	}
	
	
	
	
	public void serialize(List<User> userList){
	try{
		FileOutputStream fos = new FileOutputStream("fileDb.ser");
		// creates an instance that can store complex object into the output stream
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(userList); // checks whether the object is Serializable type
		System.out.println("Object Serialized");
		fos.flush(); // flushes the output stream
		oos.close();
		fos.close();
	} catch(IOException e) {
		e.printStackTrace();
		}
	}
	public List<User> deserialize(){
		List<User> list = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("fileDb.ser");
			// allows you to read the object from the input stream
			ois = new ObjectInputStream(fis);

			list = (List<User>)ois.readObject();
//			for(User user : list) {
//				System.out.println(user);
//			}
			ois.close();
			fis.close();

		} catch(FileNotFoundException e){
			userList = new ArrayList<User>();
			serialize(userList);
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

}
