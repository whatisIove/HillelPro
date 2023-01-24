import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ua.ithillel.homework31.entity.Account;
import ua.ithillel.homework31.entity.Client;
import ua.ithillel.homework31.exception.client.*;
import ua.ithillel.homework31.service.ClientService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

public class AccountServiceTest {

    private final ClientService clientService = Mockito.mock(ClientService.class);
    private final Client vladClient = new Client("Vlad", "vladislav@mail.ua",
            999L, "None", 18);
    private final Account vladAccount = new Account(1, "137", 2282.00, vladClient);

    @Test
    void validateIfThereIsClientInAccountAndItIFilled() throws WrongClientInfo {

        when(clientService.validateName(anyString())).thenThrow(WrongClientName.class);
        when(clientService.validateAge(anyInt())).thenThrow(WrongClientAge.class);
        when(clientService.validateEmail(anyString())).thenThrow(WrongClientEmail.class);
        when(clientService.validatePhone(anyLong())).thenThrow(WrongClientPhone.class);

        assertEquals("Vlad", vladAccount.getClient().getName());
        assertEquals(18, vladAccount.getClient().getAge());
        assertEquals("vladislav@mail.ua", vladAccount.getClient().getEmail());
        assertEquals(999L, vladAccount.getClient().getPhone());

    }

}