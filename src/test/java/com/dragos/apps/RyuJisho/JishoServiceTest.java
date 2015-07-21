package com.dragos.apps.RyuJisho;

import com.dragos.apps.RyuJisho.service.JishoService;
import com.dragos.apps.RyuJisho.service.JishoServiceImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.name.Names;
import org.junit.Test;

public class JishoServiceTest {
    @Test
    public void testFetchingDefinition() throws Exception{
        JishoService jishoService = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bindConstant().annotatedWith(Names.named("jishoApiUrl")).to("http://beta.jisho.org/api/v1/search/words");
            }
        }).getInstance(JishoServiceImpl.class);

        com.dragos.apps.RyuJisho.Definition definition = jishoService.fetchDefinition("house");
        System.out.println(definition);
    }
}
