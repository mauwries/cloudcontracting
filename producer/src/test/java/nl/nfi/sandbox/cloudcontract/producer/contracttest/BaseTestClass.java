package nl.nfi.sandbox.cloudcontract.producer.contracttest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import nl.nfi.sandbox.cloudcontract.producer.api.v1.ProfileController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@DirtiesContext
@AutoConfigureMessageVerifier
public class BaseTestClass {

    @Autowired
    private ProfileController profileController;

    @BeforeEach
    void onInit() {
        RestAssuredMockMvc.standaloneSetup(profileController);
    }
}
