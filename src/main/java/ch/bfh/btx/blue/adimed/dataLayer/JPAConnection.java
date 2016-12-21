package ch.bfh.btx.blue.adimed.dataLayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ch.bfh.btx.blue.adimed.businessLayer.Patient;
import ch.bfh.btx.blue.adimed.businessLayer.Person;

public class JPAConnection {
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;

	public JPAConnection() {
		emf = Persistence.createEntityManagerFactory("medi");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	public void connection() {

		tx.begin();
		DBPerson();
		DBPatient();

		tx.commit();
		em.close();

	}

	public void DBPerson() {
		Query q = em.createQuery("select p from Person p");
		List<Person> persons = q.getResultList();

		System.out.println("" + persons.size() + " persons:");
		for (Person p1 : persons)
			System.out.println(p1);
	}

	public void DBPatient() {
		Query q = em.createQuery("select p from Patient p");
		List<Patient> patients = q.getResultList();

		System.out.println("" + patients.size() + " persons:");
		for (Patient p1 : patients)
			System.out.println(p1);
	}

}
