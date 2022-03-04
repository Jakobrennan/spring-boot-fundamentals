package com.exercises.fundamental.springfundamentals.repository;

import com.exercises.fundamental.springfundamentals.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
