package problem.helper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Comparator;

class ApplicationSorterTest {

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 50, 100})
    void sortApplicationNamesByLength(int numberOfApplications) {
        // arrange
        ApplicationSorter applicationSorter = new ApplicationSorter(numberOfApplications);
        String[] applicationNames = applicationSorter.getApplicationNames();
        String[] expectedSortedNames = Arrays.stream(applicationNames)
                .sorted(Comparator.comparingInt(String::length))
                .toArray(String[]::new);
        // act
        String[] actualSortedNames = applicationSorter.sortApplicationNamesByLength(applicationNames);
        // assert
        Assertions.assertArrayEquals(expectedSortedNames, actualSortedNames,
                "Names are not sorted according to length");
    }
}