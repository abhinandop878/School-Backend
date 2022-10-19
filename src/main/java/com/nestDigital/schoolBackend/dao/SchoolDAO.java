package com.nestDigital.schoolBackend.dao;

import com.nestDigital.schoolBackend.model.SchoolModel;
import org.springframework.data.repository.CrudRepository;

public interface SchoolDAO extends CrudRepository<SchoolModel,Integer> {

}
