package com.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Theater {

    private List<List<String>> silver = Arrays.asList(
            Arrays.asList("A1","A2","A3","A4","A5","A6","A7","A8","A9","A10"),
            Arrays.asList("B1","B2","B3","B4","B5","B6","B7","B8","B9","B10"),
            Arrays.asList("C1","C2","C3","C4","C5","C6","C7","C8","C9","C10"),
            Arrays.asList("D1","D2","D3","D4","D5","D6","D7","D8","D9","D10")
    );

    private List<List<String>> gold = Arrays.asList(
            Arrays.asList("A1","A2","A3","A4","A5","A6","A7","A8","A9","A10"),
            Arrays.asList("B1","B2","B3","B4","B5","B6","B7","B8","B9","B10")
    );

    private List<String> platinum =
            Arrays.asList("A1","A2","A3","A4","A5","A6","A7","A8","A9","A10");

    public List<List<String>> getSilver() {
        return silver;
    }

    public List<List<String>> getGold() {
        return gold;
    }

    public List<String> getPlatinum() {
        return platinum;
    }
}
