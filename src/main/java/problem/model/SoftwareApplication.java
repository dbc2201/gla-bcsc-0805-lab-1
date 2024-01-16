/*
 * Created By: Divyansh Bhardwaj
 * IDE: IntelliJ IDEA Ultimate
 * Date: 16 Jan 2024
 */

package problem.model;

public class SoftwareApplication {
    private String applicationName;
    private double cost;

    public SoftwareApplication() {
    }

    public SoftwareApplication(String applicationName, double cost) {
        this.applicationName = applicationName;
        this.cost = cost;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
