package ch.bfh.btx.blue.adimed.dataLayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ch.bfh.btx.blue.adimed.businessLayer.Agenda;
import ch.bfh.btx.blue.adimed.businessLayer.LaborResult;
import ch.bfh.btx.blue.adimed.businessLayer.Medication;
import ch.bfh.btx.blue.adimed.businessLayer.Patient;

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
	//	DBPerson();
		DBPatient();
		//DBAgenda();
		tx.commit();
		em.close();

	}

//	public void DBPerson() {
//		Query q = em.createQuery("select p from Person p");
//		List<Person> persons = q.getResultList();
//
//		System.out.println( " persons:"+ persons.size() );
//		for (Person p1 : persons)
//			System.out.println(p1);
//	}
/**
 * 
 */
	public void DBPatient() {
		
		Query q = em.createQuery("select q from Patient q");
		


		List<Patient> patients = q.getResultList();

		System.out.println( " persons:" + patients.size() );
	for (Patient p1 : patients)
			
	
		System.out.println(p1.getPatient());
	}

	public void DBAgenda(String hello){
		
		Query q = em.createQuery("select q from Agenda q");
		
		//List<Person> persons = x.getResultList();

		List<Agenda> agenda = q.getResultList();

		System.out.println( " agenda:" + agenda.size() );
		for (Agenda p1 : agenda){
			System.out.println(p1);
		//System.out.println(p1.getPatient());
		
		
		
		}
	}
	
	public List<LaborResult> labResults(){
		tx = em.getTransaction();
		tx.begin();
		Query q = em.createQuery("select l from LaborResult l");
		
		List<LaborResult> laborResults = q.getResultList();
		tx.commit();
		return laborResults;
	}
	public void Test(){
		Query q = em.createQuery("select q from Agenda q");
	}


public List<Medication> medication(){
	tx = em.getTransaction();
	tx.begin();
	Query q = em.createQuery("select l from Medication l");
	
	List<Medication> medication = q.getResultList();
	tx.commit();
	return medication;
}
public void Test1(){
	Query q = em.createQuery("select q from Agenda q");
}
}
