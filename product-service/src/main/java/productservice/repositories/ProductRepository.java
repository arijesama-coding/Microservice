package productservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import productservice.models.Product;

public interface ProductRepository extends MongoRepository<Product, String> {}