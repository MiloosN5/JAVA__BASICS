# JAVA__BASICS

Demonstration of various examples related to different topics/areas in Java.

## Lessons

Select a lesson from the list and leave only that one uncommented in ```src/main/java/Main.java```:
   1. Class (*ClassExample*)
   2. Inheritance (*InheritanceExample*)
   3. Interface (*ClassImpInterfaceExample*)
   4. Primitive data types (*DataTypesPrimitive*)
   5. Reference data types (*DataTypesReference*)

## Working locally

Run this project locally in NetBeans (recommended) or using Command Line.

### 1. Clone the repository

  ```bash
  git clone https://github.com/MiloosN5/JAVA__BASICS.git
  cd JAVA__BASICS
  ```

### 2. Install Java (JDK)

  Make sure Java Development Kit (JDK) is installed:
  ```bash
  java -version
  ```
  - ℹ️ Note: Here is used JDK 24

  If it's not installed, download it from: [URL](https://www.oracle.com/java/technologies/downloads/)

### 3. Open the project

- Use an IDE like Apache NetBeans (recommended): [URL](https://netbeans.apache.org/front/main/download/)
- Open Apache NetBeans.
- Click File > Open Project.
- Select the folder with the pom.xml file.
- NetBeans will automatically detect it as a Maven project.
- Click Build or Run — Maven will handle everything for you.
  
### 4. Or run using Command Line (Windows example)

- Compile the project
```
mvn compile
```
This will compile everything to target/classes.

- Run the project
```
mvn exec:java -Dexec.mainClass="Main"
```

