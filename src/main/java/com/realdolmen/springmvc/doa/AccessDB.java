package com.realdolmen.springmvc.doa;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import com.realdolmen.springmvc.models.EmployeeVO;

public interface AccessDB extends CrudRepository<User, Integer> {

}