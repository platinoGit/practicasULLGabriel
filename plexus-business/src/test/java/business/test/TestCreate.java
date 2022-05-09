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
		entity.setId(1001);
		entity.setName("Consulta Empresas Clasificadas");
		entity.setSpecific_name("");
		entity.setDepartment("Dirección General de Patrimonio y Contratación");
		entity.setResp_admin_uni("Consejería de Hacienda, Presupuestos y Asuntos Europeos");
		entity.setRoute("Gobierno de Canarias >> Consejería de Hacienda, Presupuestos y Asuntos Europeos >> Viceconsejería de Hacienda, Planificación y Asuntos Europeos >> Dirección General de Patrimonio y Contratación >> Junta Consultiva");
		entity.setAction_type("SERVICIO");
		entity.setStart_of_procedure("INTERESADO");
		entity.setAmbit("ESPECIFICO");
		entity.setAdmin_level("Nivel 4: Tramitación electrónica completa");
		entity.setSia_code(220851);
		entity.setSia_update_date("2022-03-09 23:00:10.668");
		entity.setRelease_date("2022-03-09 10:42:35.418");
		entity.setLast_modification_date("09/03/2022 10:42");
		entity.setStart_date("");
		entity.setFinish_date("");
		entity.setRemarks("");
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

//entity.setDepartment(Department.ADMIN_PUBLIC);
//entity.setResp_admin_uni(AdminUnity.CONSEJERIA_AGRICULTURA);

//entity.setStart_of_procedure(ProcedureStart.INTERESADO);
//entity.setAmbit(Ambit.ESPECIFICO);
//entity.setAdmin_level(AdminLevel.NIVEL_4);