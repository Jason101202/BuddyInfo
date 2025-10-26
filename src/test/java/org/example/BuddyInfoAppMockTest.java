package org.example;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class BuddyInfoAppMockTest {
    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private BuddyInfoRepo repo;

    @Test
    void shouldContainBuddyInfoBud() throws Exception {
        // Arrange
        BuddyInfo bud = new BuddyInfo("bud", "1234", "1234", "bud@carleton");
        when(repo.findAll()).thenReturn(List.of(bud));

        // Act + Assert
        mockMvc.perform(get("/displayB"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("bud")))
                .andDo(print());
    }
}
