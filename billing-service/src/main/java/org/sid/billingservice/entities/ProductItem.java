package org.sid.billingservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.billingservice.model.Product;


@Data @AllArgsConstructor @NoArgsConstructor @Builder
@Entity
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double price;
    private double quantity;
    private Long productId;
    @ManyToOne @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Bill bill;
    private Double discount;
    @Transient
    private Product product;
}
