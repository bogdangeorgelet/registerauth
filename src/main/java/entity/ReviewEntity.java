package entity;

import dto.ReviewDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TEXT")
    private String text;

    @Column(name = "VALUE")
    private double value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    private ClientEntity client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ID")
    private CompanyEntity company;

    public static List<ReviewDto> toDtos(List<ReviewEntity> clients) {
        return clients.stream().map(ReviewEntity::toDto).collect(Collectors.toList());
    }

    public ReviewDto toDto() {
        ReviewDto dto = new ReviewDto();
        dto.setId(id);
        dto.setText(text);
        dto.setValue(value);
        dto.setCompanyName(company.getName());
        dto.setClientName(client.getName());
        return dto;
    }


    public ReviewEntity update(ReviewDto dto) {
        this.text = dto.getText();
        this.value = dto.getValue();
        return this;
    }

}
