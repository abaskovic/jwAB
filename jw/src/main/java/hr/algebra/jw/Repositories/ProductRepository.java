package hr.algebra.jw.Repositories;

import hr.algebra.jw.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
