package service;

import entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.ClientRepository;

import java.util.Optional;

public class ClientServiceImpl implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Page<ClientEntity> findAllClients(Pageable pageable) {
        return clientRepository.findAll(pageable);
    }

    @Override
    public ClientEntity findById(Long id) {
        return clientRepository.findOne(id);
    }

    @Override
    public ClientEntity findByCnp(String email) {
        return null;
    }

    @Override
    public void saveClient(ClientEntity clientEntity) {

    }
}
