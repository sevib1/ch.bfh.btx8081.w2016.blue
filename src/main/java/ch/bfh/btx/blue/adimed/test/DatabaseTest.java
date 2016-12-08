package ch.bfh.btx.blue.adimed.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ch.bfh.btx.blue.adimed.businessLayer.Agenda;

public class DatabaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("medi");

		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Agenda agenda1 = new Agenda();
		
		em.persist(agenda1);

		tx.commit();
		em.close();
		
	}
}