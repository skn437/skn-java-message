# SKN Java Message Library

<img width="150px" src="https://firebasestorage.googleapis.com/v0/b/skn-ultimate-project-la437.appspot.com/o/GitHub%20Library%2F03-Spring%20Boot-SJM.svg?alt=media&token=1e181edb-1e33-4e19-b3b9-acbf700c094c" alt="java" />

> Java

[![Maven Central](https://img.shields.io/maven-central/v/best.skn/skn-java-message)](https://central.sonatype.com/artifact/best.skn/skn-java-message) [![Javadoc](https://javadoc.io/badge2/best.skn/skn-java-message/1.1.2/javadoc.svg)](https://javadoc.io/doc/best.skn/skn-java-message/1.1.2) [![Apache License 2.0](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

&nbsp;

## **_JavaDocs:_**

### Read the Javadoc for the main API: [Message API](https://javadoc.io/doc/best.skn/skn-java-message/latest/best/skn/utils/message/Message.html)

&nbsp;

## **_Introduction:_**

### This is a simple Java Library for notification message on console & server response

### I made this library so that I can use it in all of my java projects without writing the same codes over and over again

### The main API Class of this library is `Message` which holds 7 static methods to output notifications

&nbsp;

## **_Details:_**

### **`Message` Class:**

- It doesn't need to be instantiated
- It has 7 static methods
- The notification modes are:
  - Info message on console
  - Success message on console
  - Success message as server response
  - Success message as server mono response (Reactive)
  - Error message on console
  - Error message as server response
  - Error message as server mono response (Reactive)

&nbsp;

## **_Use Case:_**

- Java
- Java Spring Boot

&nbsp;

## **_Requirements:_**

- 💀 Minimum Java Version: `21`
- 💀 Minimum Maven Version: `3.9.6`

&nbsp;

## **_Usage:_**

### For `Maven`, inside `dependencies` tag of `pom.xml`, copy the following

> ```xml
> <dependency>
>  <groupId>best.skn</groupId>
>  <artifactId>skn-java-message</artifactId>
>  <version>1.1.2</version>
> </dependency>
> ```

### Write the following in the terminal

> ```zsh
> mvn install
> ```

### Inside your Java Code, import the package like this

> ```java
> import best.skn.utils.message.Message;
> ```

### For instructions for `Gradle` & others: Visit [Maven Central](https://central.sonatype.com/artifact/best.skn/skn-java-message)

&nbsp;

## **_Dedicated To:_**

- 👩‍🎨`Prodipta Das Logno` & 🧛‍♀️`Atoshi Sarker Prithula`: The two most special ladies of my life.
- 💯`My Father & Mother`: The greatest treasures of my life ever.

&nbsp;

## **_License:_**

Copyright (C) 2024 SKN Shukhan

Licensed under the Apache License, Version 2.0
