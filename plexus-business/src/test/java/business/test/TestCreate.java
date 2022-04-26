package business.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.company.plexus.business.daoImpl.ServiceDaoImpl;
import com.company.plexus.business.entity.*;

public class TestCreate {

	ServiceEntity entity;
	
	@Before
	public void setUp() throws Exception {
		entity = new ServiceEntity();
		entity.setCode(0);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("All test run succesfully");
	}

	@Test
	public void testCreate() {
		ServiceDaoImpl imp = new ServiceDaoImpl();
		assertTrue(imp.create(entity, null));
	}

}
