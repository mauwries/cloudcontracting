package nl.nfi.sandbox.cloudcontract.consumer.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/profile")
public class ConsumerController {

    private final RestTemplate restTemplate;

    public ConsumerController(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/someEndpoint")
    public String checkOddAndEven(@RequestParam("number") Integer number) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json");

        ResponseEntity<String> responseEntity = restTemplate.exchange(
            "http://localhost:8090/validate/prime-number?number=" + number,
            HttpMethod.GET,
            new HttpEntity<>(httpHeaders),
            String.class);

        return responseEntity.getBody();
    }
}
