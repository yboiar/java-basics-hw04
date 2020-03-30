public class Employee implements Payable {
  private String employeeId, name;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return calculatePay();
  }

  public double calculatePay() {
    return 0.0;
  }

  @Override
  public String toString() {
    String format = "%.2f";
    return this.name + " " + String.format(format, this.getAverageMonthlySalary());
  }

}
