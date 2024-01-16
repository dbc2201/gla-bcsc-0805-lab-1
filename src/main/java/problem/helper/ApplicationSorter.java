/*
 * Created By: Divyansh Bhardwaj
 * IDE: IntelliJ IDEA Ultimate
 * Date: 16 Jan 2024
 */

package problem.helper;

import org.instancio.Instancio;
import problem.model.SoftwareApplication;

import java.util.List;

public class ApplicationSorter {

    private String[] applicationNames;

    public ApplicationSorter(int numberOfApplications) {
        this.setApplicationNames(numberOfApplications);
        this.sortApplicationNamesByLength();
    }

    public String[] getApplicationNames() {
        return applicationNames;
    }

    public void setApplicationNames(int numberOfApplications) {
        List<SoftwareApplication> softwareApplicationList = createFakeApplicationsList(numberOfApplications);
        // fetch the names of the software applications and create a new list
        List<String> list = softwareApplicationList.stream()
                .map(SoftwareApplication::getApplicationName)
                .toList();
        // initialize the array
        this.applicationNames = new String[numberOfApplications];
        // convert the list of software names to an array
        list.toArray(this.applicationNames);
    }

    private static List<SoftwareApplication> createFakeApplicationsList(int numberOfApplications) {
        // create a list of fake software application objects using the Instancio library
        return Instancio.ofList(SoftwareApplication.class).size(numberOfApplications).create();
    }

    /**
     * This method sorts the names of the applications by length.
     * There is no parameter to the method since the input is taken from the 'applicationNames' array
     * created as a field to this class.
     */
    // TODO: complete this method
    public void sortApplicationNamesByLength() {

    }
}
