/* (C)2022 */
package com.demo.demo01;

import static com.demo.Util.date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.demo.Author;

/** @author Antonio Goncalves http://www.antoniogoncalves.org -- */
public class Main {

	public static void main(String[] args) {

		// migration of users using patching processing
		System.out.println("\n\n>>> Executing : " + Main.class.toString() + " <<<\n");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("module06-persistence-unit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		AuthorService service = new AuthorService(em);

		System.out.println("--- create an invalid author ");
		tx.begin();
		service.createAuthor(new Author(null, null, null));
		tx.commit();

		System.out.println("--- create a valid author ");
		tx.begin();
		Long id = service.createAuthor(new Author("John", "Smith", date("01/01/1975")));
		tx.commit();

		System.out.println("\n--- find the author ");
		System.out.println(service.findAuthor(id));

		em.close();
		emf.close();
	}
}
