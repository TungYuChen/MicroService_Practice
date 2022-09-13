//package com.microservice.microservicepractice;
//
//import com.microservice.microservicepractice.model.ProductResponse;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.testcontainers.containers.MongoDBContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//import org.testcontainers.shaded.com.fasterxml.jackson.core.JsonProcessingException;
//import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.math.BigDecimal;
//
//@SpringBootTest
//@ExtendWith(SpringExtension.class)
//@Testcontainers
//@AutoConfigureMockMvc
//class MicroservicePracticeApplicationTests {
//
//    @Container
//    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo: 4.4.2");
//    @Autowired
//    private MockMvc mockMvc;
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @DynamicPropertySource
//    static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
//        dynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
//
//    }
//
//
//
//    @Test
//    void shouldCreateProduct() throws JsonProcessingException {
//        ProductResponse productResponse = getProductRequset();
//        String productResponseString = objectMapper.writeValueAsString(productResponse);
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//                .contentType(MediaType.APPLICATION_JSON))
//                .content(productResponseString);
//
//    }
//
//    private ProductResponse getProductRequset() {
//        return ProductResponse.builder()
//                .name("james")
//                .description("Is me")
//                .price(BigDecimal.valueOf(1200))
//                .build();
//    }
//
//}
