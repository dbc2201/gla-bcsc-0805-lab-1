package problem;

import problem.helper.ApplicationSorter;

public class Main {
    public static void main(String[] args) {
        ApplicationSorter applicationSorter = new ApplicationSorter(10);
        for (String applicationName : applicationSorter.getApplicationNames()) {
            System.out.println(applicationName);
        }
    }
}
