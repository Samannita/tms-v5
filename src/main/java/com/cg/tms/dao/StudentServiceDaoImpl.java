//package com.cg.tms.dao;
//
//import javax.persistence.EntityManager;
//
//import com.cg.tms.entity.Program;
//import com.cg.tms.entity.Student;
//import com.cg.tms.exception.ErrorMessages;
//import com.cg.tms.exception.ProgramException;
//import com.cg.tms.util.EntityManagerUtils;
//
//public class StudentServiceDaoImpl implements StudentServiceDao {
//
//	@Override
//	public boolean enrollStudent(Student student, Program program) throws ProgramException {
//		EntityManager entityManager = EntityManagerUtils.getEntityManager();
//		EntityManagerUtils.startTransaction();
//		entityManager.persist(student);
//		EntityManagerUtils.stopTransaction();
//		return true;
//	}
//
//	@Override
//	public boolean removeStudent(int studentId, int trainingProgramId) throws ProgramException {
//		EntityManager entityManager = EntityManagerUtils.getEntityManager();
//		EntityManagerUtils.startTransaction();
//		Student student = entityManager.find(Student.class, studentId);
//		if (null==student) {
//			throw new ProgramException(ErrorMessages.MESSAGE10);
//		}
//		entityManager.remove(student);
//		EntityManagerUtils.stopTransaction();
//		return true;
//	}
//
//}
