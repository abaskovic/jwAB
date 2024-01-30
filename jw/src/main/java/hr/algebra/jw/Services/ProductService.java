package hr.algebra.jw.Services;

import hr.algebra.jw.Dto.ProductDto;
import hr.algebra.jw.Dto.UserDto;
import hr.algebra.jw.Model.Category;
import hr.algebra.jw.Model.Product;
import hr.algebra.jw.Model.User;

import java.util.List;

public interface ProductService {
    Product save(ProductDto productDto);
    Product update(ProductDto productDto, long id);
    public List<Category> getAllCategories();
}
