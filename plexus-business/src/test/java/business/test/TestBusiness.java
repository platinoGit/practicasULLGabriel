package business.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;

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
import com.company.plexus.business.logic.ServiceLogic;
import com.company.plexus.business.logic.BusinessLogic;

import org.mapstruct.factory.Mappers;

@RunWith(MockitoJUnitRunner.class)
public class TestBusiness {

	ServiceEntity entity;

	@Mock
	ServiceDaoImpl imp;
	
	@Before
	public void setUp() throws Exception {
		entity = new ServiceEntity();
		entity.setId(1001);
		entity.setName("Consulta Empresas Clasificadas");
		entity.setSpecific_name("");
		entity.setDepartment(Department.ADMIN_PUBLIC);
		entity.setResp_admin_uni(AdminUnity.CONSEJERIA_AGRICULTURA);
		entity.setRoute("Gobierno de Canarias >> Consejería de Hacienda, Presupuestos y Asuntos Europeos >> Viceconsejería de Hacienda, Planificación y Asuntos Europeos >> Dirección General de Patrimonio y Contratación >> Junta Consultiva");
		entity.setAction_type("SERVICIO");
		entity.setStart_of_procedure(ProcedureStart.INTERESADO);
		entity.setAmbit(Ambit.ESPECIFICO);
		entity.setAdmin_level(AdminLevel.NIVEL_4);
		entity.setSia_code("220851");
		entity.setSia_update_date("2022-03-09 23:00:10.668");
		entity.setRelease_date("2022-03-09 10:42:35.418");
		entity.setLast_modification_date("09/03/2022 10:42");
		entity.setStart_date("");
		entity.setFinish_date("");
		entity.setRemarks("");
		
//		when(imp.create(entity, null)).thenReturn(true);
//		when(imp.update(entity, null)).thenReturn(true);
//		when(imp.delete("Services", 4000, null)).thenReturn(true);
		
		ServiceEntity service1 = new ServiceEntity();
		service1.setId(9876);
		service1.setResp_admin_uni(AdminUnity.CONSEJERIA_AGRICULTURA);
		ServiceEntity service2 = new ServiceEntity();
		service2.setId(6789);
		service2.setResp_admin_uni(AdminUnity.CONSEJERIA_AGRICULTURA);
		ArrayList<ServiceEntity> servicesList = new ArrayList<ServiceEntity>(Arrays.asList(service1, service2));
		when(imp.selectByAdminUnity("Consejeria de Agricultura", null)).thenReturn(servicesList);
	}

	@Ignore
	@Test
	public void testCreate() {
		assertNotNull(imp);
		assertTrue(imp.create(entity, null));
	}
	
	@Ignore
	@Test
	public void testUpdate() {
		assertNotNull(imp);
		assertTrue(imp.update(entity, null));
	}
	
	@Ignore
	@Test
	public void testDelete() {
		assertNotNull(imp);
		assertTrue(imp.delete("Services", 4000, null));
	}

