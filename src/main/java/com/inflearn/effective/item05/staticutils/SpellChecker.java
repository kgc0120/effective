package com.inflearn.effective.item05.staticutils;

import com.inflearn.effective.item05.DefaultDictionary;
import com.inflearn.effective.item05.Dictionary;

import java.util.List;

/**
 * @author bumblebee
 *
 * 본인이 가지고 있는 리소스에 따라 동작이 달라지는 경우에 자원을 명시하지 마라
 */
public class SpellChecker {

    private static final Dictionary dictionary = new DefaultDictionary(); // 자원을 명시하는 것

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String tyop) {
        return dictionary.closeWordsTo(tyop);
    }


}
