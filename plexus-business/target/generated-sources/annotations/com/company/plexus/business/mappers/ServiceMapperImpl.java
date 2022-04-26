package com.company.plexus.business.mappers;

import com.company.plexus.business.entity.ServiceEntity;
import com.company.plexus.utils.Service;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-26T14:04:51+0100",
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
        serviceEntity.setDepartment( service.getDepartment() );
        serviceEntity.setResp_admin_uni( service.getResp_admin_uni() );
        serviceEntity.setRoute( service.getRoute() );
        serviceEntity.setStart_of_procedure( service.getStart_of_procedure() );
        serviceEntity.setAmbit( service.getAmbit() );
        serviceEntity.setAdmin_level( service.getAdmin_level() );
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
        if ( serviceEntity.getDepartment() != null ) {
            service.setDepartment( serviceEntity.getDepartment().name() );
        }
        if ( serviceEntity.getResp_admin_uni() != null ) {
            service.setResp_admin_uni( serviceEntity.getResp_admin_uni().name() );
        }
        service.setRoute( serviceEntity.getRoute() );
        if ( serviceEntity.getStart_of_procedure() != null ) {
            service.setStart_of_procedure( serviceEntity.getStart_of_procedure().name() );
        }
        if ( serviceEntity.getAmbit() != null ) {
            service.setAmbit( serviceEntity.getAmbit().name() );
        }
        if ( serviceEntity.getAdmin_level() != null ) {
            service.setAdmin_level( serviceEntity.getAdmin_level().name() );
        }
        service.setSia_code( serviceEntity.getSia_code() );
        service.setSia_update_date( serviceEntity.getSia_update_date() );
        service.setRelease_date( serviceEntity.getRelease_date() );
        service.setLast_modification_date( serviceEntity.getLast_modification_date() );
        service.setStart_date( serviceEntity.getStart_date() );
        service.setFinish_date( serviceEntity.getFinish_date() );
        service.setRemarks( serviceEntity.getRemarks() );

        return service;
    }
}
