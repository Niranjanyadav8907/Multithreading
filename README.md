# Multithreading in Java 🚀

## 🔍 What is Multithreading?
- **Multithreading** is a way to run multiple parts of a program (threads) at the same time.  
- A **thread** is the smallest unit of execution in a program.  
- It helps in performing **multiple tasks simultaneously** to utilize CPU efficiently.

---

## 🛠️ Why Multithreading?
- Makes your program faster by running tasks concurrently.
- Useful for tasks like:
  - File handling
  - Background processes
  - Animation
  - Server request handling

---

## 📂 How to Create Threads?
### 1. By Extending the `Thread` Class:
- Create a class and extend the `Thread` class.
- Override the `run()` method to define the task.

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }
}


