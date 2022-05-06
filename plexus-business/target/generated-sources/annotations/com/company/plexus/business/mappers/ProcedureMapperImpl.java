package com.company.plexus.business.mappers;

import com.company.plexus.business.entity.ProcedureEntity;
import com.company.plexus.utils.Procedure;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-06T12:02:37+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14.1 (Ubuntu)"
)
public class ProcedureMapperImpl implements ProcedureMapper {

    @Override
    public ProcedureEntity procedureToEntity(Procedure procedure) {
        if ( procedure == null ) {
            return null;
        }

        ProcedureEntity procedureEntity = new ProcedureEntity();

        if ( procedure.getDepartment() != null ) {
            procedureEntity.setDepartment( procedure.getDepartment().name() );
        }
        if ( procedure.getResp_admin_uni() != null ) {
            procedureEntity.setResp_admin_uni( procedure.getResp_admin_uni().name() );
        }
        if ( procedure.getStart_of_procedure() != null ) {
            procedureEntity.setStart_of_procedure( procedure.getStart_of_procedure().name() );
        }
        if ( procedure.getAmbit() != null ) {
            procedureEntity.setAmbit( procedure.getAmbit().name() );
        }
        if ( procedure.getAdmin_level() != null ) {
            procedureEntity.setAdmin_level( procedure.getAdmin_level().name() );
        }
        if ( procedure.getProcedure_type() != null ) {
            procedureEntity.setProcedure_type( procedure.getProcedure_type().name() );
        }
        if ( procedure.getId() != null ) {
            procedureEntity.setId( Integer.parseInt( procedure.getId() ) );
        }
        procedureEntity.setName( procedure.getName() );
        procedureEntity.setSpecific_name( procedure.getSpecific_name() );
        procedureEntity.setRoute( procedure.getRoute() );
        procedureEntity.setSia_code( procedure.getSia_code() );
        procedureEntity.setSia_update_date( procedure.getSia_update_date() );
        procedureEntity.setRelease_date( procedure.getRelease_date() );
        procedureEntity.setLast_modification_date( procedure.getLast_modification_date() );
        procedureEntity.setStart_date( procedure.getStart_date() );
        procedureEntity.setFinish_date( procedure.getFinish_date() );
        procedureEntity.setRemarks( procedure.getRemarks() );
        procedureEntity.setFamily( procedure.getFamily() );

        return procedureEntity;
    }

    @Override
    public Procedure entityToProcedure(ProcedureEntity procedureEntity) {
        if ( procedureEntity == null ) {
            return null;
        }

        Procedure procedure = new Procedure();

        procedure.setId( String.valueOf( procedureEntity.getId() ) );
        procedure.setName( procedureEntity.getName() );
        procedure.setSpecific_name( procedureEntity.getSpecific_name() );
        procedure.setDepartment( procedureEntity.getDepartment() );
        procedure.setResp_admin_uni( procedureEntity.getResp_admin_uni() );
        procedure.setRoute( procedureEntity.getRoute() );
        procedure.setStart_of_procedure( procedureEntity.getStart_of_procedure() );
        procedure.setAmbit( procedureEntity.getAmbit() );
        procedure.setAdmin_level( procedureEntity.getAdmin_level() );
        procedure.setSia_code( procedureEntity.getSia_code() );
        procedure.setSia_update_date( procedureEntity.getSia_update_date() );
        procedure.setRelease_date( procedureEntity.getRelease_date() );
        procedure.setLast_modification_date( procedureEntity.getLast_modification_date() );
        procedure.setStart_date( procedureEntity.getStart_date() );
        procedure.setFinish_date( procedureEntity.getFinish_date() );
        procedure.setRemarks( procedureEntity.getRemarks() );
        procedure.setFamily( procedureEntity.getFamily() );
        procedure.setProcedure_type( procedureEntity.getProcedure_type() );

        return procedure;
    }
}
