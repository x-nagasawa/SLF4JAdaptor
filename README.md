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


### 1.7.7-6
- First jar release

### 1.7.7-6.1
- Remove hampering files from 1.7.7-6
(1.7.7-6 includes simplelog.properties and testcodes by mistake)

### 1.7.7-7 
- Added ability to output null message
