package nl.nfi.sandbox.cloudcontract.consumer.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClient {
    private final RestTemplate restTemplate;
    private final String baseUrl;

    public RestClient(@Value("${consumer.producer-restclient.base-url}") final String baseUrl,
                      @Value("${consumer.producer-restclient.port}") final int port) {
        this.baseUrl = "%s:%s".formatted(baseUrl, port);
        this.restTemplate = new RestTemplate();
    }

    public ProfileDTO getProfile(final String profileSin) {
        final String url = baseUrl + "/api/v1/profile/" + profileSin;
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json");

        final ResponseEntity<ProfileDTO> exchange = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(httpHeaders), ProfileDTO.class);
        return exchange.getBody();
    }
}
