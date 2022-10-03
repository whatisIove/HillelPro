package ua.ithillel.homework8.entity;

public class Client {

    private String clientId;
    private String clientSurname;
    private String accountId;
    private double sum;

    public Client() {
    }

    public Client(String clientId, String clientSurname, String accountId, double sum) {
        this.clientId = clientId;
        this.clientSurname = clientSurname;
        this.accountId = accountId;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId='" + clientId + '\'' +
                ", clientSurname='" + clientSurname + '\'' +
                ", accountId='" + accountId + '\'' +
                ", sum=" + sum +
                '}';
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
