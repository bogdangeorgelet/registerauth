package controller;

import api.IClientController;
import dto.ClientDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

@Component
@CrossOrigin
public class ClientControllerImpl implements IClientController {

    @Override
    public ResponseEntity<?> getClient(Long id) {
        return null;
    }

    @Override
    public Page<ClientDto> getAllClients(Pageable pageable) {
        return null;
    }

    @Override
    public ResponseEntity<?> createClient(ClientDto client) {
        return null;
    }
}
