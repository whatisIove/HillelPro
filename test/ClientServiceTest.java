import org.junit.jupiter.api.Test;
import ua.ithillel.homework31.exception.client.*;
import ua.ithillel.homework31.service.ClientService;

import static org.junit.jupiter.api.Assertions.*;

public class ClientServiceTest {

    private static final ClientService clientService = new ClientService();

    @Test
    void validateGetByPhone() {
        final IncorrectClientPhone incorrectClientPhone = assertThrows(
                IncorrectClientPhone.class,
                () -> clientService.getByPhone(380963567721L)
        );

        assertEquals("Phone is incorrect.", incorrectClientPhone.getMessage());
    }

    @Test
    void validateClientEmailTest() {
        final WrongClientEmail wrongClientEmail = assertThrows(
                WrongClientEmail.class,
                () -> clientService.validateEmail(null)
        );

        assertEquals("Email is wrong or null.", wrongClientEmail.getMessage());
    }

    @Test
    void validateClientNameTest() {
        final WrongClientName wrongClientEmail = assertThrows(
                WrongClientName.class,
                () -> clientService.validateName(null)
        );

        assertEquals("Name is wrong or null.", wrongClientEmail.getMessage());
    }

    @Test
    void validateClientPhoneTest() {
        final WrongClientPhone wrongClientPhone = assertThrows(
                WrongClientPhone.class,
                () -> clientService.validatePhone(null)
        );

        assertEquals("Phone is wrong or null.", wrongClientPhone.getMessage());
    }

    @Test
    void validateClientAgeTest() {
        final WrongClientAge wrongClientAge = assertThrows(
                WrongClientAge.class,
                () -> clientService.validateAge(17)
        );

        assertEquals("Age is wrong or null.", wrongClientAge.getMessage());
    }

    @Test
    void validateIsNotNullClient() {
        final WrongClientInfo wrongClientInfo = assertThrows(
                WrongClientInfo.class,
                () -> clientService.validateClient(null)
        );

        assertEquals("Client is null.", wrongClientInfo.getMessage());
    }
}
