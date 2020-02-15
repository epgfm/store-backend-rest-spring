package a84.storebackendrestspring.m.store;

import javax.persistence.*;

@Entity
public class ProductFeedback {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int productFeedbackId;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private String feedback;

    public ProductFeedback(int productFeedbackId, Product product, String feedback) {
        this.productFeedbackId = productFeedbackId;
        this.product = product;
        this.feedback = feedback;
    }

    public ProductFeedback(Product product, String feedback) {
        this.product = product;
        this.feedback = feedback;
    }

    public ProductFeedback() {}

    public int getProductFeedbackId() {
        return productFeedbackId;
    }

    public void setProductFeedbackId(int productFeedbackId) {
        this.productFeedbackId = productFeedbackId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
