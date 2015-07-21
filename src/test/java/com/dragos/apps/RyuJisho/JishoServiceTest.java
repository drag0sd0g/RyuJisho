package com.dragos.apps.RyuJisho;

import com.dragos.apps.RyuJisho.model.Definition;
import com.dragos.apps.RyuJisho.service.JishoService;
import com.dragos.apps.RyuJisho.service.JishoServiceImpl;
import org.junit.Test;

public class JishoServiceTest {

    @Test
    public void testFetchingDefinition(){
        JishoService jishoService = new JishoServiceImpl();
        Definition definition = jishoService.fetchDefinition("house");
        System.out.println(definition);
    }

}
