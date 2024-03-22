package com.maestroobjetos.test;
import com.maestroobjetos.human.human;

public class humanTest {
	public static void main(String[] args) {
		human diego = new human();
		human pepito = new human();
		diego.attack("Diego", "Pepito", pepito);
		System.out.println("La vida de pepito a bajado a: " + pepito.health);
	}
}
