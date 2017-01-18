package ch.bfh.btx.blue.adimed.test;

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
