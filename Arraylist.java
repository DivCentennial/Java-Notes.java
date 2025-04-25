🔹 What is an ArrayList?
A resizable array (unlike regular arrays with fixed size).

Part of java.util package.

Maintains insertion order.

Allows duplicates.

Allows null elements.

Provides fast random access (via index).

🔹 How to Create an ArrayList
java
Copy
Edit
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
Or with an initial capacity:

java
Copy
Edit
ArrayList<Integer> numbers = new ArrayList<>(10);
🔹 Common Methods

Method	Description
add(element)	Adds to end
add(index, element)	Inserts at specific index
get(index)	Retrieves element
set(index, element)	Replaces element at index
remove(index)	Removes element at index
contains(element)	Checks if element exists
size()	Returns number of elements
isEmpty()	Checks if list is empty
clear()	Removes all elements
🔹 Example Usage
java
Copy
Edit
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Access
        System.out.println(fruits.get(1)); // Banana

        // Modify
        fruits.set(1, "Blueberry");

        // Remove
        fruits.remove("Apple");

        // Check
        System.out.println(fruits.contains("Cherry")); // true

        // Iterate
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
🔹 Time Complexity

Operation	Time Complexity
add()	O(1) amortized
get(index)	O(1)
set(index)	O(1)
remove(index)	O(n)
contains()	O(n)
add(index, el)	O(n)
⚠️ Insertion/removal at the beginning or middle requires shifting elements, which is why it's O(n).

🔹 When to Use ArrayList
You need to store elements in order.

You want fast access by index.

You don’t need to frequently insert/delete from the beginning/middle.

You’re okay with duplicates.

🔄 Alternatives

Type	Ordered	Duplicates	Best For
ArrayList	✅	✅	Fast access, dynamic arrays
LinkedList	✅	✅	Frequent insertions/removals
HashSet	❌	❌	Unique elements, fast lookup