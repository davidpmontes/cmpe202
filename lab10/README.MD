### compare

My original solution was not flexible compared to the AspectJ solution.  It needed a large switch statement to decide which classes to instantiate at runtime.  This leads to less maintainable code because the original source code needs to be revisited with every new addition.  In AspectJ, the code did not need to be revisted to make changes.

