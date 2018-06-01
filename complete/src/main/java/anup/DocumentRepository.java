package anup;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



//@Repository("documentRepository")
public interface DocumentRepository extends  CrudRepository<Document, Integer>  {

}
