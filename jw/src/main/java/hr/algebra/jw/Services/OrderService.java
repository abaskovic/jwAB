package hr.algebra.jw.Services;

import hr.algebra.jw.Dto.CategoryDto;
import hr.algebra.jw.Dto.OrderDto;
import hr.algebra.jw.Model.Category;
import hr.algebra.jw.Model.Order;
import hr.algebra.jw.Model.User;

import java.util.List;

public interface OrderService {
    Order save(OrderDto dto);

    List<Order> findByLoggedUser ();

}
