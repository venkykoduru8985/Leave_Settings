package com.leavesettings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leavesettings.model.LeaveSettings;



public interface LeaveSettingsRepository extends JpaRepository<LeaveSettings, Long>{

}
