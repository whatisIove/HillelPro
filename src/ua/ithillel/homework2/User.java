package ua.ithillel.homework2;

public class User {

    private String name;
    private char clientType;
    private byte clientDiscount;
    private short numberOfOrders;
    private int clientId;
    private long orderId;
    private float lastOrderAmount;
    private double ordersAmount;
    private boolean userIsActive;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, char clientType) {
        this.name = name;
        this.clientType = clientType;
    }

    public User(String name, char clientType, byte clientDiscount) {
        this.name = name;
        this.clientType = clientType;
        this.clientDiscount = clientDiscount;
    }

    public User(String name, char clientType, byte clientDiscount, short numberOfOrders) {
        this.name = name;
        this.clientType = clientType;
        this.clientDiscount = clientDiscount;
        this.numberOfOrders = numberOfOrders;
    }

    public User(String name, char clientType, byte clientDiscount, short numberOfOrders, int clientId) {
        this.name = name;
        this.clientType = clientType;
        this.clientDiscount = clientDiscount;
        this.numberOfOrders = numberOfOrders;
        this.clientId = clientId;
    }

    public User(String name, char clientType, byte clientDiscount, short numberOfOrders, int clientId, long orderId) {
        this.name = name;
        this.clientType = clientType;
        this.clientDiscount = clientDiscount;
        this.numberOfOrders = numberOfOrders;
        this.clientId = clientId;
        this.orderId = orderId;
    }

    public User(String name, char clientType, byte clientDiscount, short numberOfOrders, int clientId,
                long orderId, float lastOrderAmount) {
        this.name = name;
        this.clientType = clientType;
        this.clientDiscount = clientDiscount;
        this.numberOfOrders = numberOfOrders;
        this.clientId = clientId;
        this.orderId = orderId;
        this.lastOrderAmount = lastOrderAmount;
    }

    public User(String name, char clientType, byte clientDiscount, short numberOfOrders, int clientId, long orderId,
                float lastOrderAmount, double ordersAmount) {
        this.name = name;
        this.clientType = clientType;
        this.clientDiscount = clientDiscount;
        this.numberOfOrders = numberOfOrders;
        this.clientId = clientId;
        this.orderId = orderId;
        this.lastOrderAmount = lastOrderAmount;
        this.ordersAmount = ordersAmount;
    }

    public User(String name, char clientType, byte clientDiscount, short numberOfOrders, int clientId, long orderId,
                float lastOrderAmount, double ordersAmount, boolean userIsActive) {
        this.name = name;
        this.clientType = clientType;
        this.clientDiscount = clientDiscount;
        this.numberOfOrders = numberOfOrders;
        this.clientId = clientId;
        this.orderId = orderId;
        this.lastOrderAmount = lastOrderAmount;
        this.ordersAmount = ordersAmount;
        this.userIsActive = userIsActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getClientType() {
        return clientType;
    }

    public void setClientType(char clientType) {
        this.clientType = clientType;
    }

    public byte getClientDiscount() {
        return clientDiscount;
    }

    public void setClientDiscount(byte clientDiscount) {
        this.clientDiscount = clientDiscount;
    }

    public short getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(short numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public float getLastOrderAmount() {
        return lastOrderAmount;
    }

    public void setLastOrderAmount(float lastOrderAmount) {
        this.lastOrderAmount = lastOrderAmount;
    }

    public double getOrdersAmount() {
        return ordersAmount;
    }

    public void setOrdersAmount(double ordersAmount) {
        this.ordersAmount = ordersAmount;
    }

    public boolean isUserIsActive() {
        return userIsActive;
    }

    public void setUserIsActive(boolean userIsActive) {
        this.userIsActive = userIsActive;
    }
}
