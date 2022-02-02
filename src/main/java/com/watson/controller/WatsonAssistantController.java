package com.watson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

import com.watson.configuration.WatsonAssistantMessage;
import com.watson.configuration.WatsonAssistantService;

@RestController
public class WatsonAssistantController {


	private WatsonAssistantService watsonAssistantService;

	@Autowired
	public WatsonAssistantController(WatsonAssistantService watsonAssistantService) {
		this.watsonAssistantService = watsonAssistantService;
	}

	@RequestMapping(value="/send", method = RequestMethod.GET)
	public JsonNode send(@RequestParam("message") String message) throws JsonProcessingException {
		WatsonAssistantMessage response;
		response = watsonAssistantService.sendMessage(message);

		return response.getGeneric();

	}
	@RequestMapping(value="/test",produces = { "application/json" })
	public String test(){

		return "Welcome to signature;";

	}
	//@PostMapping(value="/get_account{custmer_number}")
	//public String getAccountDetails()
	
}
