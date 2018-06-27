package api;

import dto.ReviewDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController("/review")
public interface IReviewController {

    @GetMapping("/company/{company_id}")
    ResponseEntity<List<ReviewDto>> listReviewsByCompanyId(@PathVariable Long company_id);

    @GetMapping("/client/{client_id}")
    ResponseEntity<List<ReviewDto>> listReviewsByClientId(@PathVariable Long client_id);

    @GetMapping
    ResponseEntity<List<ReviewDto>> getAll();

    @PostMapping
    ResponseEntity<?> createClient(@RequestBody ReviewDto reviewDto, @RequestParam Long company_id,
                                   @RequestParam Long user_id, UriComponentsBuilder uriComponentsBuilder);

}
