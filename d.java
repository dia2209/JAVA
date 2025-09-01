Here is a **simple Java example** that demonstrates three common exceptions:

1. `FileNotFoundException`
2. `IOException`
3. `NullPointerException`

Each part will include **code** and an **in-depth explanation**.

---

## ✅ 1. `FileNotFoundException` Example

### 🔸 Code:

```java
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileNotFoundExample {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt"); // File does not exist
            FileReader fr = new FileReader(file); // Trying to read it
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }
}
```

### 🔍 Explanation:

* `File file = new File("nonexistent.txt");`: This line **creates a File object** pointing to a file that doesn’t exist.
* `new FileReader(file);`: Java tries to **open** the file, but it fails because the file does not exist.
* Java throws a `FileNotFoundException`, which is **checked exception**, so it must be caught or declared in the method.

---

## ✅ 2. `IOException` Example

### 🔸 Code:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close(); // Always close to release resource
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
```

### 🔍 Explanation:

* `BufferedReader` reads text from a file efficiently.
* `readLine()` might throw an `IOException` if:

  * File access is interrupted.
  * File gets deleted during read.
  * System I/O error occurs (like disk problem).
* `IOException` is a **general checked exception** related to input/output operations.

---

## ✅ 3. `NullPointerException` Example

### 🔸 Code:

```java
public class NullPointerExample {
    public static void main(String[] args) {
        String name = null; // name is not initialized

        try {
            System.out.println("Length: " + name.length()); // This will throw NPE
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
```

### 🔍 Explanation:

* `String name = null;`: `name` doesn't point to any object.
* `name.length()`: Java tries to call a method on a **null reference**, which is illegal.
* This causes `NullPointerException`, which is an **unchecked exception** (doesn't require try-catch but can be caught).

---

## 🧠 Summary Table:

| Exception             | Type      | Cause                                           | Must be Caught?   |
| --------------------- | --------- | ----------------------------------------------- | ----------------- |
| FileNotFoundException | Checked   | File does not exist or cannot be opened         | ✅ Yes             |
| IOException           | Checked   | Input/Output errors while reading/writing files | ✅ Yes             |
| NullPointerException  | Unchecked | Calling method on a null reference              | ❌ No, but you can |

---

Would you like a combined example with all three exceptions in one program, or want me to cover more exceptions like `ArithmeticException` or `ArrayIndexOutOfBoundsException`?
Great! Let's now look at two more common Java exceptions with **simple code examples** and **in-depth explanations**:

1. `NumberFormatException`
2. `ArrayIndexOutOfBoundsException`

---

## ✅ 1. `NumberFormatException`

### 🔸 Code:

```java
public class NumberFormatExample {
    public static void main(String[] args) {
        String invalidNumber = "abc123";

        try {
            int num = Integer.parseInt(invalidNumber); // Trying to convert a non-numeric string
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}
```

### 🔍 Explanation:

* `invalidNumber = "abc123"` is a string that **cannot be converted to a number**.
* `Integer.parseInt("abc123")` tries to convert the string to an integer.
* Since it contains non-numeric characters, Java throws a **`NumberFormatException`**.
* This is an **unchecked exception** (you don’t have to handle it with a try-catch, but it’s safer if you do).

---

## ✅ 2. `ArrayIndexOutOfBoundsException`

### 🔸 Code:

```java
public class ArrayIndexExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println("Accessing index 5: " + numbers[5]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
```

### 🔍 Explanation:

* Array `numbers` has elements at index 0, 1, and 2.
* `numbers[5]` tries to access index 5, which **does not exist**.
* This causes **`ArrayIndexOutOfBoundsException`** to be thrown.
* It is an **unchecked exception**.

---

## 🧠 Summary Table (Extended):

| Exception                      | Type      | Cause                                          | Must be Caught? |
| ------------------------------ | --------- | ---------------------------------------------- | --------------- |
| FileNotFoundException          | Checked   | File does not exist                            | ✅ Yes           |
| IOException                    | Checked   | I/O failure (e.g., disk issues, stream errors) | ✅ Yes           |
| NullPointerException           | Unchecked | Calling method on a null reference             | ❌ No            |
| NumberFormatException          | Unchecked | Trying to convert invalid string to a number   | ❌ No            |
| ArrayIndexOutOfBoundsException | Unchecked | Accessing invalid index in an array            | ❌ No            |

---

Would you like a **combined example with all these exceptions** together in one Java program, or would you like to go deeper into handling exceptions using `throws`, `finally`, or custom exceptions?
