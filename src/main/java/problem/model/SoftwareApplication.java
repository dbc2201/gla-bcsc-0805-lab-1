/*
 * Created By: Divyansh Bhardwaj
 * IDE: IntelliJ IDEA Ultimate
 * Date: 16 Jan 2024
 */

package problem.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareApplication that = (SoftwareApplication) o;
        return Double.compare(getCost(), that.getCost()) == 0
                && Objects.equals(getApplicationName(), that.getApplicationName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getApplicationName(), getCost());
    }

    @Override
    public String toString() {
        return "SoftwareApplication{" +
                "applicationName='" + applicationName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
