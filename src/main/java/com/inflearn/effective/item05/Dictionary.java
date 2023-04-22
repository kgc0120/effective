package com.inflearn.effective.item05;

import java.util.List;

/**
 * @author bumblebee
 */
public interface Dictionary {

    boolean contains(String word);

    List<String> closeWordsTo(String tyop);
}
