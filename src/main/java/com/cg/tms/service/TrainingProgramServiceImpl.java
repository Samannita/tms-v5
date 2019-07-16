//package com.cg.tms.service;
//
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.cg.tms.dao.CrudService;
//import com.cg.tms.entity.Program;
//import com.cg.tms.exception.ErrorMessages;
//import com.cg.tms.exception.ProgramException;
//
///**
// * Training Program service IMPL class:
// * 
// */
//@Service
//public class TrainingProgramServiceImpl implements TrainingProgramService {
//	
//	@Autowired
//	private CrudService<Program> crudTrainingProgram;
//
//
//	@Override
//	public boolean createProgram( Program program) throws ProgramException {
//		boolean flag = false;
//
//		boolean valid = program.getCenter() != null ? (program.getCourse() != null
//				? (program.getEmployee() != null ? (program.getTrainingStartDate() != null ? true : false) : false)
//				: false) : false;
//		if (valid) {
//			flag = crudTrainingProgram.create(program);
//		} else {
//			throw new ProgramException(ErrorMessages.MESSAGE14);
//		}
//
//		return flag;
//	}
//
//	@Override
//	public boolean deleteTrainingProgram(final int trainingId) throws ProgramException {
//		boolean flag = false;
//		if (trainingId != 0 && trainingId < 0) {
//			throw new ProgramException(ErrorMessages.MESSAGE12);
//		}
//		final Program program = retrieveTrainingProgram(trainingId);
//		if (program == null) {
//			throw new ProgramException(ErrorMessages.MESSAGE9);
//		}
//		flag = crudTrainingProgram.delete(program);
//
//		return flag;
//	}
//
//	@Override
//	public boolean modifyTrainingProgram(final Program program) throws ProgramException {
//		boolean flag = false;
//		if (null == program) {
//			throw new ProgramException(ErrorMessages.MESSAGE13);
//		}
//		flag = crudTrainingProgram.update(program);
//		return flag;
//	}
//
//
//	@Override
//	public Program retrieveTrainingProgram(final int trainingId) throws ProgramException {
//		if (trainingId != 0 && trainingId < 0) {
//			throw new ProgramException(ErrorMessages.MESSAGE12);
//		}
//		return crudTrainingProgram.retrieve(trainingId);
//	}
//
//	@Override
//	public Set<Program> retrieveAllTrainingProgram() throws ProgramException {
//		Set<Program> trainingPrograms;
//		trainingPrograms = crudTrainingProgram.retrieveAll();
//		return trainingPrograms;
//	}
//
//}