package com.spiri.design.strategy.handler;

import java.util.Map;
import java.util.Objects;

public interface JobHandler {
    public int execute(Map<String, Object> param);
}
