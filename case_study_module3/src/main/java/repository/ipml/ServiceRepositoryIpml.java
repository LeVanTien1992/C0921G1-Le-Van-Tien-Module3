package repository.ipml;

import bean.Service;
import repository.ServiceRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryIpml implements ServiceRepository {
    Connection connection = null;
    PreparedStatement ps =  null;
    ResultSet rs = null;

    public List<Service> getAllService(){
        List<Service> serviceList = new ArrayList<>();
        String query = "";

        return serviceList;
    }
    @Override
    public List<Service> displayService() {
        return null;
    }

    @Override
    public void createService(Service service) {

    }
}
