package com.personal.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.personal.hackerank.Player;
import com.personal.pojoobj.Employee;

public class ConsumerProducerEx1 {
	
	public static void main(String[] args) {
		List<Player> players = new ArrayList<Player>(); 
		players.add(new Player("Haland", 90));
		players.add(new Player("Mount", 85));
		players.add(new Player("Mbappe", 92));
		players.add(new Player("Ronaldo", 92));
		players.add(new Player("Havertz", 84));
		players.add(new Player("Messi", 93));
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1000, 1, "Subhendu", "IT"));
		employees.add(new Employee(2000, 2, "BC", "Finance"));
		employees.add(new Employee(3000, 3, "QQ", "IT"));
		employees.add(new Employee(2000, 4, "DD", "MARKETING"));
		employees.add(new Employee(4000, 5, "BC", "Finance"));
		employees.add(new Employee(20000, 6, "OUTSTANDING", "IT"));
//		int highestSal = 0;
//		final Employee emp;
//		employees.stream().forEach( e -> {
//			if(e.getSalary() > highestSal)
//				highestSal = e.getSalary();
//		}
//		);
		System.out.println(employees);
		Predicate<Player> brilliantPlayerCheck = p -> p.getScore() > 80;
		Function<Player, String> f = p -> {
			if(p.getScore()>80 && p.getScore()<90)
				return "Good";
			return "Excellent";
		};
		Predicate<Player> nameStartsWithM = p -> p.getName().indexOf("M") == 0;
		Predicate<Player> haveFiveLetter = p -> p.getName().length() == 5;
		for(Player player : players)
			if(brilliantPlayerCheck.and(nameStartsWithM).and(haveFiveLetter).test(player))
				System.out.println(player);
		
		DoublePredicate db = d -> d%2==0;
		float floatVar = 5.5502f;
		final double doubleVar = 5.58;
//		doubleVar = doubleVar + floatVar;
		
		BooleanSupplier bs = () ->  doubleVar != 0;
		bs.getAsBoolean();
		
		db.test(floatVar);
		
		Function<Integer, Integer> f1 = i -> i*i;
		Function<Integer, Integer> f2 = i -> i+i;
		Function<Integer, Integer> f3 = i -> i*2;
		Function<Integer, Integer> f4 = i -> {
			return i*i*i;
		};
		
		System.out.println(f1.compose(f2).andThen(f3).compose(f4).apply(5));
		
	}

	
}
