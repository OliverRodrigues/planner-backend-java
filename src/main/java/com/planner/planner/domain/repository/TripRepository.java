package com.planner.planner.domain.repository;

import com.planner.planner.domain.entity.TripEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TripRepository extends JpaRepository<TripEntity, UUID> {
}
