# Java-Swig-Tutorial
Following http://www.swig.org/tutorial.html

To create:
cd to current dir: Java-Swig-Tutorial

//creates files example_wrap.cpp, exampleJNI.java and example.java
swig -java -o example_wrap.c example.i

//creates example.o and example_wrap.o
gcc -c example.c example_wrap.c  -I/usr/lib/jvm/jdk1.7.0_71/include/ -I/usr/lib/jvm/jdk1.7.0_71/include/linux -fpic

//creates libexample.so
gcc -shared example.o example_wrap.o -o libexample.so

//compile a java test class
javac test.java

//run the java test to get factorial(5). Answer: 120
java -Djava.library.path=. test 5


//test results



