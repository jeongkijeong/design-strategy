package com.spiri.design.strategy.handler;

public interface Strategy {
    public final String TYPE = "TYPE";

    public final int JOB_TYPE_100 = 100;  // 작업시작
    public final int JOB_TYPE_110 = 110;  // 작업중지
    public final int JOB_TYPE_120 = 120;  // 일시정지
    public final int JOB_TYPE_130 = 130;  // 재시작
    public final int JOB_TYPE_300 = 300;  // 실행이력
}
