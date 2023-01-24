import org.junit.jupiter.api.Test;
import ua.ithillel.homework31.exception.status.WrongGetByIdStatus;
import ua.ithillel.homework31.service.StatusService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StatusServiceTest {

    public static final StatusService statusService = new StatusService();

    @Test
    void validateJobsForNullOrWhetherItExist() {
        final WrongGetByIdStatus wrongGetByIdStatus = assertThrows(
                WrongGetByIdStatus.class,
                () -> statusService.getById(5000)
        );

        assertEquals("Status is not contained under this id or more than five thousandth of an element.",
                wrongGetByIdStatus.getMessage());
    }
}
