package mongodb.repositories;

import mongodb.documents.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by juliochrisostomo on 20/08/17.
 */
public interface UserRepository extends MongoRepository<User, String> {

}
