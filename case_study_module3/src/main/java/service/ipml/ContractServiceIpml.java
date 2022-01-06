package service.ipml;

import bean.Contract;
import repository.ContractRepository;
import repository.ipml.ContractRepositoryIpml;
import service.ContracService;

import java.util.List;

public class ContractServiceIpml implements ContracService {
    private ContractRepository contractRepository = new ContractRepositoryIpml();
    @Override
    public List<Contract> displayContract() {
        return null;
    }

    @Override
    public void addContract(Contract contract) {

    }
}
