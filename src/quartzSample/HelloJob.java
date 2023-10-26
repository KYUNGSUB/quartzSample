package quartzSample;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job {
	public HelloJob() {
        System.err.println("HelloJob created");
    }

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.err.println("Hello");
	}
}