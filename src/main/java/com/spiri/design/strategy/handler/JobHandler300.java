package com.spiri.design.strategy.handler;

import java.util.Map;
import java.util.Objects;

public class JobHandler300 implements JobHandler {
    @Override
    public int execute(Map<String, Object> param) {
        System.out.println("execute JobHandler300");

        return 0;
    }
}
