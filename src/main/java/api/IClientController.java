package api;

import dto.ClientDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public interface IClientController {

    @GetMapping("/{id}")
    ResponseEntity<?> getClient(@PathVariable Long id);

    @GetMapping
    Page<ClientDto> getAllClients(Pageable pageable);

    @PostMapping
    ResponseEntity<?> createClient(@RequestBody ClientDto client);

}
