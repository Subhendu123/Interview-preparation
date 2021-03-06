package com.personal.hackerank;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

//import com.sun.tools.classfile.Opcode.Set;

public class SolutionTicTacToe {

	public static void main(String[] args) throws IOException, InterruptedException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(firstMultipleInput[0]);
//
//        String s = firstMultipleInput[1];
//
//        bufferedReader.close();
//		char[][] input = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
//		char nextPlayersMove = 'X';
//		nextMove(nextPlayersMove,input);

//		C c = new C();
//		c.m();
		Person P1 = new Person("FN1", "LN1");
		Person P2 = new Person("FN2", "LN2");
		Map<Person, String> map = new HashMap<Person, String>();
		map.put(P1, "FNAME");
		map.put(P2, "2nd");
		map.put(new Person("FN1", "LN1"), "OVER");
		System.out.println(map.size());
		System.out.println(map.get(new Person("FN1","LN1")));
		java.util.Set<Person> set = new TreeSet<>();
		set.add(P2);
		set.add(null);
		set.add(P1);
		for(Person p : set) {
			System.out.println(p);
		}
//		MyAdd<Number> myadd = new MyAdd();
//		myadd.add(new Integer(1));
//		myadd.add(new Double(1.0));
		BlockingDeque<Integer> deq = new LinkedBlockingDeque<Integer>();
		deq.offerLast(10, 5, TimeUnit.SECONDS);

		System.out.println(deq.pollFirst(5, TimeUnit.SECONDS) + "");
		System.out.println(deq.pollFirst(5, TimeUnit.SECONDS));
		
	}

//	private static void nextMove(char nextPlayersMove, char[][] input) {
//
//	}

}

class Person implements Comparable<Person> {
	private String fn;
	private String ln;

	public Person(String fn, String ln) {
		this.fn = fn;
		this.ln = ln;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fn == null) ? 0 : fn.hashCode());
		result = prime * result + ((ln == null) ? 0 : ln.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (fn == null) {
			if (other.fn != null)
				return false;
		} else if (!fn.equals(other.fn))
			return false;
		if (ln == null) {
			if (other.ln != null)
				return false;
		} else if (!ln.equals(other.ln))
			return false;
		return true;
	}

//	 public int hashCode() {
//		return 12;
//	 }
	 public String toString() {
		return "OBJECT of "+this.fn + "-"+this.ln;
	 }

		@Override
		public int compareTo(Person o) {
			if(o.equals(this))
				return 0;
			return -1;
		}

//	@Override
//	public int compareTo(Person o) {
//		return 0;
//	}
}
//
//class MyAdd<T> {
//	void add(T t) {
//
//	}
//}

//
//class A {
//	public void m() {
//		System.out.println("A");
//	}
//}
//
//class B extends A {
//	public void m() {
//		System.out.println("B");
//	}
//}
//
//class C extends B {
//	public void m() {
//		super.m();
//		System.out.println("C");
//	}
//}