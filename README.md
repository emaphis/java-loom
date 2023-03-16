# Some Java Loom Experiments

Some Loom experiments

JDK 19, 20 include loom as a preview feature, JDK 21 may include it standard

Code still wont run in an ide, or maven so must run from the command line

'''
> javac --release 20 --enable-preview -Xlint:preview ClassWithPreview.java
'''

'''
> java --enable-preview ClassWithPreview
'''

Some interesting repositories

nipfx: <https://github.com/nipafx/loom-lab>

forax: <https://github.com/forax/loom-fiber>
