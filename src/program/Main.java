package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

import entity.Candidate;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Candidate> list = new ArrayList<>();

		System.out.println("number of candidates: ");
		int x = sc.nextInt();
		if (x > 0 && x <= 100) {

			sc.nextLine();

			for (int i = 0; i < x; i++) {
				System.out.println("name and number of hit ");
				String se = sc.nextLine();
				String vect[] = se.split(" ");
				String name = vect[0];
				Integer hit = Integer.parseInt(vect[1]);
				list.add(new Candidate(name, hit));
			}
			System.out.println(reprove(list));
		}
		else {
			System.out.println("incorect number");
		}
		sc.close();
	}

	public static String reprove(List<Candidate> list) {
		List<Candidate> possibleReprove = new ArrayList<>();
		SortedSet<String> ss = new TreeSet<String>();
		String nameReprove = null;
		int n = 0;
		int base = 10;
		for (Candidate c : list) {
			if (c.getNumberHits() < base) {
				base = c.getNumberHits();
			}
		}
		for (Candidate c : list) {
			if (c.getNumberHits().equals(base)) {
				possibleReprove.add(c);
			}
		}
		for (Candidate c : possibleReprove) {
			ss.add(c.getName());
		}
		nameReprove = ss.last();
		for (Candidate c : list) {
			if (c.getName().equals(nameReprove)) {
				n = list.indexOf(c);
			}
		}
		String awnser = "Instancia " + n + "\n" + ss.last();
		return awnser;
	}
}
