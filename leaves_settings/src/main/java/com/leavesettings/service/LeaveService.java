package com.leavesettings.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.leavesettings.model.LeaveSettings;
import com.leavesettings.repository.LeaveSettingsRepository;


@Service
public class LeaveService 
{
  @Autowired
  LeaveSettingsRepository leaveSettingsRepository;
	public String saveData(LeaveSettings leaveSettings)
	{
		leaveSettingsRepository.save(leaveSettings);
		return "saving data sucessfully";
	}
}
