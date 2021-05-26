package com.practice.pack;

import java.util.ArrayList;
import java.util.List;

import com.practice.pack.entities.User;

public class StreamAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User(1, "Vidhya", 28, 37000.12);
		User user2 = new User(2, "Padmanabhan",57,45000.00);
		User user3 = new User(3,"Krishna",32,3000.20);
		User user4 = new User(1, "Kiran", 27, 37000.12);
		User user5 = new User(2, "Karpagavalli",47,522000.00);
		User user6 = new User(3,"Alagar Samy",51,500.20);
		User user7 = new User(3,"Ramani",52,54400.20);
		
		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		users.add(user6);
		users.add(user7);
		
		Double average = users.stream().mapToDouble(User::getSalary).average().orElse(Double.NaN);
		System.out.println("Users average salary : "+average);
		
	}

}
