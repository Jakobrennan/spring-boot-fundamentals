package com.exercises.fundamental.springfundamentals.repository;

import com.exercises.fundamental.springfundamentals.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}
