package com.bankproject.bankv1.user.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity // entittylerde bunu böyle yazmamız gerekli
@Table(
        name = "BANKPROJECT"
)
@Getter //lombokdan cektik
@Setter // bunuda lombokdan cektik

public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @Id // bu da olmalı
    private Long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;

}
