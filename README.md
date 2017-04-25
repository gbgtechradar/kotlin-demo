# Kotlin demo code

The repository contains code examples of different features in the programming language
Kotlin. The code is referenced from the talk I gave at Gothenburg Tech Radar Meetup
April 26, 2017.

The presentation can be found here https://docs.google.com/presentation/d/.....

The features that are shown here are

* Classes, Companion object
* Collections
* Data Classes
* Delegates
* Destructive Declarations
* Functions
* Lazy
* Null Safety
* Native Compilation

# Native Compilation

To run the native compilation you need to install the kotlin native compiler.
It can be downloaded from https://github.com/JetBrains/kotlin-native/releases.

Make sure that the bin directory is added to your path.

    export PATH=$PATH:<kotlin-compiler-dir>/bin
    
Then you can run the build.sh script

    # ./build.sh
    JetFile: Collections.kt
    JetFile: Main.kt
    # ./Collections
    doubledList: [gbg, tech, radar, with, peter, and, robin, gbg, tech, radar, with, peter, and, robin]
    mutableStringList: GBG, tech, RADAR, with, PETER, and, ROBIN
    concatenated mutableStringList: [gbg, tech, radar, gbg, tech, radar]
    mutableStringList: GBG, tech, RADAR, gbg, TECH, radar
    {3=[cat, dog, gbg, and], 5=[heros, radar, peter, robin], 4=[tech, with]}
    #
