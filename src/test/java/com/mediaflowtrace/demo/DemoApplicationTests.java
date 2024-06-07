package com.mediaflowtrace.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mediaflowtrace.demo.companyManagement.dto.CompanyDTO;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@AutoConfigureMockMvc 
@Slf4j
class DemoApplicationTests {

	@Autowired
    private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	//搜尋 companyId =1  找出 name = "Acompany"
	@Test
	@WithUserDetails("user1")
	void testGetCompny() throws Exception{

		MvcResult result  = mockMvc.perform(MockMvcRequestBuilders.get("/get/company?id=1")
		.accept(MediaType.APPLICATION_JSON ))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andReturn();

		MockHttpServletResponse response =result.getResponse();

		String json  = response.getContentAsString();
		CompanyDTO companyDTO = new ObjectMapper().readValue(json, CompanyDTO.class);

		
		Assertions.assertEquals("Acompany",companyDTO.getName(),"这两个值不相同");
	}

	@Test
	@WithUserDetails("user2")
	//測試user2  搜尋 companyId =1 無法取得Company資料
	void testGetCompny_user2() throws Exception{

		MvcResult result  = mockMvc.perform(MockMvcRequestBuilders.get("/get/company?id=1")
		.accept(MediaType.APPLICATION_JSON ))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andReturn();

		MockHttpServletResponse response =result.getResponse();

		String json  = response.getContentAsString();

		Assertions.assertEquals("", json); 
	}

}
