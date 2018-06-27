package entity;

import dto.ClientDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "CLIENT")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CNP")
    private String cnp;

    @Column(name = "address")
    private String address;

    public ClientDto toDto() {
        ClientDto dto = new ClientDto();
        dto.setId(this.id);
        dto.setName(this.name);
        dto.setAddress(this.address);
        dto.setCnp(this.cnp);
        return dto;
    }

    public ClientEntity update(ClientDto dto) {
        this.name = dto.getName();
        this.cnp = dto.getCnp();
        this.address = dto.getAddress();
        return this;
    }

}
