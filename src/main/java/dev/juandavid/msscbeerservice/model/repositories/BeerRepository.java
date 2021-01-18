package dev.juandavid.msscbeerservice.model.repositories;

import dev.juandavid.msscbeerservice.model.entities.Beer;
import org.springframework.data.repository.CrudRepository;


import java.util.UUID;

public interface BeerRepository extends CrudRepository<Beer, UUID> {

}
