package com.company.plexus.business.mappers;

import org.mapstruct.Mapper;
import com.company.plexus.utils.Procedure;
import com.company.plexus.business.entity.ProcedureEntity;

@Mapper
public interface ProcedureMapper {
	ProcedureEntity procedureToEntity(Procedure procedure);
	Procedure entityToProcedure(ProcedureEntity procedureEntity);
}
