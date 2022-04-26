package com.company.plexus.business.mappers;

import com.company.plexus.business.entity.ProcedureEntity;
import com.company.plexus.utils.Procedure;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-26T14:04:50+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14.1 (Ubuntu)"
)
public class ProcedureMapperImpl implements ProcedureMapper {

    @Override
    public ProcedureEntity procedureToEntity(Procedure procedure) {
        if ( procedure == null ) {
            return null;
        }

        ProcedureEntity procedureEntity = new ProcedureEntity();

        procedureEntity.setId( procedure.getId() );
        procedureEntity.setCode( procedure.getCode() );
        procedureEntity.setName( procedure.getName() );
        procedureEntity.setSpecific_name( procedure.getSpecific_name() );
        procedureEntity.setDepartment( procedure.getDepartment() );
        procedureEntity.setResp_admin_uni( procedure.getResp_admin_uni() );
        procedureEntity.setRoute( procedure.getRoute() );
        procedureEntity.setStart_of_procedure( procedure.getStart_of_procedure() );
        procedureEntity.setAmbit( procedure.getAmbit() );
        procedureEntity.setAdmin_level( procedure.getAdmin_level() );
        procedureEntity.setSia_code( procedure.getSia_code() );
        procedureEntity.setSia_update_date( procedure.getSia_update_date() );
        procedureEntity.setRelease_date( procedure.getRelease_date() );
        procedureEntity.setLast_modification_date( procedure.getLast_modification_date() );
        procedureEntity.setStart_date( procedure.getStart_date() );
        procedureEntity.setFinish_date( procedure.getFinish_date() );
        procedureEntity.setRemarks( procedure.getRemarks() );
        procedureEntity.setProcedure_type( procedure.getProcedure_type() );
        procedureEntity.setFamily( procedure.getFamily() );

        return procedureEntity;
    }

    @Override
    public Procedure entityToProcedure(ProcedureEntity procedureEntity) {
        if ( procedureEntity == null ) {
            return null;
        }

        Procedure procedure = new Procedure();

        procedure.setId( procedureEntity.getId() );
        procedure.setCode( procedureEntity.getCode() );
        procedure.setName( procedureEntity.getName() );
        procedure.setSpecific_name( procedureEntity.getSpecific_name() );
        if ( procedureEntity.getDepartment() != null ) {
            procedure.setDepartment( procedureEntity.getDepartment().name() );
        }
        if ( procedureEntity.getResp_admin_uni() != null ) {
            procedure.setResp_admin_uni( procedureEntity.getResp_admin_uni().name() );
        }
        procedure.setRoute( procedureEntity.getRoute() );
        if ( procedureEntity.getStart_of_procedure() != null ) {
            procedure.setStart_of_procedure( procedureEntity.getStart_of_procedure().name() );
        }
        if ( procedureEntity.getAmbit() != null ) {
            procedure.setAmbit( procedureEntity.getAmbit().name() );
        }
        if ( procedureEntity.getAdmin_level() != null ) {
            procedure.setAdmin_level( procedureEntity.getAdmin_level().name() );
        }
        procedure.setSia_code( procedureEntity.getSia_code() );
        procedure.setSia_update_date( procedureEntity.getSia_update_date() );
        procedure.setRelease_date( procedureEntity.getRelease_date() );
        procedure.setLast_modification_date( procedureEntity.getLast_modification_date() );
        procedure.setStart_date( procedureEntity.getStart_date() );
        procedure.setFinish_date( procedureEntity.getFinish_date() );
        procedure.setRemarks( procedureEntity.getRemarks() );
        procedure.setFamily( procedureEntity.getFamily() );
        if ( procedureEntity.getProcedure_type() != null ) {
            procedure.setProcedure_type( procedureEntity.getProcedure_type().name() );
        }

        return procedure;
    }
}
