package com.aipalbot.carsales.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aipalbot.carsales.webservice.entity.InsuranceEntity;


@Repository
public interface InsuranceRepository extends JpaRepository <InsuranceEntity, Integer > {

}
