package com.inflearn.effective.item05.dependencyinjection;



import com.inflearn.effective.item05.Dictionary;

import java.util.List;

/**
 * @author bumblebee
 *
 * 모든 코드가 재사용 가능하다 어떻게? Dictionary 가 interface이기 때문에 변경이 되지 않으니까 */
public class SpecllChecker {

    // 5번째 item의 핵심 부분 start
    // staticutils SpecllChecker와 비교
    private final Dictionary dictionary;

    public SpecllChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }
    // 5번째 item의 핵심 부분 end

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String tyop) {
        return dictionary.closeWordsTo(tyop);
    }

}
