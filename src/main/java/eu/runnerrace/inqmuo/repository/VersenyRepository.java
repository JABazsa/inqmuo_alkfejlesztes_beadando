package eu.runnerrace.inqmuo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.runnerrace.inqmuo.entry.VersenyEntry;

public interface VersenyRepository extends JpaRepository<VersenyEntry,Long > {}
