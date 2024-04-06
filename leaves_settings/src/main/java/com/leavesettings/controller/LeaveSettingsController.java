package com.leavesettings.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leavesettings.model.LeaveSettings;
import com.leavesettings.service.LeaveService;

 
@Controller
public class LeaveSettingsController {

	@Autowired
	LeaveService leaveService;
	@RequestMapping("/")
	public String showLeaveSettingsForm() {
		return "final"; // Assuming your HTML file is named "leave-settings.html"
	}

	 @PostMapping("/submit-form")
	    @ResponseBody
	    public String submitForm(@RequestParam("annualDays") int annualDays,
	                             @RequestParam("annaulCarryForward") String carryForward,
	                             @RequestParam("maxCarryForward") String maxCarryForward,
	                             @RequestParam("annaulEarnedLeave") String earnedLeave,
	                             @RequestParam("sickDays") int sickDays,
	                             @RequestParam("HospitalisationDays") int hospitalisationDays,
	                             @RequestParam("MaternityDays") int maternityDays,
	                             @RequestParam("PaternityDays") int paternityDays,
	                             @RequestParam("LOPDays") int lopDays,
	                             @RequestParam("LOPcarryForward") String lopCarryForward,
	                             @RequestParam("LOPmaxCarryForward") String lopMaxCarryForward,
	                             @RequestParam("LOPearnedLeave") String lopEarnedLeave) {

	        System.out.println("Annual Days: " + annualDays);
	        System.out.println("Carry Forward: " + carryForward);
	        System.out.println("Max Carry Forward: " + maxCarryForward);
	        System.out.println("Earned Leave: " + earnedLeave);
	        System.out.println("Sick Days: " + sickDays);
	        System.out.println("Hospitalisation Days: " + hospitalisationDays);
	        System.out.println("Maternity Days: " + maternityDays);
	        System.out.println("Paternity Days: " + paternityDays);
	        System.out.println("LOP Days: " + lopDays);
	        System.out.println("LOP Carry Forward: " + lopCarryForward);
	        System.out.println("LOP Max Carry Forward: " + lopMaxCarryForward);
	        System.out.println("LOP Earned Leave: " + lopEarnedLeave);
	        LeaveSettings leavesettingobj=new LeaveSettings(annualDays,carryForward,maxCarryForward,earnedLeave,
	        		sickDays,hospitalisationDays,maternityDays,paternityDays,lopDays,lopCarryForward,lopMaxCarryForward,lopEarnedLeave);
	        leaveService.saveData(leavesettingobj);
	        return "Form submitted successfully!";
	    }

}
