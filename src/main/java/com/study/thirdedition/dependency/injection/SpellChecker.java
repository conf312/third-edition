package com.study.thirdedition.dependency.injection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 의존 객체 주입이라 하는 이 기법은 클래스의 유연성, 재사용성, 테스트
 용이성을 개선해준다.
 */
public class SpellChecker {
    private final Object dictionary;
    public SpellChecker(Object dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
        return true;
    }

    public List<String> suggestions(String type) {
        return new ArrayList();
    }

}
