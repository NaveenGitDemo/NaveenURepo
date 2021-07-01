package com.nit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nit.controller.AccountInfo;
import com.nit.service.AccountServiceReq;
import com.nit.service.AddressService;

@WebMvcTest(AccountInfo.class)
public class AccountInfoControllerTest {

	@Autowired
	public MockMvc mockMvc;
	@MockBean
	AccountServiceReq accountServiceReq;
	@MockBean
	AddressService addressService;
	private static ObjectMapper mapper = new ObjectMapper();
	@Test
    public void createAccountRequest() throws Exception {
   	List<Address> addList=new ArrayList<Address>();
    	
    	Address add=new Address();
    	add.setAddressLine1("something");
    	add.setAddressLine12("2nd line");
    	addList.add(add);
    	AcccountRequest req=new AcccountRequest();
    	req.setId(1);
    	req.setAccountName("naveen");
    	req.setAddressinfon(addList);
		/*
		 * String content="{\n" + "   \"accountNumber\" :\"\",\n" +
		 * "   \"accountName\"   :\"Comercial\",\n" + "   \"addressinfon\"  :[\n" +
		 * "           		{\n" +
		 * "    			\"addressLine1\" : \"B56 Krishna\",\n" +
		 * "    			\"addressLine12\" :\" Gulabpura \",\n" +
		 * "    			\"city\" :\" Bhilwara \",\n" +
		 * "    			\"state\" : \" rajasthan \",\n" + " 			 },\n" +
		 * "			{\n" +
		 * "    			\"addressLine1\" : \"lumbani apartment\",\n" +
		 * "    			\"addressLine12\" :\" hyderaba Dk Road\",\n" +
		 * "    			\"city\" : \"Hyderabad\",\n" +
		 * "    			\"state\" : \"Telengana\",\n" + " 			 }\n" +
		 * "                    ]\n" + "}";
		 */
    	
    	Mockito.when(accountServiceReq.saveAccountInfo(ArgumentMatchers.any())).thenReturn(req);
    	
    	String json = mapper.writeValueAsString(req);
        mockMvc.perform(MockMvcRequestBuilders.post("/saveAccountInfo").contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
                .content(json).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id", org.hamcrest.Matchers.equalTo(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.accountName", org.hamcrest.Matchers.equalTo("naveen")));

    	
		/*
		 * RequestBuilder
		 * builder=MockMvcRequestBuilders.post("/saveAccountInfo").accept(MediaType.
		 * APPLICATION_JSON).content(content).contentType(MediaType.APPLICATION_JSON);
		 * MvcResult result=mockMvc.perform(builder).andReturn();
		 * MockHttpServletResponse response = result.getResponse();
		 * response.getStatus(); assertEquals(HttpStatus.OK, response.getStatus());
		 */
    	        
    }

	
}
