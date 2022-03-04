package com.exercises.fundamental.springfundamentals.repository;

import com.exercises.fundamental.springfundamentals.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}

