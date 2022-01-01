package service;

import bean.Service;

import java.util.List;

public interface ServiceService {
    List<Service> displayService();
    void createService(Service service);
}
