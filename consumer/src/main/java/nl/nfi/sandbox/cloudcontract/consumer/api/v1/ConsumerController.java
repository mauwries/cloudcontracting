package nl.nfi.sandbox.cloudcontract.consumer.api.v1;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.nfi.sandbox.cloudcontract.consumer.client.ProfileDTO;
import nl.nfi.sandbox.cloudcontract.consumer.client.RestClient;

@RestController
@RequestMapping("api/v1")
public class ConsumerController {

    private final RestClient restClient;

    public ConsumerController(final RestClient restClient) {
        this.restClient = restClient;
    }

    @GetMapping(value = "/someEndpoint/{sin}", produces = APPLICATION_JSON_VALUE)
    public ProfileDTO getProfileBySin(@PathVariable("sin") final String sin) {
        final ProfileDTO profile = restClient.getProfile(sin);
        return profile;
    }
}
