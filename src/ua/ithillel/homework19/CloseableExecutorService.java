package ua.ithillel.homework19;

import java.util.concurrent.ExecutorService;

public class CloseableExecutorService implements AutoCloseable
{
    private final ExecutorService service;

    public CloseableExecutorService(ExecutorService service)
    {
        super();
        this.service = service;
    }

    public void execute(Runnable runnable)
    {
        if(service == null)
        {
            return;
        }
        service.execute(runnable);
    }

    @Override
    public void close()
    {
        if(service != null )
        {
            service.shutdown();
        }
    }
}