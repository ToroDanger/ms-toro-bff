package cl.toro.integration.ms_toro_bff.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.toro.integration.ms_toro_bff.model.dto.Products;

@Service
public class ProductService {

    public List<Products> getProduct() {
        Products products1 = new Products(1, "producto1", "Holi", 9990);
        Products products2 = new Products(2, "producto2", "Hola", 9990);
        Products products3 = new Products(3, "producto3", "Hello", 9990);

        List<Products> list = new ArrayList<>();
        list.add(products1);
        list.add(products2);
        list.add(products3);
        return list;
    }
}
