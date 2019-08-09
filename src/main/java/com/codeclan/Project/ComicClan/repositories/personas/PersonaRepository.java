package com.codeclan.Project.ComicClan.repositories.personas;

import com.codeclan.Project.ComicClan.models.Persona;
import com.codeclan.Project.ComicClan.repositories.comics.ComicRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>, PersonaRepositoryCustom {
}