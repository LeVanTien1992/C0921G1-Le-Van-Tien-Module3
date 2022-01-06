package service;

import bean.Contract;

import java.util.List;

public interface ContracService {
    List<Contract> displayContract();
    void addContract(Contract contract);
}
