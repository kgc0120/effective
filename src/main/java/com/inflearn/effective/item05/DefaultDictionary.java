package com.inflearn.effective.item05;

import java.util.List;

/**
 * @author bumblebee
 */
public class DefaultDictionary implements Dictionary{

    @Override
    public boolean contains(String word) {
        return false;
    }

    @Override
    public List<String> closeWordsTo(String tyop) {
        return null;
    }
}
