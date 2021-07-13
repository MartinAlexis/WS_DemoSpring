package com.fragua.repositories;

import org.springframework.data.repository.CrudRepository;

import com.fragua.entity.Test;

public interface TestCrud extends CrudRepository<Test, String>{

}
