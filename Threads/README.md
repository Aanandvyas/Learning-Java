# Threads Package

## Package Structure
This is a Java package named `Threads` containing threading exercises and examples.

## How to Compile and Run

### IMPORTANT: Always work from the parent directory!

Since this is a **packaged** Java program (`package Threads;`), you must compile and run from the `W:\Java` directory, NOT from inside the `Threads` folder.

### Step-by-Step Instructions:

1. **Navigate to the parent directory:**
   ```powershell
   cd W:\Java
   ```

2. **Compile the Java files:**
   ```powershell
   javac Threads\Exercise.java
   # OR compile all files in the package:
   javac Threads\*.java
   ```

3. **Run the program:**
   ```powershell
   java Threads.Exercise
   ```

## ❌ Common Mistakes to Avoid

### DON'T DO THIS:
```powershell
# ❌ Wrong - compiling from inside the package folder
cd W:\Java\Threads
javac Exercise.java
java Exercise

# ❌ Wrong - using incorrect class name
java main
java exercise
```

### ✅ DO THIS INSTEAD:
```powershell
# ✅ Correct - compile and run from parent directory
cd W:\Java
javac Threads\Exercise.java
java Threads.Exercise
```

## 📚 Why This Matters

- **Package Declaration**: The file starts with `package Threads;`
- **Java Expectations**: Java expects packages to be in folders with matching names
- **Classpath**: Java looks for packages relative to the current directory
- **Full Qualified Names**: When running, use `PackageName.ClassName` format

## 🧵 What This Exercise Demonstrates

The `Exercise.java` file demonstrates:
- Creating a class that implements `Runnable`
- Creating multiple threads from the same task
- Starting threads concurrently
- Using `join()` to wait for thread completion
- Thread-safe execution with proper synchronization

## 🎯 Quick Reference

| Action | Command |
|--------|---------|
| Navigate | `cd W:\Java` |
| Compile | `javac Threads\Exercise.java` |
| Run | `java Threads.Exercise` |

---
**Remember**: Always think "parent directory + package.class" when working with Java packages! 🎯