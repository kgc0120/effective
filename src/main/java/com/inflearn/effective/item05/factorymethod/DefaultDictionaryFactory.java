package com.inflearn.effective.item05.factorymethod;

import com.inflearn.effective.item05.DefaultDictionary;
import com.inflearn.effective.item05.Dictionary;

/**
 * @author bumblebee
 */
public class DefaultDictionaryFactory implements DictionaryFactory{

    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }
}
