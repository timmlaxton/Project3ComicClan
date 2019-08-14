package com.codeclan.Project.ComicClan.projections;

import com.codeclan.Project.ComicClan.models.Comic;
import com.codeclan.Project.ComicClan.models.Publisher;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedPublisher", types = Publisher.class)
public interface EmbedPublisher {
    Long getId();
    String getName();
    String getLogo();
    List<Comic> getComics();
}
