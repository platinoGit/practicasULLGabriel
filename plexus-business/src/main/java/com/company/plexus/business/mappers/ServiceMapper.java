package com.company.plexus.business.mappers;

import org.mapstruct.Mapper;
import com.company.plexus.utils.Service;
import com.company.plexus.business.entity.ServiceEntity;

@Mapper
public interface ServiceMapper {
	ServiceEntity serviceToEntity(Service service);
	Service entityToService(ServiceEntity serviceEntity);
}
