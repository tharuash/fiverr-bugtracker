package com.b127.bug.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b127.bug.entity.TicketComment;

public interface TicketCommentRepository extends JpaRepository<TicketComment, Long> {

}
