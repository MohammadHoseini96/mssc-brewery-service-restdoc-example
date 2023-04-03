package kian.springframework.msscbreweryservicerestdocexample.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created By Kian on 2023-04-03.
 */
public class BeerPagedList extends PageImpl<BeerDto> {

 public BeerPagedList(List<BeerDto> content, Pageable pageable, long total) {
  super(content, pageable, total);
 }

 public BeerPagedList(List<BeerDto> content) {
  super(content);
 }
}