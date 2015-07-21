package com.dragos.apps.RyuJisho;

import com.dragos.apps.RyuJisho.service.JishoService;
import com.dragos.apps.RyuJisho.service.JishoServiceImpl;
import org.junit.Test;

public class JishoServiceTest {
    @Test
    public void testFetchingDefinition() throws Exception{
        JishoService jishoService = new JishoServiceImpl();
        com.dragos.apps.RyuJisho.Definition definition = jishoService.fetchDefinition("house");
        System.out.println(definition);
    }
}
