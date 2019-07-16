//package com.cg.tms.controller;
//
//import java.text.DateFormat;
//import java.util.Date;
//import java.util.Locale;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.cg.tms.entity.Feedback;
//import com.cg.tms.entity.Program;
//import com.cg.tms.exception.ProgramException;
//import com.cg.tms.service.TrainingProgramService;
//
//
//@Controller
//public class AdminController {
//	
//	@Autowired
//	private TrainingProgramService traingingProgramOpn;
//	
//	@PersistenceContext
//	private EntityManager entitymanger;
//	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) throws ProgramException {
//		System.out.println("Home Page Requested, locale = " + locale);
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//
//		String formattedDate = dateFormat.format(date);
//		
////		Program p = traingingProgramOpn.retrieveTrainingProgram(10000);
//		Feedback s = entitymanger.find(Feedback.class, 10000);
//
////		System.out.println(p.getEmployee().getEmpName());
//		
//
//		model.addAttribute("serverTime", formattedDate);
//		model.addAttribute("ename",s.getQuestionId().getCriteria());
//
//		return "index";
//	} 
//	
//	@RequestMapping(value = "/program{o}", method = RequestMethod.GET ,produces = "application/json")
//	public @ResponseBody Program getProgram() throws ProgramException {
//		
//		Program p = traingingProgramOpn.retrieveTrainingProgram(10000);
//		System.out.println(p.getEmployee().getEmpName());
//
//		return p;
//	}
//
//}