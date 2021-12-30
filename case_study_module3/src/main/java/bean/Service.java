package bean;

public class Service {
    private int serviceId;
    private String serviceName;
    private int serviceArea;
    private double serviceCost;
    private int serviceMaxPeople;
    private String serviceStandardRoom;
    private String decriptionOtherConvenience;
    private double poolArea;
    private int numberOfFloor;
    private RentType rentType;
    private ServiceType serviceType;

    public Service() {
    }

    public Service(int serviceId, String serviceName, int serviceArea, double serviceCost,
                   int serviceMaxPeople, String serviceStandardRoom, String decriptionOtherConvenience,
                   double poolArea, int numberOfFloor, RentType rentType, ServiceType serviceType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.serviceStandardRoom = serviceStandardRoom;
        this.decriptionOtherConvenience = decriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
        this.rentType = rentType;
        this.serviceType = serviceType;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(int serviceArea) {
        this.serviceArea = serviceArea;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public String getServiceStandardRoom() {
        return serviceStandardRoom;
    }

    public void setServiceStandardRoom(String serviceStandardRoom) {
        this.serviceStandardRoom = serviceStandardRoom;
    }

    public String getDecriptionOtherConvenience() {
        return decriptionOtherConvenience;
    }

    public void setDecriptionOtherConvenience(String decriptionOtherConvenience) {
        this.decriptionOtherConvenience = decriptionOtherConvenience;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", serviceArea=" + serviceArea +
                ", serviceCost=" + serviceCost +
                ", serviceMaxPeople=" + serviceMaxPeople +
                ", serviceStandardRoom='" + serviceStandardRoom + '\'' +
                ", decriptionOtherConvenience='" + decriptionOtherConvenience + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloor=" + numberOfFloor +
                ", rentType=" + rentType +
                ", serviceType=" + serviceType +
                '}';
    }
}
