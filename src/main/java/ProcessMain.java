import com.spiri.design.strategy.handler.JobController;

import java.util.HashMap;
import java.util.Map;

public class ProcessMain {

    public static void main(String[] args) {
        Map<String, Object> param = new HashMap<>();
        param.put("TYPE", 100);

        JobController.handler(param);
    }
}
