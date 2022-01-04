package repository.ipml;

import bean.RentType;
import bean.Service;
import bean.ServiceType;
import repository.DBConnect;
import repository.ServiceRepository;
import service.ServiceService;
import service.ipml.ServiceServiceIpml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryIpml implements ServiceRepository {
    Connection connection = null;
    PreparedStatement ps =  null;
    ResultSet rs = null;

    public List<Service> getAllService(){
        List<Service> serviceList = new ArrayList<>();
        String query = "select *\n" +
                "from service s \n" +
                "left join rent_type rt on s.rent_type_id = rt.rent_type_id \n" +
                "left join service_type st on s.service_type_id = st.service_type_id; ";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                serviceList.add(new Service(rs.getInt("service_id"),
                        rs.getString("service_name"),
                        rs.getInt("service_area"),
                        rs.getDouble("service_cost"),
                        rs.getInt("service_max_people"),
                        rs.getString("standard_room"),
                        rs.getString("description_other_convenience"),
                        rs.getDouble("pool_area"),
                        rs.getInt("number_of_floors"),
                        new RentType(rs.getInt("rent_type_id"),
                                rs.getString("rent_type_name"),
                                rs.getDouble("rent_type_cost")),
                        new ServiceType(rs.getInt("service_type_id"),
                                rs.getString("service_type_name"))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return serviceList;
    }


    @Override
    public List<Service> displayService() {
        return new ArrayList<>(getAllService());
    }

    @Override
    public void createService(Service service) {
        String query = "insert into service(service_name, service_area ,service_cost, service_max_people,standard_room,description_other_convenience,pool_area,number_of_floors, rent_type_id, service_type_id)\n" +
                "values\n" +
                "(?,?,?,?,?,?,?,?,?,?);";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, service.getServiceName());
            ps.setInt(2, service.getServiceArea());
            ps.setDouble(3, service.getServiceCost());
            ps.setInt(4, service.getServiceMaxPeople());
            ps.setString(5, service.getServiceStandardRoom());
            ps.setString(6, service.getDecriptionOtherConvenience());
            ps.setDouble(7, service.getPoolArea());
            ps.setInt(8, service.getNumberOfFloor());
            ps.setInt(9, service.getRentType().getRentTypeId());
            ps.setInt(10, service.getServiceType().getServiceTypeId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<RentType> getAllRentType() {
        List<RentType> rentTypeList =new ArrayList<>();
        String query = "SELECT * FROM furama_module3.rent_type;";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                rentTypeList.add(new RentType(rs.getInt("rent_type_id"),
                        rs.getString("rent_type_name"),
                        rs.getDouble("rent_type_cost")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rentTypeList;
    }

    @Override
    public List<ServiceType> getAllServiceType() {
        List<ServiceType> serviceTypeList = new ArrayList<>();
        String query = "SELECT * FROM furama_module3.service_type;";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                serviceTypeList.add(new ServiceType(rs.getInt("service_type_id"),
                        rs.getString("service_type_name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return serviceTypeList;
    }
    public static void main(String[] args) {
        ServiceRepositoryIpml serviceRepositoryIpml = new ServiceRepositoryIpml();
        List<ServiceType> serviceTypeList = serviceRepositoryIpml.getAllServiceType();
        for (ServiceType serviceType: serviceTypeList){
            System.out.println(serviceType);
        }
    }
}
