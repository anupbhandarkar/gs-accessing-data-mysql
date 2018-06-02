package com.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



@Service
public interface DocumentRepository extends  CrudRepository<Document, Integer>  {

}
