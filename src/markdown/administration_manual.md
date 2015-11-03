#Administration Manual

BFTC's Tic Tac Toe game was designed for Unix systems. The repository should contain most of the dependencies necessary to successfully run the program.

##Required software
* Ubuntu/Debian GNU/Linux opreating system
* Git 2.14 or later
* Java 8, other verisons will not work
* Gradle 2.8
* A web browser (Mozilla's Firefox is particularly recommended)

###Optional
* Apache Server, this project will try to deploy build information and documentation to a local apache server. Reccommended.

##Build instructions
1. Make sure to have java-jdk installed.
2. Install Git. Clone the git repository at https://github.com/BTFC/ticTacToe
3. From the root of the project directory, run the command "gradle build". This will build the project.
4. Again from the root of the project directory, run the command "sudo ./bin/deploy". This wil create a exectuable jar file and deploy it to your /tmp directory. Eventual error messages can be safely ignored
5. Ensure port 4567 is open to load the application in your browser
6. Run and enjoy!
