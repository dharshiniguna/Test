package org.Abstraction_Partial;

public class Movie extends Trailer{

	@Override
	public void story() {
		System.out.println("Action movie");	
	}
	
	@Override
	public void guestRole() {
		System.out.println("Vikram");	
	}
	
	@Override
	public void songs() {
		System.out.println("3 songs");		
	}
	
	public static void main(String[] args) {
		
		Movie m = new Movie();
		m.movieName();
		m.hero();
		m.director();
		m.music();
		m.story();
		m.guestRole();
		m.songs();
	}
}
