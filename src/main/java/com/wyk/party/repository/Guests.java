package com.wyk.party.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wyk.party.model.Guest;

public interface Guests extends JpaRepository<Guest, Long>{

}
