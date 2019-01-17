package pl.coderslab.dao;

import org.springframework.stereotype.Component;
import pl.coderslab.objects.Product;

import java.util.ArrayList;
import java.util.List;


@Component
public class ProductDAO {

    public List<Product> getList(){
        List<Product> productList= new ArrayList<>();
        productList.add(new Product(10L,"banan",4.19));
        productList.add(new Product(20L,"mleko",3.50));
        productList.add(new Product(30L,"kubek",5.90));
        productList.add(new Product(40L,"łyżka",2.50));
        productList.add(new Product(50L,"dupa",150.00));
        return productList;
    }

}
