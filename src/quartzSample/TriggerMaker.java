package quartzSample;

import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;

public class TriggerMaker {
	public Trigger getTrigger() {
        Trigger trigger = TriggerBuilder.newTrigger()
            .withIdentity("HelloTrigger", "HelloGroup")
            .startNow()
            .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(5)
                .repeatForever())
            .build();
        return trigger;
    }
}