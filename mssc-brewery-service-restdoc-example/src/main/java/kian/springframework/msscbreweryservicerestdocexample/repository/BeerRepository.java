package kian.springframework.msscbreweryservicerestdocexample.repository;

import kian.springframework.msscbreweryservicerestdocexample.domain.Beer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created By Kian on 2023-04-03.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID>, CrudRepository<Beer, UUID> {
}
