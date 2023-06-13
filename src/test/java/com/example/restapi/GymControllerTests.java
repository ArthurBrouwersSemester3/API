package com.example.restapi;

import org.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc

public class GymControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetGyms() throws Exception {
        // Send GET request to the /gyms endpoint with the Auth0 token
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/gyms")
                        .header("Authorization", "Bearer " + "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IkxWOHRFLWYzWmFJRDNRVGYtWGFUdyJ9.eyJpc3MiOiJodHRwczovL2Rldi10Mm0ybGk0Znc1NHNpZzZ0LnVzLmF1dGgwLmNvbS8iLCJzdWIiOiJnb29nbGUtb2F1dGgyfDExMjg5MTAyMzI1Nzg5NzgzODY4OSIsImF1ZCI6WyJodHRwczsvL2d5bXN0YXJzQVBJLyIsImh0dHBzOi8vZGV2LXQybTJsaTRmdzU0c2lnNnQudXMuYXV0aDAuY29tL3VzZXJpbmZvIl0sImlhdCI6MTY4NjIzODAwNCwiZXhwIjoxNjg2MzI0NDA0LCJhenAiOiIydmNIS2JMT0tGa0VhUXZuODI2SkU0MUtWWFc3RlY1MCIsInNjb3BlIjoib3BlbmlkIHByb2ZpbGUgZW1haWwifQ.KUNF-dhgstm8EIb2mVWj4tSiOxsba8xO5nvZ2yJY3kzuPs0AmJb5q3x4xx8g1T9kn4DsC6wCsbKyM88UnBFJQA6J63fz1Tl7W8LP3PcGfRNASz5v5R1mhRUU1Sn7rFdmizsULDenK7ue_YmzjariRxHBEa4-uPpNv4BmnLidpYwQD42MDrA-GBHqqMCeUOojt5e4XNoKli-fhraNKciIIpmy1lgK6rjWUVzOFPcim07dqq_MRew9rgljxJVM4P91hZb70pE58bCLyuKHadafNkW3tUguJwOmigA3lrzI51OztH_EhkwGB3cqJ3i3cL0FiJ7ISpHpGthjY-ad5459lw"))
                .andExpect(MockMvcResultMatchers.status().isOk());

        MvcResult result = resultActions.andReturn();
        String responseBody = result.getResponse().getContentAsString();

        assertThat(result.getResponse().getStatus()).isEqualTo(200);

        JSONArray gyms = new JSONArray(responseBody);
        List<String> gymList = new ArrayList<>();

        for (int i = 0; i < gyms.length(); i++) {
            String gymName = gyms.getString(i);
            gymList.add(gymName);
        }

        // Assert if it has the correct values
        assertThat(gymList).contains("Eindhoven", "Breda", "Den Bosch");
    }
}


