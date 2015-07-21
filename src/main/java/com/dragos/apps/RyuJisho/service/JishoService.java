package com.dragos.apps.RyuJisho.service;

import com.dragos.apps.RyuJisho.model.Definition;

/**
 * Created by dragos on 7/19/2015.
 */
public interface JishoService {
    Definition fetchDefinition(String keyword);
}
