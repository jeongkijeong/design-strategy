package com.spiri.design.strategy.handler;

import java.util.Map;
import java.util.Objects;

public class JobHandler100 implements JobHandler {
    @Override
    public int execute(Map<String, Object> param) {
        System.out.println("execute JobHandler100");

        return 0;
    }
}
