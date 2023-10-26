package quartzSample;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzMain {
	public static void main(String[] args) {
		try {
            SchedulerFactory schedulerFactory = new StdSchedulerFactory();
            Scheduler scheduler = schedulerFactory.getScheduler();

            scheduler.scheduleJob(new DetailMaker().getJob(), new TriggerMaker().getTrigger());
            scheduler.start();

            Thread.sleep(60000);
            scheduler.shutdown();
        } catch (SchedulerException | InterruptedException e) {
		   e.printStackTrace();
        }
	}
}