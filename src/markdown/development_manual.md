#Development Manual
This document details how to get BTFC's TicTacToe

##Required software
* Git 2.14 or later
* Java 8, other verisons will not work
* Gradle 2.8

##Build instructions
1. Clone the git repository
2. From the root of the project directory, run the command "gradle build". This will build the project
3. Again from the root of the project directory, run the command "sudo ./bin/deploy". This wil create a exectuable jar file and deploy it to your /tmp directory. Any error messages can be safely ignored
4. Ensure port 4567 is open
5. Run and enjoy!
