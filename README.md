# Some Java Loom Experiments

Some Loom experiments

JDK 19, 20 include loom as a preview feature, JDK 21 includess it standard

Code still wont run in an ide, or maven so must run from the command line

''' bash
> javac --release 20 --enable-preview -Xlint:preview ClassWithPreview.java
'''

''' bash
> java --enable-preview ClassWithPreview
'''

* Programs in the `concurrency` package are Java treading examples

** Ch01 Threads and Runnables

Some interesting repositories

nipfx: <https://github.com/nipafx/loom-lab>

forax: <https://github.com/forax/loom-fiber>
