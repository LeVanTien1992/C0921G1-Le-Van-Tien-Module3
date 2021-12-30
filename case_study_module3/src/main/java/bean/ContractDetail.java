package bean;

public class ContractDetail {
    private int contractDetailId;
    private int quality;
    private Contract contract;
    private AttachService attachService;

    public ContractDetail() {
    }

    public ContractDetail(int contractDetailId, int quality, Contract contract, AttachService attachService) {
        this.contractDetailId = contractDetailId;
        this.quality = quality;
        this.contract = contract;
        this.attachService = attachService;
    }

    public int getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(int contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    @Override
    public String toString() {
        return "ContractDetail{" +
                "contractDetailId=" + contractDetailId +
                ", quality=" + quality +
                ", contract=" + contract +
                ", attachService=" + attachService +
                '}';
    }
}
