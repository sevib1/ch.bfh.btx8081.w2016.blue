package ch.bfh.btx.blue.adimed.test;

//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;

import ch.bfh.btx.blue.adimed.dataLayer.JPAConnection;

public class DatabaseTest {

	public static void main(String[] args) {
		
		JPAConnection hello = new JPAConnection();
		hello.connection();
		// TODO Auto-generated method stub
	//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("medi");

		//EntityManager em = emf.createEntityManager();

		//EntityTransaction tx = em.getTransaction();
		//tx.begin();
		
	//	Agenda agenda1 = new Agenda();
	//	
		//em.persist(agenda1);
//
//		tx.commit();
		//em.close();
	//	
	}
}
