package repository.ipml;

import bean.Contract;
import bean.Customer;
import bean.Employee;
import bean.Service;
import repository.ContractRepository;
import repository.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractRepositoryIpml implements ContractRepository {
    Connection connection = null;
    PreparedStatement ps =  null;
    ResultSet rs = null;

//    public List<Contract> getAllContract(){
//        List<Contract> contractList = new ArrayList<>();
//        String query = "select *\n" +
//                " from contract c join employee e\n" +
//                " on c.employee_id = e.employee_id join customer cs\n" +
//                " on c.customer_id = cs.customer_id join service s \n" +
//                " on c.service_id = s.service_id;";
//
//        try {
//            connection = new DBConnect().getConnection();
//            ps = connection.prepareStatement(query);
//            rs = ps.executeQuery();
//            while (rs.next()){
//                contractList.add(new Contract(rs.getInt("contract_id"),
//                        rs.getString("contract_start_date"),
//                        rs.getString("contract_end_date"),
//                        rs.getDouble("contract_deposit"),
//                        rs.getDouble("contract_total_money"),
//                        new Employee(rs.getInt("employee_id"),
//                                rs.getString("employee_name"),
//                                rs.getString("employee_birthday"),
//                                rs.getString("employee_id_card"),
//                                rs.getDouble("employee_salary"),
//                                rs.getString("employee_phone"),
//                                rs.getString("employee_email"),
//                                rs.getString("employee_address")),
//                        new Customer(rs.getInt("customer_id")),
//                        new Service(rs.getInt("service_id"))));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return contractList;
//    }
    @Override
    public List<Contract> displayContract() {
        return null;
    }

    @Override
    public void addContract(Contract contract) {

    }
}
