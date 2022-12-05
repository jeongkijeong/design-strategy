package com.spiri.design.strategy.handler;


import com.spiri.common.Utils;

import java.util.Map;

public class JobController {

    public static int handler(Map<String, Object> param) {
        int retv = -1;

        JobHandler jobHandler = null;
        if (param == null) {
            return retv;
        }

        int type = (Integer) Utils.nvl(param.get(Strategy.TYPE), -999);
        switch (type) {
            case Strategy.JOB_TYPE_100:
                jobHandler = new JobHandler100();

                break;
            case Strategy.JOB_TYPE_110:
                jobHandler = new JobHandler110();

                break;
            case Strategy.JOB_TYPE_120:
                jobHandler = new JobHandler120();

                break;
            case Strategy.JOB_TYPE_130:
                jobHandler = new JobHandler130();

                break;
            case Strategy.JOB_TYPE_300:
                jobHandler = new JobHandler300();

                break;
            default:
                break;
        }

        if (jobHandler != null) {
            retv = jobHandler.execute(param);
        } else {
            System.out.println("Could not find matched job handler!");
        }

        return retv;
    }
}
