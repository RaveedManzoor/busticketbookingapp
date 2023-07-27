package com.ByTicket.repository;

import com.ByTicket.entity.BuyTickets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusTicketsRepository extends JpaRepository<BuyTickets,Long> {
}
