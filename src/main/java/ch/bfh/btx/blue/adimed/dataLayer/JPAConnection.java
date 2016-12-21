package ch.bfh.btx.blue.adimed.dataLayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ch.bfh.btx.blue.adimed.businessLayer.Person;

public class JPAConnection {

	public void connection() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("medi");

		EntityManager em = emf.createEntityManager();
		int id = 1000;
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		
		Person p = em.find(Person.class, id);
		
		Query q = em.createQuery("select p from Person p");
		List<Person> persons = q.getResultList();
		
		System.out.println("" + persons.size() + " persons:");
		for (Person p1 : persons)
		System.out.println(p1);

		tx.commit();
		em.close();

		}
}
