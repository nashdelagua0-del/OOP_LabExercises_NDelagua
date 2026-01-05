public class Report {
    private int reportId;
    private String reportType; // e.g., "Distribution Summary", "Beneficiary List"
    private String generatedDate;
    private String generatedByUser;
    private String periodFrom;
    private String periodTo;
    private String filePath; // Path to saved report (PDF/Excel)

    // Constructor
    public Report() {}

    // Getters and Setters
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(String generatedDate) {
        this.generatedDate = generatedDate;
    }

    public String getGeneratedByUser() {
        return generatedByUser;
    }

    public void setGeneratedByUser(String generatedByUser) {
        this.generatedByUser = generatedByUser;
    }

    public String getPeriodFrom() {
        return periodFrom;
    }

    public void setPeriodFrom(String periodFrom) {
        this.periodFrom = periodFrom;
    }

    public String getPeriodTo() {
        return periodTo;
    }

    public void setPeriodTo(String periodTo) {
        this.periodTo = periodTo;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}