	@Test
	public void testMapper() {
		Service service = new Service();
		service.setId(1001);
		service.setName("Consulta Empresas Clasificadas");
		service.setSpecific_name("");
		service.setDepartment(Department.ADMIN_PUBLIC);
		service.setResp_admin_uni(AdminUnity.CONSEJERIA_AGRICULTURA);
		service.setRoute("Gobierno de Canarias >> Consejería de Hacienda, Presupuestos y Asuntos Europeos >> Viceconsejería de Hacienda, Planificación y Asuntos Europeos >> Dirección General de Patrimonio y Contratación >> Junta Consultiva");
		service.setAction_type("SERVICIO");
		service.setStart_of_procedure(ProcedureStart.INTERESADO);
		service.setAmbit(Ambit.ESPECIFICO);
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
	@Ignore
	@Test
	public void testControllerCreate() {
		Service service = new Service();
		Controller controller = new Controller();
		controller.setServiceDaoImpl(imp);
		assertTrue(controller.createService(service, null));
	}
	@Ignore
	@Test
	public void testServiceLogicCreate() {
		Service service = new Service();
		ServiceLogic logic = new ServiceLogic();
		logic.getController().setServiceDaoImpl(imp);
		assertTrue(logic.createService(service, null));
	}
	@Ignore
	@Test
	public void testBusinessLogicCreate() {
		Service service = new Service();
		BusinessLogic business = new BusinessLogic();
		business.getService().getController().setServiceDaoImpl(imp);
		assertTrue(business.createService(service, null));
	}
	@Ignore
	@Test
	public void testControllerUpdate() {
		Service service = new Service();
		Controller controller = new Controller();
		controller.setServiceDaoImpl(imp);
		assertTrue(controller.updateService(service, null));
	}
	@Ignore
	@Test
	public void testServiceLogicUpdate() {
		Service service = new Service();
		ServiceLogic logic = new ServiceLogic();
		logic.getController().setServiceDaoImpl(imp);
		assertTrue(logic.updateService(service, null));
	}
	@Ignore
	@Test
	public void testBusinessLogicUpdate() {
		Service service = new Service();
		BusinessLogic business = new BusinessLogic();
		business.getService().getController().setServiceDaoImpl(imp);
		assertTrue(business.updateService(service, null));
	}
	@Ignore
	@Test
	public void testControllerDelete() {
		Controller controller = new Controller();
		controller.setServiceDaoImpl(imp);
		assertTrue(controller.deleteService("Services", 4000, null));
	}
	@Ignore
	@Test
	public void testServiceLogicDelete() {
		Service service = new Service();
		ServiceLogic logic = new ServiceLogic();
		logic.getController().setServiceDaoImpl(imp);
		assertTrue(logic.updateService(service, null));
	}
	@Ignore
	@Test
	public void testBusinessLogicDelete() {
		Service service = new Service();
		BusinessLogic business = new BusinessLogic();
		business.getService().getController().setServiceDaoImpl(imp);
		assertTrue(business.updateService(service, null));
	}
	@Test
	public void testSelectByAdminDao() {
		ServiceEntity service1 = new ServiceEntity();
		service1.setId(9876);
		service1.setResp_admin_uni(AdminUnity.CONSEJERIA_AGRICULTURA);
		ServiceEntity service2 = new ServiceEntity();
		service2.setId(6789);
		service2.setResp_admin_uni(AdminUnity.CONSEJERIA_EDUCACION);
		ArrayList<ServiceEntity> servicesList = new ArrayList<ServiceEntity>(Arrays.asList(service1, service2));
		assertEquals(servicesList, imp.selectByAdminUnity("Consejeria de Agricultura", null));
	}
	
	@Test
	public void testMapperEntityToService() {
		Service service = new Service();
		ServiceEntity serviceEntity = new ServiceEntity();
		service.setId(6789);
		service.setResp_admin_uni(AdminUnity.CONSEJERIA_AGRICULTURA);
		serviceEntity.setId(6789);
		serviceEntity.setResp_admin_uni(AdminUnity.CONSEJERIA_AGRICULTURA);
		assertEquals(service.getId(), Mappers.getMapper(ServiceMapper.class).entityToService(serviceEntity).getId());
	}
	
	//Para este test tengo que comprobar los id entre ellos ya que servicio no tiene equals sobrecargado
	@Ignore
	@Test
	public void testSelectByAdminController() {
		Service service1 = new Service();
		service1.setId(9876);
		service1.setResp_admin_uni(AdminUnity.CONSEJERIA_AGRICULTURA);
		Service service2 = new Service();
		service1.setId(6789);
		service1.setResp_admin_uni(AdminUnity.CONSEJERIA_EDUCACION);
		Service[] servicesList = new Service[]{service1, service2};
		Controller controller = new Controller();
		controller.setServiceDaoImpl(imp);
		assertArrayEquals(servicesList, controller.selectServiceByAdminUnity("Consejeria de Agricultura", null));
	}
}
