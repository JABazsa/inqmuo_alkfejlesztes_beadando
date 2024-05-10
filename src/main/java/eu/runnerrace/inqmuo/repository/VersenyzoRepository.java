package eu.runnerrace.inqmuo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.runnerrace.inqmuo.entry.VersenyzoEntry;

public interface VersenyzoRepository extends JpaRepository<VersenyzoEntry,Long > {}