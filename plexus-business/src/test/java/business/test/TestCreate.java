package business.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.company.plexus.business.daoImpl.ServiceDaoImpl;
import com.company.plexus.business.entity.*;
import com.company.plexus.utils.AdminLevel;
import com.company.plexus.utils.AdminUnity;
import com.company.plexus.utils.Ambit;
import com.company.plexus.utils.Department;
import com.company.plexus.utils.ProcedureStart;

public class TestCreate {

	ServiceEntity entity;
	
	@Before
	public void setUp() throws Exception {
		entity = new ServiceEntity();
		entity.setId(4000);
		entity.setName("Test");
		entity.setSpecific_name("test");
//		entity.setDepartment(Department.ADMIN_PUBLIC);
//		entity.setResp_admin_uni(AdminUnity.CONSEJERIA_AGRICULTURA);
		entity.setDepartment("test");
		entity.setResp_admin_uni("test");
		entity.setRoute("test");
		entity.setAction_type("test");
		entity.setStart_date("test");
//		entity.setStart_of_procedure(ProcedureStart.INTERESADO);
//		entity.setAmbit(Ambit.ESPECIFICO);
//		entity.setAdmin_level(AdminLevel.NIVEL_4);
		entity.setStart_of_procedure("test");
		entity.setAmbit("test");
		entity.setAdmin_level("test");
		entity.setSia_code(999);
		entity.setSia_update_date("test");
		entity.setRelease_date("test");
		entity.setLast_modification_date("test");
		entity.setStart_date("test");
		entity.setFinish_date("test");
		entity.setRemarks("test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("All test run succesfully");
	}

	@Test
	public void testCreate() {
		ServiceDaoImpl imp = new ServiceDaoImpl();
		assertTrue(imp.update(entity, null));
	}

}