package com.b127.bug.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b127.bug.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
