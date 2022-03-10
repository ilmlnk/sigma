# Task 22. Files

Read and process data from three existing files and write processed data into files, which was created with Java tools.

In folder main: there are classes which were created to satisy conditions in task:
- create three files, which to write data about bottles of different size: not more than 0.5 (the first file),
in the range from 0.51 to 0.99 (the second file), not less than 1.0 (the third file);

- sort bottles according to one of three variants in created files:
    - by Volume (if equals - by Material, if equals - by Bottle (default));
    - by Bottle (if equals - by Volume, if equals - by Material);
    - by Material (if equals - by Volume, if equals - by Bottle).

- specify the sorting method in any way (Scanner, String[] args etc.)
- predict the output of the important information in Exceptional cases when working with files.
- to transorm text string into array of Strings use **split()** method from **String** class. To convert
text variables into numerical use **parseDouble()** method from **Double** class.


In addition, program was tested with unit-tests and locate in folder **tests**.
