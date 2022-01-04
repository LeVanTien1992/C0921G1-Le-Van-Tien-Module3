package repository;

import bean.RentType;
import bean.Service;
import bean.ServiceType;

import java.util.List;

public interface ServiceRepository {
    List<Service> displayService();
    void createService(Service service);
    List<RentType> getAllRentType();
    List<ServiceType> getAllServiceType();
}
