import org.junit.jupiter.api.Test;
import ua.ithillel.homework31.exception.job.WrongJobInfo;
import ua.ithillel.homework31.service.JobService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JobServiceTest {
    public static final JobService jobService = new JobService();

    @Test
    void validateJobsForNullOrWhetherItExist() {
        final WrongJobInfo wrongJobInfo = assertThrows(
                WrongJobInfo.class,
                () -> jobService.validateJob(null, null)
        );

        assertEquals("Jobs is null or does not contain job.", wrongJobInfo.getMessage());
    }

}
