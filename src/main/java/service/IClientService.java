package service;

import entity.ClientEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IClientService {

    Page<ClientEntity> findAllClients(Pageable pageable);

    ClientEntity findByCnp(String email);

    ClientEntity findById(Long id);

    void saveClient(ClientEntity clientEntity);

}
