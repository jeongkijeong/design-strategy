package com.spiri.design.strategy.handler;

import java.util.Map;
import java.util.Objects;

public class JobHandler120 implements JobHandler {
    @Override
    public int execute(Map<String, Object> param) {
        System.out.println("execute JobHandler120");

        return 0;
    }
}
