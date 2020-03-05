public class ContractedEmployee extends Employee {

  private String federalTaxId;
  private double hourlyRate, numberOfHoursWorked;

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(employeeId, name);
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    return this.federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    return this.hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    return this.numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked= numberOfHoursWorked;
  }

  public double calculatePay() {
    return getAverageMonthlySalary();
  }

  public double getAverageMonthlySalary() {
    return hourlyRate * numberOfHoursWorked;
  }
}
