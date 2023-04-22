package com.inflearn.effective.item05.factorymethod;

import com.inflearn.effective.item05.Dictionary;

import java.util.List;

/**
 * @author bumblebee
 */
public class SpellChecker {

    private Dictionary dictionary;

    public SpellChecker(DictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.getDictionary();
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String tyop) {
        return dictionary.closeWordsTo(tyop);
    }

}
