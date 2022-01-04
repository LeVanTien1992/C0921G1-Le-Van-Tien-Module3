package service;

import bean.RentType;
import bean.Service;
import bean.ServiceType;

import java.util.List;

public interface ServiceService {
    List<Service> displayService();
    void createService(Service service);
    List<RentType> getAllRentType();
    List<ServiceType> getAllServiceType();
}
