# Incorrect use of auxiliary constructors in Scala

This example demonstrates a common error in Scala: the incorrect use of auxiliary constructors.  Auxiliary constructors are useful for providing multiple ways to instantiate a class, but they must properly call another constructor within the same class using `this(...)`.

## The Bug

The `bug.scala` file shows an example of incorrect auxiliary constructor usage, causing a compilation error.  The solution addresses this by correctly calling the primary constructor.

## The Solution

The `bugSolution.scala` file shows the corrected implementation with the proper use of the `this(...)` call within the auxiliary constructor.

## How to Reproduce

1. Save the code in `bug.scala`. 
2. Compile the code using a Scala compiler (like scalac). 
3. Observe the compilation error.
4. Compare with `bugSolution.scala` to see the correct implementation.