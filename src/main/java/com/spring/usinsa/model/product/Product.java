package com.spring.usinsa.model.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title; // 상품명
    private int price;    // 가격
    private String gender;  // 상품 성별
    private String image;   // 상품 대표 이미지
    private int discountRate; // 할인율

    private Long discountStartDate;  // 세일 시작 기간
    private Long discountEndDate;    // 세일 종료 기간
    private Long createdAt;          // 상품 등록 시간

    @ManyToOne(fetch = FetchType.LAZY)
//    @JsonIgnore
    private SubCategory subCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    private Brand brand;
}
