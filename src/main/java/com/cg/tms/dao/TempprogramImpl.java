//package com.cg.tms.dao;
//
//import java.util.Set;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//
//import org.springframework.stereotype.Repository;
//
//import com.cg.tms.entity.Program;
//import com.cg.tms.exception.ErrorMessages;
//import com.cg.tms.exception.ProgramException;
//
//@Repository
//@Transactional
//public class TempprogramImpl implements TempProgramService {
//	
//	@PersistenceContext
//	private EntityManager entityManager;
//
//	@Override
//	public boolean create(Program o) throws ProgramException {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean update(Program o) throws ProgramException {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public Program retrieve(int o) throws ProgramException {
//		Program program = entityManager.find(Program.class, o);
//		if (null == program) {
//			throw new ProgramException(ErrorMessages.MESSAGE9);
//		}
//
//		return program;
//	}
//
//	@Override
//	public boolean delete(Program o) throws ProgramException {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public Set<Program> retrieveAll() throws ProgramException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
