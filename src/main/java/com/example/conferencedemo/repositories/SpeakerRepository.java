package com.example.conferencedemo.repositories;

import com.example.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}