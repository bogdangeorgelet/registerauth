package entity;

import dto.CompanyDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "COMPANY")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ENABLED")
    private boolean enabled;

    @Column(name = "CONFIRMATION_TOKEN")
    private String confirmationToken;

    public static List<CompanyDto> toDtos(List<CompanyEntity> clients) {
        return clients.stream().map(CompanyEntity::toDto).collect(Collectors.toList());
    }

    public CompanyDto toDto() {
        CompanyDto dto = new CompanyDto();
        dto.setId(this.id);
        dto.setName(this.name);
        dto.setEmail(this.name);
        dto.setPassword(this.password);
        return dto;
    }

    public CompanyEntity update(CompanyDto dto) {
        this.name = dto.getName();
        this.email = dto.getEmail();
        return this;
    }

}
