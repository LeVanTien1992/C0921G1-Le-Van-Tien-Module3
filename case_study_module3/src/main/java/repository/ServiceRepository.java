package repository;

import bean.Service;

import java.util.List;

public interface ServiceRepository {
    List<Service> displayService();
    void createService(Service service);
}
