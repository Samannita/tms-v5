//package com.cg.tms.dao;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import javax.transaction.Transactional;
//
//import org.springframework.stereotype.Repository;
//
//import com.cg.tms.entity.Program;
//import com.cg.tms.exception.ErrorMessages;
//import com.cg.tms.exception.ProgramException;
//
///***
// * DAO implementation class for Training Program management
// * 
// * @author Amit
// *
// */
////@Repository
////@Transactional
////public class TrainingProgramServiceDaoImpl implements CrudService<Program> {
//	/***
//	 * 
//	 * Create method takes a program object and extract the value as courseId,
//	 * trainerId, centerId, startDate and insert the program in databases
//	 */
////	@PersistenceContext
////	private EntityManager entityManager;
////
////	@Override
////	public boolean create(final Program program) throws ProgramException {
////		entityManager.persist(program);
////		return true;
////	}
////
////	@Override
////	public boolean update(final Program program) {
////		Program programInst = entityManager.find(Program.class, program.getTrainingId());
////		
////		programInst.setCourse(program.getCourse());
////		programInst.setCenter(program.getCenter());
////		programInst.setEmployee(program.getEmployee());
////		programInst.setTrainingStartDate(program.getTrainingStartDate());
////		return true;
////	}
////
////	/*
////	 * retrieve method will take training id and return the program object with
////	 * appropriate attributes
////	 */
////	@Override
////	public Program retrieve(final int trainingId) throws ProgramException {
////		Program program = entityManager.find(Program.class, trainingId);
////		if (null == program) {
////			throw new ProgramException(ErrorMessages.MESSAGE9);
////		}
////
////		return program;
////	}
////
////	/* Below method will return set of all the available programs */
////	@Override
////	public Set<Program> retrieveAll() throws ProgramException {
////		Query query = entityManager.createQuery("select p from Program p");
////		Set<Program> programs = new HashSet<Program>();
////		@SuppressWarnings("unchecked")
////		List<Program> programList = query.getResultList();
////		for (Program program : programList) {
////			programs.add(program);
////		}
////		return programs;
////	}
////
////	@Override
////	public boolean delete(Program o) throws ProgramException {
////		entityManager.remove(o);
////		return true;
////	}
//
////}