package ar.edu.unq.desapp.eventeando.backend.controller;
import ar.edu.unq.desapp.eventeando.backend.model.product.Product;
import ar.edu.unq.desapp.eventeando.backend.repository.ProductRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/product"})
public class ProductController extends AbstractController<Product>{

    public ProductController(ProductRepository repository){
        super(repository);
    }
}