package kian.springframework.msscbreweryservicerestdocexample.web.mapper;

import kian.springframework.msscbreweryservicerestdocexample.domain.Beer;
import kian.springframework.msscbreweryservicerestdocexample.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created By Kian on 2023-04-03.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

 BeerDto BeerToBeerDto(Beer beer);

 Beer BeerDtoToBeer(BeerDto dto);
}