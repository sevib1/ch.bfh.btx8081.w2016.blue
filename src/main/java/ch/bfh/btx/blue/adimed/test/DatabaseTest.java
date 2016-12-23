package ch.bfh.btx.blue.adimed.test;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ch.bfh.btx.blue.adimed.dataLayer.JPAConnection;

/**
 * @author N.Kanagarasa & R.Lam
 *
 */
public class DatabaseTest {

	public static void main(String[] args) {
		
		JPAConnection hello = new JPAConnection();
		hello.connection();

	}
}
