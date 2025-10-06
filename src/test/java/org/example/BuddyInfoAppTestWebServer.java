package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class BuddyInfoAppTestWebServer {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testBuddyInfo() throws Exception {
        HttpEntity<BuddyInfo> requestb = new HttpEntity<>(new BuddyInfo("b", "1234", "1234"));
        BuddyInfo b = restTemplate.postForObject("http://localhost:" + port + "/buddyInfo", requestb, BuddyInfo.class);
        Assertions.assertNotNull(b);
        Assertions.assertEquals(b.getName(), "b");
        //System.out.println(b);
    }
}
