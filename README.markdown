Lab: Arrays
===========

Overview
--------

In this lab, we'll practice working with arrays. Arrays are fundamental
to computer science, especially when it comes to formulating various
*algorithms*. We've already learned a bit about arrays through the
`String` data type. In many ways, a character string reveals the secrets
of arrays:

-   each element of a string is a common type (Char)
-   we can use indexing to find any given character, e.g. `s(i)` gives
    us the character at position `i`.
-   we know that the string has a finite length, e.g. `s.length`.

So you've already learned these *concepts*. But practice is useful
creating and manipulating arrays with different kinds of data.

Goals
-----

In this lab, we're going to practice:

-   creating arrays that hold numerical data
-   populating an array with data
-   using the tools of loops and decisions to do something interesting
    with the data
-   printing the data
-   learning how to return values from functions to pass *unit tests*

Tasks
-----

-   Sign into GitHub with your user ID.

-   Use GitHub to fork your own copy of this lab. This is achieved by visiting 
    https://github.com/LoyolaChicagoBooks/introcs-scala-arrays and pressing the
    Fork button you see in the upper right corner.

```
git clone https://github.com/YourGitHubUsername/introcs-scala-arrays.git
```

-   Make modifications to `arrays/arrays.scala`. You might want to copy the
    file `arrays.scala` to a backup name just in case you need to start over
    with the lab assignment (e.g. `cp arrays.scala arrays.scala-orig).

-   Complete the body of each function using the description and/or provided
    hints.

-   Recall that you can declare an array in two ways:

```scala
val myArray1 = Array[Int](10)
val myArray2 = Array[Int](7, 7, 3, 5, 5, 5, 1, 2, 1, 2)
```

-   Scala can also *infer* the type of an array, as long as you have taken 
    care to ensure each argument has the same type.

```scala
val myArray3 = Array(7, 7, 3, 5, 5, 5, 1, 2, 1, 2)
````

Hints
-------

-   Your job is to modify each of the functions in `arrays.scala`. We recommend
    that you do these modifications one at a time.

-   Run `sbt test` to compile and test all of the functiosn in `arrays.scala`. You
    will likely see a lot of failed tests (in red text) and very few passed tests (in green).
    As you write each of the functions, more and more tests will start to pass (turn green), which
    is the point of this lab.

-   The first method has, ```def arraySize(a : Array[Int]) : Int = { ... }```scala has
    already been implemented for you. It is implemented trivially by calling ```a.length```scala.


-   You can also look at the file `arrays_tests.scala` to see how each of the tests are 
    being done. We'll go over this when running the lab, but you may find that you can learn
    a lot about how to *implement* a method by looking at the test code. Our test code
    makes use of some advanced Scala features not yet covered in class.



