package com.dragos.apps.RyuJisho.service;

import com.dragos.apps.RyuJisho.Definition;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class JishoServiceImpl implements JishoService {

    private final Client client;
    private final ObjectMapper mapper = new ObjectMapper();

    public JishoServiceImpl() {
        this.client = ClientBuilder.newClient();
    }

    @Override
    public Definition fetchDefinition(String keyword) throws Exception{
        WebTarget api = client.target("http://beta.jisho.org/api/v1/search/words").queryParam("keyword", keyword);
        Invocation.Builder invocationBuilder = api.request(MediaType.APPLICATION_JSON ).header("Content-Type", "application/json; charset=utf-8");
        Response response = invocationBuilder.get();
        String jsonResponse = response.readEntity(String.class);
        Definition definition = mapper.readValue(jsonResponse, Definition.class);
        return definition;
    }
}
