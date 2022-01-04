package service.ipml;

import bean.RentType;
import bean.Service;
import bean.ServiceType;
import repository.ipml.ServiceRepositoryIpml;
import service.ServiceService;

import java.util.List;

public class ServiceServiceIpml implements ServiceService {
    private ServiceRepositoryIpml serviceRepositoryIpml = new ServiceRepositoryIpml();
    @Override
    public List<Service> displayService() {
        return this.serviceRepositoryIpml.displayService();
    }

    @Override
    public void createService(Service service) {
        serviceRepositoryIpml.createService(service);
    }

    @Override
    public List<RentType> getAllRentType() {
        return this.serviceRepositoryIpml.getAllRentType();
    }

    @Override
    public List<ServiceType> getAllServiceType() {
        return this.serviceRepositoryIpml.getAllServiceType();
    }
}
