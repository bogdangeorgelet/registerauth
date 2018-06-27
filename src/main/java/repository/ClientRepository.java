package repository;

import entity.ClientEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClientRepository extends PagingAndSortingRepository<ClientEntity, Long> {

    @Override
    Page<ClientEntity> findAll(Pageable pageable);

    ClientEntity findByCnp(String cnp);

}
