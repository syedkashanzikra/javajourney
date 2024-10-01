# Java Journey 🚀

Welcome to my **Java Journey** repository! This repo is a collection of concepts, programs, and hands-on practice questions that take you from Java basics to advanced-level topics. It covers fundamental programming techniques, object-oriented principles, error handling, collections, file handling, multi-threading, and more.

## Table of Contents
1. [Introduction](#introduction)
2. [Java Basics](#java-basics)
3. [Object-Oriented Programming (OOP)](#object-oriented-programming-oop)
4. [Exception Handling](#exception-handling)
5. [Collections Framework](#collections-framework)
6. [File Handling](#file-handling)
7. [Generics](#generics)
8. [Multi-threading](#multi-threading)
9. [Practice Questions](#practice-questions)
10. [Additional Resources](#additional-resources)

---

## Introduction

This repository is designed to help you learn Java from scratch and progressively explore its more advanced topics. Whether you're a beginner or someone looking to refresh their Java knowledge, this journey will cover all aspects of Java, from syntax to threading.

---

## Java Basics

Before diving into more complex topics, it's essential to understand the building blocks of Java:

### Topics:
- **Variables** and Data Types
- **Operators** (Arithmetic, Logical, Bitwise)
- **Control Flow Statements** (if-else, loops)
- **Functions** (methods in Java)
- **Basic Input/Output** using `Scanner` and `System.out`

### Example Code:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Printing a simple message
    }
}
```

### Practice Questions:
1. Write a program to check if a number is even or odd.
2. Create a calculator that performs basic arithmetic operations.

---

## Object-Oriented Programming (OOP)

Java is known for its object-oriented approach. Here, we’ll cover the four pillars of OOP:

### Topics:
- **Classes and Objects**
- **Inheritance**
- **Polymorphism** (Method Overloading and Overriding)
- **Abstraction** (Abstract Classes and Interfaces)
- **Encapsulation**

### Example Code:
```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
```

### Practice Questions:
1. Create a class `Person` with attributes `name`, `age`, and methods to display them.
2. Implement method overriding using a `Vehicle` and `Car` class.

---

## Exception Handling

Java provides a robust mechanism to handle runtime errors through exceptions.

### Topics:
- **Try, Catch, Finally** block
- **Throw and Throws**
- **Custom Exceptions**

### Example Code:
```java
try {
    int division = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("This is the finally block");
}
```

### Practice Questions:
1. Write a program to handle a `NullPointerException`.
2. Create a custom exception when a user tries to withdraw more money than available in their bank account.

---

## Collections Framework

Collections are used to store groups of objects in Java. This section covers various data structures available in the Java Collections Framework.

### Topics:
- **Lists** (`ArrayList`, `LinkedList`)
- **Sets** (`HashSet`, `TreeSet`)
- **Maps** (`HashMap`, `TreeMap`)
- **Queues** (`PriorityQueue`, `Deque`)

### Example Code:
```java
Map<String, Integer> scores = new HashMap<>();
scores.put("Alice", 90);
scores.put("Bob", 85);
scores.put("Charlie", 95);

for (Map.Entry<String, Integer> entry : scores.entrySet()) {
    System.out.println(entry.getKey() + " scored " + entry.getValue());
}
```

### Practice Questions:
1. Write a program to sort a `List` of integers.
2. Implement a phonebook using `HashMap` where names are keys and phone numbers are values.

---

## File Handling

Handling files is an essential part of programming, and Java provides `java.io` and `java.nio` packages for file operations.

### Topics:
- **Reading and Writing Files**
- **BufferedReader and BufferedWriter**
- **FileInputStream and FileOutputStream**
- **Serialization and Deserialization**

### Example Code:
```java
import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("This is an example.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Practice Questions:
1. Write a program to read from a text file and display its contents.
2. Create a program that writes user input to a file.

---

## Generics

Generics allow you to create classes, interfaces, and methods that can operate on any data type.

### Topics:
- **Generic Classes**
- **Generic Methods**
- **Bounded Types**

### Example Code:
```java
public class GenericExample<T> {
    private T value;

    public GenericExample(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
```

### Practice Questions:
1. Create a generic class `Box` that can hold any type of object.
2. Implement a generic method that swaps two elements in an array.

---

## Multi-threading

Multi-threading is a powerful feature that allows you to execute multiple threads concurrently.

### Topics:
- **Thread Class** and **Runnable Interface**
- **Thread Synchronization**
- **Inter-thread Communication**

### Example Code:
```java
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
```

### Practice Questions:
1. Write a program that creates two threads: one to print even numbers and one to print odd numbers.
2. Implement a thread-safe counter using synchronization.

---

## Practice Questions

1. Implement a basic bank account management system.
2. Write a program to perform CRUD operations on a list of employees.
3. Develop a simple chat application using threads.

---

## Additional Resources

- [Java Documentation](https://docs.oracle.com/javase/8/docs/)
- [Java SE Tutorial](https://docs.oracle.com/javase/tutorial/)
- [Effective Java by Joshua Bloch](https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997)

---

Feel free to explore each concept in the repository and try out the practice questions for a deeper understanding. Happy coding!
