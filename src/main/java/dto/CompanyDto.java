package dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
public class CompanyDto {

    private Long id;
    private String name;
    private String email;
    private String password;

}
