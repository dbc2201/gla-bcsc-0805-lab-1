# GLA University, Mathura - 2024

---

## BCSC 0805: Data Structures & Algorithms Lab

---

### Lab 1 - Sorting an array of Strings by length

---

**Program Outcomes (POs)** 

- **Engineering Knowledge**: Apply the knowledge of mathematics, science, engineering fundamentals, and an engineering
specialization to the solution of complex engineering problems.
- **Problem Analysis**: Identify, formulate, research literature, and analyze complex engineering problems reaching 
substantiated conclusions using first principles of mathematics, natural sciences, and engineering sciences.
- **Modern Tool Usage**: Create, select, and apply appropriate techniques, resources, and modern engineering and IT 
tools including prediction and modelling to complex engineering activities with an understanding of the limitations.

**Program Specific Outcomes (PSOs)**

- Solve real world problems using competency in computational logic, analytical ability, system design principles, and 
programming skills.

---

Problem Statement
---

Tarun is an aspiring software engineer, currently studying in second year of engineering.
He is a very hardworking and sincere student focusing on learning programming and building software
development skills.
He has lots of ideas for creating new software and write code names for his ideas in his notebook.  
```
Ex -  
NTA  - Note Taking Application
AMRS - Attendance Modificaition Request System
HBIAA - Hotel Booking And Invoicing Application  

```  
He has created an array of String to store all the names of his software ideas in code names
and wants to sort the names in order of their length.  

Complete the method `sortApplicationNamesByLength()` given [here](src/main/java/problem/helper/ApplicationSorter.java) 
to help him sort the names in the array.

You can run the `main()` method given [here](src/main/java/problem/Main.java)
to see an example of the names.

**Note**

- Test cases are included with the code [here](src/test/java/problem/helper/ApplicationSorterTest.java).
- _Internet is required to run the code and the tests._

---

**Sample Input**

An array of Strings

```
[GGG, TNL, JBNEB, FXWTO, VPXCTFKKDP, VTU, ICNHYGS, LCWR, SQBKIXMN, LBINCPNCI]
```

---

**Sample Output**

An array of String sorted by the length of each string

```
[GGG, TNL, VTU, LCWR, JBNEB, FXWTO, ICNHYGS, SQBKIXMN, LBINCPNCI, VPXCTFKKDP]
```

---

**Hints**

- [Arrays.sort() method](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Arrays.html#sort(java.lang.Object[]))
- [Stream.sorted() method](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/stream/Stream.html#sorted())