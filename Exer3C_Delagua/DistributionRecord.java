public class DistributionRecord {
    private int distributionId;
    private int beneficiaryId;
    private int packageId;
    private int quantityDistributed;
    private String distributionDate;
    private int distributedByUserId; // ID of staff/admin who distributed
    private String remarks;

    // Constructor
    public DistributionRecord() {}

    // Getters and Setters
    public int getDistributionId() {
        return distributionId;
    }

    public void setDistributionId(int distributionId) {
        this.distributionId = distributionId;
    }

    public int getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(int beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public int getQuantityDistributed() {
        return quantityDistributed;
    }

    public void setQuantityDistributed(int quantityDistributed) {
        this.quantityDistributed = quantityDistributed;
    }

    public String getDistributionDate() {
        return distributionDate;
    }

    public void setDistributionDate(String distributionDate) {
        this.distributionDate = distributionDate;
    }

    public int getDistributedByUserId() {
        return distributedByUserId;
    }

    public void setDistributedByUserId(int distributedByUserId) {
        this.distributedByUserId = distributedByUserId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}