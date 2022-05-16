package com.company.plexus.business.mappers;

import com.company.plexus.business.entity.ServiceEntity;
import com.company.plexus.utils.Service;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-16T14:07:21+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.15 (Private Build)"
)
public class ServiceMapperImpl implements ServiceMapper {

    @Override
    public ServiceEntity serviceToEntity(Service service) {
        if ( service == null ) {
            return null;
        }

        ServiceEntity serviceEntity = new ServiceEntity();

        serviceEntity.setAction_type( service.getAction_type() );
        serviceEntity.setId( service.getId() );
        serviceEntity.setName( service.getName() );
        serviceEntity.setSpecific_name( service.getSpecific_name() );
        serviceEntity.setDepartment( service.getDepartment() );
        serviceEntity.setResp_admin_uni( service.getResp_admin_uni() );
        serviceEntity.setRoute( service.getRoute() );
        serviceEntity.setStart_of_procedure( service.getStart_of_procedure() );
        serviceEntity.setAmbit( service.getAmbit() );
        serviceEntity.setAdmin_level( service.getAdmin_level() );
        if ( service.getSia_code() != null ) {
            serviceEntity.setSia_code( Integer.parseInt( service.getSia_code() ) );
        }
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

        service.setId( serviceEntity.getId() );
        service.setName( serviceEntity.getName() );
        service.setAction_type( serviceEntity.getAction_type() );
        service.setSpecific_name( serviceEntity.getSpecific_name() );
        service.setDepartment( serviceEntity.getDepartment() );
        service.setResp_admin_uni( serviceEntity.getResp_admin_uni() );
        service.setStart_of_procedure( serviceEntity.getStart_of_procedure() );
        service.setAmbit( serviceEntity.getAmbit() );
        service.setAdmin_level( serviceEntity.getAdmin_level() );
        service.setRoute( serviceEntity.getRoute() );
        service.setSia_code( String.valueOf( serviceEntity.getSia_code() ) );
        service.setSia_update_date( serviceEntity.getSia_update_date() );
        service.setRelease_date( serviceEntity.getRelease_date() );
        service.setLast_modification_date( serviceEntity.getLast_modification_date() );
        service.setStart_date( serviceEntity.getStart_date() );
        service.setFinish_date( serviceEntity.getFinish_date() );
        service.setRemarks( serviceEntity.getRemarks() );

        return service;
    }
}
