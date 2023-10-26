package quartzSample;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;

public class DetailMaker {
	public JobDetail getJob() {
    	JobDetail job = JobBuilder.newJob(HelloJob.class)
            .withIdentity("HelloJob", "HelloGroup")
            .withDescription("simple hello job")
            .usingJobData("num", 0)
            .build();
    	return job;
    }
}