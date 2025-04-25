🔹 What is a HashSet?
HashSet is a collection that implements the Set interface and is backed by a HashMap internally.

🔧 Key Characteristics:
Stores unique elements only.

No duplicates allowed.

No guaranteed order of elements.

Allows one null element.

Fast performance for basic operations (O(1) average time complexity).

🔹 How to Create a HashSet
java
Copy
Edit
import java.util.HashSet;

HashSet<String> set = new HashSet<>();
🔹 Basic Operations
java
Copy
Edit
set.add("apple");
set.add("banana");
set.add("apple");  // Duplicate — ignored

System.out.println(set.contains("banana")); // true
set.remove("apple");                         // removes "apple"
System.out.println(set.size());              // number of elements
🔹 Iterating Through a HashSet
java
Copy
Edit
for (String fruit : set) {
    System.out.println(fruit);
}
⚠️ Note: The order is not guaranteed — might not print in the order you added.

🔹 Time Complexity (Average Case)

Operation	Time Complexity
add()	O(1)
remove()	O(1)
contains()	O(1)
iteration	O(n)
🔹 Real-World Use Case
Example: Removing duplicates from a list
java
Copy
Edit
List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Eve");
Set<String> uniqueNames = new HashSet<>(names);

System.out.println(uniqueNames); // [Alice, Bob, Eve] — order not guaranteed
🔹 When to Use HashSet
You want to eliminate duplicates.

You need fast existence checks.

You don’t care about order of elements.

🔄 Alternatives

Class	Ordered?	Sorted?	Thread-Safe?
HashSet	❌	❌	❌
LinkedHashSet	✅	❌	❌
TreeSet	✅	✅	❌
CopyOnWriteArraySet	✅	❌	✅