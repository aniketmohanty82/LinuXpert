# LinuXpert
## Goal
The goal of LinuXpert is to create a CLI of easy-to-learn commands that help new coders adjust to the UNIX environments. I want to make the CLI a comfortable place for everyone.
## Commands
### Run
A bash script that allows users to compile and run any file they want by just mentioning the filename.   
```
run helloworld.py
run helloworld.c
```
You can also redirect the files to whatever output file you want to such as:
```
run helloworld.py output.txt
```
### Codechecker
A bash script that checks your any file of code for simple code vulnerabilities using the specific linting service used for that language.
```
codechecker helloworld.py
```
You must install the linting softwares first. You can do this using *brew* or *pip*. The linting services used are:
```
pylint
cppcheck
checkstyle
```
When run, the command will give you a report on the health of your code and what you can improve
#### NOTE: Checkstyle has its own XML file where you can specify the conditions you want. I have created a sample XML file for now but I would advise you to expand it

### List
A bash script that lists all items in the current directory with much more ease and simplicity than *ls*. Also provides key details on how to use *ls* to help users
```
list
```

### Debug
A bash script that debugs any file of code for using the specific debugging service used for that language.
```
debug helloworld.java
```
You must install the debugging softwares first. You can do this using *brew* or *pip*. The debugging services used are:
```
gdb
pdb
jdb
g++
```

### Update
A bash script that updates all your software packages, ensuring they're up-to-date. Currently only functioning in macOS
```
update
```

### Start
A bash script that allows users to create a simple project structure for whatever language they want to work in using just a single command.
Creates sample test and main files
```
start helloworld.cpp
```

#### I have included a sample *Java* and *Python* file within this structure for you to play around with for now
