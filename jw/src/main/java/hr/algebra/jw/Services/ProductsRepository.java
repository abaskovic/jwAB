package hr.algebra.jw.Services;

import hr.algebra.jw.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product,Long> {

}
