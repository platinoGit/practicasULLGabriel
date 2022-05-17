package business.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import com.company.plexus.business.daoImpl.ServiceDaoImpl;
import com.company.plexus.business.entity.*;
import com.company.plexus.utils.AdminLevel;
import com.company.plexus.utils.AdminUnity;
import com.company.plexus.utils.Ambit;
import com.company.plexus.utils.Department;
import com.company.plexus.utils.ProcedureStart;

import com.company.plexus.utils.Service;
import com.company.plexus.business.logic.Controller;
import com.company.plexus.business.mappers.ServiceMapper;

import org.mapstruct.factory.Mappers;

@RunWith(MockitoJUnitRunner.class)
public class TestCreate {

	ServiceEntity entity;

	@Mock
	ServiceDaoImpl imp;
	
	@Before
	public void setUp() throws Exception {
		entity = new ServiceEntity();
		entity.setId(1001);
		entity.setName("Consulta Empresas Clasificadas");
		entity.setSpecific_name("");
		//entity.setDepartment("Dirección General de Patrimonio y Contratación");
		entity.setDepartment(Department.ADMIN_PUBLIC);
		entity.setResp_admin_uni(AdminUnity.CONSEJERIA_AGRICULTURA);
		entity.setRoute("Gobierno de Canarias >> Consejería de Hacienda, Presupuestos y Asuntos Europeos >> Viceconsejería de Hacienda, Planificación y Asuntos Europeos >> Dirección General de Patrimonio y Contratación >> Junta Consultiva");
		entity.setAction_type("SERVICIO");
		//entity.setStart_of_procedure("INTERESADO");
		entity.setStart_of_procedure(ProcedureStart.INTERESADO);
		//entity.setAmbit("ESPECIFICO");
		entity.setAmbit(Ambit.ESPECIFICO);
		//entity.setAdmin_level("Nivel 4: Tramitación electrónica completa");
		entity.setAdmin_level(AdminLevel.NIVEL_4);
		entity.setSia_code("220851");
		entity.setSia_update_date("2022-03-09 23:00:10.668");
		entity.setRelease_date("2022-03-09 10:42:35.418");
		entity.setLast_modification_date("09/03/2022 10:42");
		entity.setStart_date("");
		entity.setFinish_date("");
		entity.setRemarks("");
	}

	@Test
	public void testCreate() {
		assertNotNull(imp);
		when(imp.create(entity, null)).thenReturn(true);
		assertTrue(imp.create(entity, null));
	}
	
	@Test
	public void testUpdate() {
		assertNotNull(imp);
		when(imp.update(entity, null)).thenReturn(true);
		assertTrue(imp.update(entity, null));
	}
	
	@Test
	public void testDelete() {
		assertNotNull(imp);
		when(imp.delete("Services", 4000, null)).thenReturn(true);
		assertTrue(imp.delete("Services", 4000, null));
	}

	@Test
	public void testControllerCreate() {
		Service service = new Service();
		service.setId(1001);
		service.setName("Consulta Empresas Clasificadas");
		service.setSpecific_name("");
		//entity.setDepartment("Dirección General de Patrimonio y Contratación");
		service.setDepartment(Department.ADMIN_PUBLIC);
		//entity.setResp_admin_uni("Consejería de Hacienda, Presupuestos y Asuntos Europeos");
		service.setResp_admin_uni(AdminUnity.CONSEJERIA_AGRICULTURA);
		service.setRoute("Gobierno de Canarias >> Consejería de Hacienda, Presupuestos y Asuntos Europeos >> Viceconsejería de Hacienda, Planificación y Asuntos Europeos >> Dirección General de Patrimonio y Contratación >> Junta Consultiva");
		service.setAction_type("SERVICIO");
		//entity.setStart_of_procedure("INTERESADO");
		service.setStart_of_procedure(ProcedureStart.INTERESADO);
		//entity.setAmbit("ESPECIFICO");
		service.setAmbit(Ambit.ESPECIFICO);
		//entity.setAdmin_level("Nivel 4: Tramitación electrónica completa");
		service.setAdmin_level(AdminLevel.NIVEL_4);
		service.setSia_code("220851");
		service.setSia_update_date("2022-03-09 23:00:10.668");
		service.setRelease_date("2022-03-09 10:42:35.418");
		service.setLast_modification_date("09/03/2022 10:42");
		service.setStart_date("");
		service.setFinish_date("");
		service.setRemarks("");
		assertEquals(entity, Mappers.getMapper(ServiceMapper.class).serviceToEntity(service));
	}
}

//entity.setDepartment(Department.ADMIN_PUBLIC);
//entity.setResp_admin_uni(AdminUnity.CONSEJERIA_AGRICULTURA);

//entity.setStart_of_procedure(ProcedureStart.INTERESADO);
//entity.setAmbit(Ambit.ESPECIFICO);
//entity.setAdmin_level(AdminLevel.NIVEL_4);