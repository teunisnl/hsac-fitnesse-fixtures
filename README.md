# hsac-fitnesse-fixtures
[![Build Status](https://travis-ci.org/fhoeben/hsac-fitnesse-fixtures.svg?branch=master)](https://travis-ci.org/fhoeben/hsac-fitnesse-fixtures) [![Maven Central](https://img.shields.io/maven-central/v/nl.hsac/hsac-fitnesse-fixtures.svg?maxAge=86400)](https://mvnrepository.com/artifact/nl.hsac/hsac-fitnesse-fixtures)

## Prerequisite:
Java Development Kit 8u...: [Download](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and install  
Maven: [Download](http://maven.apache.org/download.cgi) and Follow [Install](http://maven.apache.org/install.html) instructions, including the Tips part
	
## Running HSAC
Run:
* Windows: `start.bat`  
* Unix: `shart.sh`

A terminal window opens, compiles and downloads all needed items.  
When it reads `Starting FitNesse on port: 9090`, HSAC can be accessed on <http://localhost:9090/>

## To create the standalone Fitnesse installation:
Run:
* Windows: `make_standalone.bat`  
* Unix: `make_standalone.sh`

A terminal window opens, compiles and downloads all needed items.  
When its closed again, a `...-standalone.zip` file will be available under target directory.

This standalone only requires Java Runtime, and can be started by a double click on the `fitnesse-standalone.jar`  
by default this standalone can be access on <http://localhost:80/>

## Documentation
More information about this project can be found on its [GitHub Wiki](https://github.com/fhoeben/hsac-fitnesse-fixtures/wiki)
