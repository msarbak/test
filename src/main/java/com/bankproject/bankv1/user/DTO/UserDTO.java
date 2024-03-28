package com.bankproject.bankv1.user.DTO;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter //lombokdan cektik
@Setter // bunuda lombokdan cektik
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
}
