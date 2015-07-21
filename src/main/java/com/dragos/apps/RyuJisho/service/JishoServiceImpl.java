package com.dragos.apps.RyuJisho.service;

import com.dragos.apps.RyuJisho.Definition;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class JishoServiceImpl implements JishoService {

    private final Client client;
    private final ObjectMapper mapper = new ObjectMapper();
    private final String api;

    @Inject
    public JishoServiceImpl(@Named("jishoApiUrl") String api) {
        this.api = api;
        this.client = ClientBuilder.newClient();
    }

    @Override
    public Definition fetchDefinition(String keyword) throws Exception{
        WebTarget webTarget = client.target(api).queryParam("keyword", keyword);
        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON )
                .header("Content-Type", "application/json; charset=utf-8");
        Response response = invocationBuilder.get();
        String jsonResponse = response.readEntity(String.class);
        Definition definition = mapper.readValue(jsonResponse, Definition.class);
        return definition;
    }
}
