package eu.runnerrace.inqmuo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.runnerrace.inqmuo.entry.EredmenyEntry;

public interface EredmenyRepository extends JpaRepository<EredmenyEntry,Long > {
    List<EredmenyEntry> findAllByVerseny_VersenyId(Long id);
}