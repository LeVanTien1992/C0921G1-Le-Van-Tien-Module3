package repository;

import bean.Contract;

import java.util.List;

public interface ContractRepository {
    List<Contract> displayContract();
    void addContract(Contract contract);
}
