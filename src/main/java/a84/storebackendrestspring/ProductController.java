package a84.storebackendrestspring;

import a84.storebackendrestspring.m.store.Product;
import a84.storebackendrestspring.m.store.ProductDAO;
import a84.storebackendrestspring.m.store.ProductFeedback;
import a84.storebackendrestspring.m.store.ProductFeedbackDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductDAO productDAO;

    @Autowired
    ProductFeedbackDAO productFeedbackDAO;

    @GetMapping("/products/all")
    public List<Product> getAllProducts() {
        return productDAO.findAll();
    }

    @GetMapping("/productsfeedback/{id}")
    List<ProductFeedback> newProductFeedback(@PathVariable int id) {
        Product product = productDAO.findById(id);
        return productFeedbackDAO.findAllByProduct(product);
    }

    @PostMapping("/productsfeedback/add")
    ProductFeedback newProductFeedback(@RequestBody ProductFeedback pf) {
        ProductFeedback res = null;
        try {
            res = productFeedbackDAO.save(pf);
        } catch (Exception e) {
            System.out.print(e);
        }
        return res;
    }


    @RequestMapping(value = "*")
    public void getURLValue(HttpServletRequest request){
        String test = request.getRequestURI();
        System.out.println(test);
    }
}
