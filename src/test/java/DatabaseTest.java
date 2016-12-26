import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

public class DatabaseTest {
	private EntityManagerFactory emf;
	
	private EntityManager em;
	@Before
	public void setUp() throws Exception {
		try{
		emf = Persistence.createEntityManagerFactory("medi");
		em = emf.createEntityManager();
		}catch (Exception e){
			throw e;
		}
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
