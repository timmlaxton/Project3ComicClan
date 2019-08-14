package com.codeclan.Project.ComicClan.repositories.publishers;

import com.codeclan.Project.ComicClan.models.Publisher;
import com.codeclan.Project.ComicClan.projections.EmbedPublisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedPublisher.class)
public interface PublisherRepository extends JpaRepository<Publisher, Long>, PublisherRepositoryCustom  {
}
