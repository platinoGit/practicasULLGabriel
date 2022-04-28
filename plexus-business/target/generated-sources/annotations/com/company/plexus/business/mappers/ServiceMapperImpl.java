package com.company.plexus.business.mappers;

import com.company.plexus.business.entity.ServiceEntity;
import com.company.plexus.utils.Service;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-28T13:19:43+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14.1 (Ubuntu)"
)
public class ServiceMapperImpl implements ServiceMapper {

    @Override
    public ServiceEntity serviceToEntity(Service service) {
        if ( service == null ) {
            return null;
        }

        ServiceEntity serviceEntity = new ServiceEntity();

        serviceEntity.setCode( service.getCode() );
        serviceEntity.setName( service.getName() );
        serviceEntity.setSpecific_name( service.getSpecific_name() );
        if ( service.getDepartment() != null ) {
            serviceEntity.setDepartment( service.getDepartment().name() );
        }
        if ( service.getResp_admin_uni() != null ) {
            serviceEntity.setResp_admin_uni( service.getResp_admin_uni().name() );
        }
        serviceEntity.setRoute( service.getRoute() );
        if ( service.getStart_of_procedure() != null ) {
            serviceEntity.setStart_of_procedure( service.getStart_of_procedure().name() );
        }
        if ( service.getAmbit() != null ) {
            serviceEntity.setAmbit( service.getAmbit().name() );
        }
        if ( service.getAdmin_level() != null ) {
            serviceEntity.setAdmin_level( service.getAdmin_level().name() );
        }
        serviceEntity.setSia_code( service.getSia_code() );
        serviceEntity.setSia_update_date( service.getSia_update_date() );
        serviceEntity.setRelease_date( service.getRelease_date() );
        serviceEntity.setLast_modification_date( service.getLast_modification_date() );
        serviceEntity.setStart_date( service.getStart_date() );
        serviceEntity.setFinish_date( service.getFinish_date() );
        serviceEntity.setRemarks( service.getRemarks() );

        return serviceEntity;
    }

    @Override
    public Service entityToService(ServiceEntity serviceEntity) {
        if ( serviceEntity == null ) {
            return null;
        }

        Service service = new Service();

        service.setCode( serviceEntity.getCode() );
        service.setName( serviceEntity.getName() );
        service.setSpecific_name( serviceEntity.getSpecific_name() );

        return service;
    }
}
