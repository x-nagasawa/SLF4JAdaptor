# SLF4J adaptors

My [SLF4J](http://www.slf4j.org/ "SLF4J") adaptors. Forked from kmkt repository at Dec 08 2015.

for Gradle

    repositories {
        maven { url 'http://x-nagasawa.github.io/maven-repository/' }
    }

## SLF4J adaptor for org.grlea.log.SimpleLogger 2.0.1

    dependencies {
        runtime 'com.github.x-nagasawa:slf4j-grlea-simplelogger:1.7.7-7'
    }

[Download binarys](https://github.com/x-nagasawa/SLF4JAdaptor/releases)

### Log level mapping between SLF4J and SimpleLogger

| SLF4J | SimpleLogger |
|:---:|:---:|
|TRACE|DebugLevel.L6_VERBOSE|
|DEBUG|DebugLevel.L5_DEBUG|
|INFO|DebugLevel.L4_INFO|
|WARN|DebugLevel.L3_WARN|
|ERROR|DebugLevel.L2_ERROR|

### 1.7.7-6
- First binary release

### 1.7.7-6.1
- Remove hampering files from 1.7.7-6
(1.7.7-6 includes simplelog.properties and testcodes by mistake)

### 1.7.7-7 
- Added ability to output null message
