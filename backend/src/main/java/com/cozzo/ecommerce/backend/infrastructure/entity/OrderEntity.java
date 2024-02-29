package com.cozzo.ecommerce.backend.infrastructure.entity;

import com.cozzo.ecommerce.backend.domain.model.OrderState;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
@Entity
@Data
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @CreationTimestamp
    private LocalDateTime dateCreated;
    @Enumerated
    private OrderState orderState;
@ManyToOne//un Usuario puede tener muchas OrderEntity y asociadas a un solo usuario
    private UserEntity userEntity;
@OneToMany(mappedBy = "orderEntity", cascade = CascadeType.PERSIST)//una Orden puede tener muchos Objetos de tipo Productos que se representan en listas
    private List<OrderProductEntity> orderProducts;
}
