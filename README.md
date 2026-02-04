# BMI Calculator Application

A comprehensive Java-based Body Mass Index (BMI) calculator application with an interactive command-line interface. This application allows users to calculate BMI values, store person information, and receive health advice based on BMI categories.

## Features

- Quick BMI calculation for immediate results
- Person management system to store and track multiple individuals
- BMI categorization (Underweight, Normal weight, Overweight, Obese)
- Personalized health advice based on BMI results
- Input validation and error handling
- Interactive menu-driven interface

## Prerequisites

Before setting up the BMI Calculator application, ensure you have the following installed on your system:

### Java Development Kit (JDK)

- **Version**: JDK 8 or higher (JDK 11+ recommended)
- **Download**: [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)

To verify your Java installation:
```bash
java -version
javac -version
```

Both commands should return version information. If not installed, follow the installation guide for your operating system below.

## Installation Guide

### Windows

1. **Install JDK**:
   - Download JDK from Oracle or OpenJDK website
   - Run the installer and follow the setup wizard
   - Add Java to your system PATH:
     - Open System Properties > Advanced > Environment Variables
     - Add `JAVA_HOME` variable pointing to JDK installation directory
     - Add `%JAVA_HOME%\bin` to your PATH variable

2. **Verify Installation**:
   ```cmd
   java -version
   javac -version
   ```

### macOS

1. **Install JDK** (using Homebrew - recommended):
   ```bash
   brew install openjdk@11
   ```

2. **Alternative - Manual Installation**:
   - Download JDK from Oracle or OpenJDK
   - Install the .dmg package
   - Set JAVA_HOME in your shell profile (.zshrc or .bash_profile):
   ```bash
   export JAVA_HOME=$(/usr/libexec/java_home)
   ```

3. **Verify Installation**:
   ```bash
   java -version
   javac -version
   ```

### Linux (Ubuntu/Debian)

1. **Install OpenJDK**:
   ```bash
   sudo apt update
   sudo apt install openjdk-11-jdk
   ```

2. **Set JAVA_HOME** (add to ~/.bashrc or ~/.profile):
   ```bash
   export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
   export PATH=$PATH:$JAVA_HOME/bin
   ```

3. **Reload your profile**:
   ```bash
   source ~/.bashrc
   ```

4. **Verify Installation**:
   ```bash
   java -version
   javac -version
   ```

### Linux (CentOS/RHEL/Fedora)

1. **Install OpenJDK**:
   ```bash
   # CentOS/RHEL
   sudo yum install java-11-openjdk-devel
   
   # Fedora
   sudo dnf install java-11-openjdk-devel
   ```

2. **Set JAVA_HOME** and verify as shown in Ubuntu section above.

## Project Setup

### 1. Download the Application Files

Create a new directory for the project and save the following files:
- `Person.java`
- `BMI.java`
- `BMICalculatorApp.java`

### 2. Directory Structure

```
bmi-calculator/
├── Person.java
├── BMI.java
├── BMICalculatorApp.java
└── README.md
```

### 3. Compile the Application

Navigate to the project directory and compile all Java files:

```bash
cd bmi-calculator
javac *.java
```

This will generate `.class` files for each Java source file.

### 4. Run the Application

Execute the main application:

```bash
java BMICalculatorApp
```

## Usage Instructions

Once the application starts, you'll see a menu with the following options:

1. **Calculate BMI (Quick)**: Enter weight and height for immediate BMI calculation
2. **Add Person and Calculate BMI**: Store person details and calculate their BMI
3. **View All People and Their BMIs**: Display all stored individuals and their BMI information
4. **View BMI Information**: Show BMI categories and general information
5. **Exit**: Close the application

### Input Guidelines

- **Weight**: Enter in kilograms (kg)
- **Height**: Enter in meters (m). For example, 5'8" ≈ 1.73m
- **Age**: Enter as a whole number
- **Name**: Any valid string

### BMI Categories

- **Underweight**: BMI < 18.5
- **Normal weight**: BMI 18.5-24.9
- **Overweight**: BMI 25.0-29.9
- **Obese**: BMI ≥ 30.0

## License

This project is for educational purposes. Feel free to use and modify as needed.