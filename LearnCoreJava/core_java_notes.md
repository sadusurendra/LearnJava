#git
> create empty repository in git -> LearJava
> create empty folder in local system -> C:\Learn_Java
> cd that folder -> C:\Learn_Java
C:\Learn_Java> git init
C:\Learn_Java> git add .
C:\Learn_Java> git status -> just to check the files we are commiting
C:\Learn_Java> git commit -m "Day 4"
C:\Learn_Java> git remote add origin https://github.com/sadusurendra/LearnJava.git
C:\Learn_Java> git push -u origin master

For Second Time 
----------------
C:\Learn_Java> git add .
C:\Learn_Java> git status -> jsut to check the files we are commiting
C:\Learn_Java> git commit -m "Day 1"
C:\Learn_Java> git push -u origin master

#JDK, JRE, JVM
			JDK
Compiler			JRE
				JVM		API
				JIT
				
`JDK`: JDK stands for Java Development Kit. It is a software that comes with a Java compiler and a JRE.
`JRE`: JRE stands for Java Runtime Environment. The JRE inturn has a JVM and it comes with a set of API or libraries(jars) that are ready to use. The JVM uses `Just In Time` compiler to do its work efficiently.

The Java compiler that comes with the JDK converts the source code we write into byte code.

If you have worked with C or C++ you know that a compiler converts the source code into the machine understandable code or machine code that can be directly understood with the underlying operating system. In case of Windows its a exe and in case of Mac it's a dmg.

But in case of Java,the compiler converts the source code into an intermediate code called byte code.
JRE which stands for Java Runtime Environment provides that environment for a Java compiled code or byte code to run on operating system(OS).

This byte code can be interpreted by the windows JVM on Windows to the underlying operating system and we can have a Linux JVM which can interpret it for Linux. 
So that is why we call Java as `platform independent`

#OOPS

`OOP`: `object-oriented programming` is about creating objects that contain both data and methods.
It is easy to maintain and we can write reusable the code.
It helps to achieve `Encapsulation, Inheritance, Abstraction, Polymorphism`

`Encapsulation` is about protecting the properties and the functionality of an object from other objects.
`Inheritance` is the process of defining a new object with the help of an existing object. In Java
we use the keyword extends to inherit.
`Abstraction` is the principle of hiding all the unnecessary details of an object and showing only the essential features that the other objects need in order to communicate with that object.
`Polymorphism` Poly means multi or multiple and morphic means shapes or behavior. polymorphism in java by method overloading and method overriding


There are `four building blocks` that make any Java application or program. They are class, variables, methods and blocks.
In any Object oriented programming language, every `object is represented by a class`.
All the code that we put, whether there are variables, methods or blocks will go inside this class
In an application, every class should have an unique identity or name. These variables and methods can be static and non-static.
`Variables` are identities that we give to a memory location or locations, where our data is stored.


#Difference between static and non-static methods?

Static methods are belongs to class. they can be called without creating object. Non-static methods belongs to Object. 
static methods are loaded into memory in compile time only once. Memory will be allocated to non-static methods at time time of creating object. each object has different memory.
Static methods can not be overriden.

static  methods cannot access non-static methods directly. We need to create object to access non-static methods in static. `A1_Static`

Static blocks will execute before main methods. Below is the static block.
static {
		System.out.println("Static blocks will execute before main methods. 1");
	} 
Static block and static method are different.

To access non-static methods, constructor, variables, blocks we need to create a object. 
Non-static block will execute before the constructor `A1_NonStatic`.

static block executes only once. But non-static executes every time object created.


#Default constructor
By default every class have default constructor with class name.
we can override the constructor and overload the constructor
Constructor doen't have return type.


#Implicit and Explicit
Implicit: lower->Higher byte->int child->parent
Explicit: Higher->lower int->byte parent->child
`A2_Implicit_Explicit`

#Variable Declaration 
> Case sensitive (Mouse, mouse both are different)
> we can use $,_
> we cannot use keyword for identifier names ex: int, String, public
`A2_Identifiers`

#Wrapper classes
> Wrapper classes helps us to convert Primitive type to Object type.
> The collection classes work with object type not primitive type
> Primitive -> Object is Boxing
> Object -> Primitive is Unboxing
> Benefit of wrapper classes is we have lot functions 
`A2_wrapper`

# ++ , --

int x=10;
int y= ++x;
sout(x,y) // 11,11

int x=10;
int y= x++;
sout(x,y) // 11,10

#Concatenation

int a=10,b=20, c=30;
String s = "xyz";
s(a+b+s+c) // 30xyz30
s(a+s+b+c) // 10xyz2030

#Bitwise operators ()
~ - This operator applicable to only int. flip the bits Ex: 10001 -> 01110
! - flip boolean value 

#Difference between & and &&
& evaluates all the conditions
&& evaluates till true condition


`Unary Operators` ++, --, !
`Arithmetic Operators`	+, -, *, /, % 
`Concatenation Operator` +
`Relational Operators` ==, !=, >, <, >=, <=
`Bit wise Operators` &, |, ^
`Short circuit Operators` &&, ||
`Assignment Operators`	=, +=, -=, *=, /=, %=, &=, ^=, <<=, >>=, >>>=
`Ternary Operator` ?:


#Flow Control Statements

`Selection statements` if-else, switch
`Iterative statements` while, do-while, for, for-each
`Transfer statements` break, continue, return, try-catch-finally, assert

`switch:` we can use constants in the place of value `A3_SwitchStatement`
`for loop:`
int i=1;
for(sout("Hello");i<=3;i++)
	sout(i)
//Output
XYZ
1
2
3

#Access Modifiers
public, private, protected. If we don't provide it's default <package> 
`public` -> project level
`private` -> within class
`default` -> package level
`protected` -> package level + other package classes who is inheriting the class 

#Static Imports
`StaticImports`

import static java.lang.System.out;
import static java.lang.Integer.*;

out.println("static import"); --> `we have used out directly without using System as we used static import`

Scanner sc = new Scanner(System.in);
int num1 = parseInt(sc.next());

#Inheritance
> Single Inheritance, Multi-Level Inheritance, Hierarchical inheritance, Hybrid inheritance

> Java doen't support `Multiple inheritance`. that means a class cannot extend multiple classes.


Constructors are invoked from top to bottom order means parent to child

`Single Inheritance` -> Parent -> Child
`Multi-Level Inheritance` -> Parent -> Child -> Sub-child
`Hierarchical Inheritance` -> Parent -> Child1,Child2
`Hybrid Inheritance` -> If we more than one inheritance then we call Hybrid Inheritance
			 -> Car -> Audi, BMW			 
-> Vehicle 
			-> Bus -> Volvo, Benz

#Super keyword
`super.sum()` super refers the parent class

If parent has constructor childs default constructor won't work. we need to explicitly define constructor

class A {
	int a,b;
	A(int a,int b) {
		this.a=a;
		this.b=b;
	}
} 

class B extends A {
	int c,d;
	B(in a,int b,int c,int d) {
		super(a,b); // super must in the first line in constructor
		this.a=a;
		this.b=b;
	}
} 

#Constructor chaining

corejava.a5.inheritance;

`super, this` must be the first line in constructor.

#Abstraction
Abstraction is a process of hiding the internal details of an object or class
We can implement partial abstraction by using `abstract classes` and full abstraction by using `interfaces`

Difference between Abstract Class and Interface in Java
S.No.`~`Abstract Class`~`Interface
1. An abstract class can contain both abstract and non-abstract methods.`~`Interface contains only abstract methods.
2. An abstract class can have all four; static, non-static and final, non-final variables.`~`Only final(constant) and static variables are used and should be initialized.
3. To declare abstract class abstract keywords are used.`~`The interface can be declared with the interface keyword.
4. The keyword ‘extend’ is used to extend an abstract class`~`The keyword implement is used to implement the interface.
5. It has class members(variables & methods) like private and protected, etc.`~`It has class members(variables & methods) public by default.
6. can declare constructor in abstract class `~` Cannot declare constructor in interface.
7. can define Blocks {} `~` cannot declare blocks

> final and abstract cannot be used at a time
	public final abstract class BMW -> it will thorw error can be used either abstract or final
> We cannot mark abstract method as static
	static abstract void accelerate() -> because we must implement abstract methods in child class
> We must override the abstract methods
> We cannot create object for Abstract classes
`BMW`

#interface
> if we use create object with interface we cannot access class specific methods using that interface object
`CarTest`
> Object down casting happens explicitly
> A class can implement multiple interfaces. If a variable same in both interface we need to use interface name before the variable. if price is same in both interface car1 and car2 we need to use price in class like car1.price
> run time polymorphism works with interfaces

#final
If we mark final for class, we cannot inherit that class.
If we mark final for variables, we cannot change value. If we don't initialize value while creating variable then we can assign value in constructor.
If we mark final for method, we cannot override.

#Marker interfaces
> Serializable, Clonable, RandomAccess



#Polymorphism
Poly means multi and morphic means shapes.
if an object of a class can behave differently while communicating with different objects, then that is polymorphism. 
There are two types of polymorphism in Java,Compile time polymorphism or Static binding, Runtime polymorphism or Dynamic binding.

Complie time polymorphism -> method overloading
Run time polymorphism -> method overriding
> run time polymorphism works with interfaces
> we can access static methods also with Child class

> Automatic promotion of overloading happens in Java. When there is no specific datatype it promotes to next version of datatype.
`AutoPromotion`

# Polymorphism with Method and Variable overloading
`AutoPromotion`

> Methods resolution happens at run time
> Variables resolution happens at compile time
		
		Parent p = new Parent();
		System.out.println(p.s); // Parent

		Child c = new Child();
		System.out.println(c.s); // Child

		Parent pc = new Child();
		System.out.println(pc.s); // Parent
		pc.methodoverload() // Child methodoverload
		  // If it's method it will invoke child method. But variable is invoked from 				Parent itself
		  
#Encapsulation

Encapsulation helps to protect data and control access to it.
It protects sensitive data from being access directly.
It hides unnecessary data from the user of a class, and only shows the functionality of a class.
Changes can be made internally without affecting the external interface.
It is easier to scale applications because it provides flexibility to add or modify features without impacting the entire codebase.
Encapsulated classes can be reused across projects.



> simply means binding object state(fields) and behavior(methods) together. If you are creating class, you are doing encapsulation.
> encapsulation is the process of binding the data and code together or properties and methods together so that only those methods can access those properties

Encapsulation helps to secure the data by making variables as private and provide them access with getters and setters.

he data and

code together or properties and methods together so that only those methods can access those properties

#Exception

Hierarchy:
					Throwable
	Error 						Exception
		StackOverflowError			IOException
		OutofMemoryError			SQLException
		VirtualMachineError			FileNotFoundException
		NoClassDefinitionError		ClassNotFoundException
		NoSuchMethodError			RuntimeExcpetion
										ArthimeticEcxception
										NullPointerException
										ArrayIndexOutofBound
										IllegalArgumentException


> the exceptions which directly inherit Exception are checked exceptions. Means we must handle exception, otherwise the IDE show error. means the class won't compile.
> the exceptions which inherit RunTimeException are unchecked exceptions. We will know this exceptions while executing the program.

>A `StackOverflowError` in Java is an error, not an exception, and it occurs when a thread’s call stack exceeds its limit, typically due to deep or infinite recursion. It falls under the Error class, which is a subclass of Throwable, parallel to Exception, and it is part of the java.lang package. Since it’s an error and not a checked or unchecked exception, it is generally not meant to be caught or handled in application code, as it indicates a serious problem with the program’s flow or recursion logic.





> throw  keyword is used to declare exception
> throws keyword is used to throw the exception

> Popular exceptions
`ArrayIndexOutofBoundDemo, NullPointerDemo, StackOverFlowDemo`
`ClassCastDemo, StaticBlockInitialization(ExceptionInInitializerError), IllegalArgumentDemo `


> Quiz
A checked exception should be handle with a try-catch or declared using -> throws clause


#Multi-Threading
> We can implement multi-threading in two ways
	-Extend Thread class
	-Implement Runnable interface

####Thread  `corejava.a9.thread`
> For Thread staring point is run(), but we have to invoke .start()
> Thread.sleep(1000) -> Takes input in milliseconds, We must handle the exception. Checked Exception.
> .join() is to ensure a thread's completion before another thread proceeds
> .setName("") is used to set the Name for thread
> .setPriority(1) is used to set the priority. We can use only 1 to 10 in priority. We can use MIN_PRIORITY for low, MAX_PRIORITY for high. Even though we mention the priority still there is no guarantee that they will execute in order. It's upto the JVM implementation. 
--5 is the default priority of a Thread
> .yield() method of thread class causes the currently executing thread object to temporarily pause and allow other threads to execute. `YieldDemo`
> .interrupt(), .isinterrupted() `https://www.tpointtech.com/interrupting-a-thread` `InterruptDemo`
  - If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked), calling the interrupt() method on the thread, breaks out the sleeping or waiting state throwing InterruptedException. If the thread is not in the sleeping or waiting state, calling the interrupt() method performs normal behaviour and doesn't interrupt the thread but sets the interrupt flag to true. 
  - After breaking sleep it will continue to run code available after catch block.
  - If we don't have sleep or wait method the code executes normally. in background it sets interrupt flag to true.
> .wait(), .notify(), .notifyAll()  `corejava.a9.thread.InterThreadCommunication`
> We can group the threads `ThreadGroupDemo`
> .activeCount() -> To get the active running threads
> .list() -> To list running threads
> .setDaemon() -> Daemon thread in Java is a service provider thread that provides services to the user thread. Its life depend on the mercy of user threads i.e. when all the user threads dies, JVM terminates this thread automatically. There are many java daemon threads running automatically e.g. gc, finalizer etc.
> `DeadLockDemo` Dead lock - A deadlock in Java occurs when two or more threads are blocked indefinitely, each waiting for a resource held by another thread, creating a circular waiting pattern

####Runnable `RunnableThreadExample`
> we have create object of class and pass it to Thread and use .start() to start the thread. we cannot directly use .start() on the object.
> We can reuse the same object for multiple thread

####Difference between Thread and Runnable
>When we extend Thread class, we can’t extend any other class even we require and When we implement Runnable, we can save a space for our class to extend any other class in future or now.
>When we extend Thread class, each of our thread creates unique object and associate with it. When we implements Runnable, it shares the same object to multiple threads.



#Synchronization
###Method level lock
> When multiple threads are accessing the same object simultaneously, then they may corrupt each other's data.
 We use the synchronized keyword and mark a method as synchronized.
 The very first thread that access this method will have a lock on that object. Other objects has to wait for this thread to complete the execution. Till the they will be in Wait state.
 
 Class X {
 	synchronized m1();
 	synchronized m2();
				 m3();
 }
 
 Thread-1 accessed m1();
 Thread-2 trying to access m1() and finds lock on m1() by Thread-1, so Thread-2 goes to wait state.
 Thread-3 trying to access m2() and finds lock on m1() by Thread-1, so Thread-2 also goes to Wait state.
 > Even though Thread-3 tried to access m2(); it goes for Wait state
 Thread-4 trying to access m3(), it will immediately access as it does not have synchronized.
`SynchronizedThreadDemo` 

###Class level lock
> Class X {
 	synchronized static m1();
 	synchronized static m2();
				 static m3();
		   synchronized m4();
		   				m5()
 }
 Thread-1 accessed m1();
 Thread-2 trying to access m1() and finds lock on m1() by Thread-1, so Thread-2 goes to wait state.
 Thread-3 trying to access m2() and finds lock on m1() by Thread-1, so Thread-2 also goes to Wait state.
 > Even though Thread-3 tried to access m2(); it goes for Wait state
 Thread-4 trying to access m3(), it will immediately access as it does not have lock on class level.
 Thread-5 trying to access m4(), it will immediately access as it does not have lock on class level.
 Thread-6 trying to access m5(), it will immediately access as it does not have lock on class level.
> It means class level lock happens on static methods

###Synchronized block
	m1() {
		-- some code  // this code can be executed by all threads
		synchronized(this){ // Here first thread gets lock and other threads go to Wait state
		
		}
		--some code // This code can be executed after synchronized(this) block completed
	}
	
> we have different ways to use synchronized block
	synchronized(this){ // It gets lock for entire object
		
	}
	synchronized(x){ // It gets lock for specific object
		
	}
	synchronized(Demo.class){ // It gets lock for entire class. means we cannot access synchronized static methods till this block completes the execution
		
	}
	synchronized(new Demo()){ // We can pass object also. works same as Demo.class
		
	}
	
#ThreadPool
`ExecutorDemo`

#Callable
> Callable is similar to Runnable, but here we can return value from thread and in the form of Future Object.
> we can use future.get() to get the original return value.
> when we invoke future.get() it throws InterruptedException | ExecutionException | CancellationException
> Callable uses call() method instead of run()
> Callable<V> we can specify the type value to return

public class MyCallable implements Callable<Integer>{

public Integer call() throws Exception {

`CallableFutureDemo`

#calculate time
int start = System.curretnTimeMillis();
<Code goes here>
int end = System.curretnTimeMillis();
 sout( (start-end)/1000 +" in seconds")
 
#Garbage Collection
> The process by which the Java Virtual Machine automatically clears the memory allocated to a particular object is called garbage collection.
> The garbage collector is a demon thread that runs within the JVM in the background and garbage collects the objects when they are unreachable.
>Finalize method on the object is called by the JVM just before garbage collection
`GCDemo`
>System.gc() -> used to request for Garbage Collection. We cannot depend on this because it may/may not work `InvokeGCDemo`

#Inner Classes
> Static Inner Classes `Outer`
> Non-Static Inner Classes `Outer`
> Local Inner Classes `LocalInnerDemo`
> Anonymous Inner Classes Ex: Connection con = DriverManager.getConnection() `TestConnection`
	Anonymous Runnable Thread `AnonymousRunnable`

#String
> String is Immutable
	String s = "Hello";  	Image it stored in Location 123
	s = "world";		When we assign new value it will not replace the existing instead it will create in new location for example 456 and s will point to that 456 location.
> Advantages of Immutability
	- Performance
	- Thread Safety - If one string changes the value, it will not effect other strings.
> String s1="Hello";
	String s2="Hello"; Both points to same memory location.
JVM puts all the Strings in a special area called String pool. Because of this performance is improved. 

> s.hashcode() - Return an int value, representing the hash code of the string
	- helps to prove JVM is using string pool to store Strings
	String s1="Hello";
	String s2="Hello";  
	s1.hashCode() //96354
	s2.hashCode() //96354
	- That means both Strings are pointing to same location
	
	String s1=new String("Hello");
	String s2=new String("Hello")
	s1.hashCode() //96354
	s2.hashCode() //85462
	- If we use new String it will create objects in different memory locations
> == checks memory locations, .equals compares content

#StringBuffer
> StrinBuffer has default capacity is 16 bytes
> We can specify the required capacity while initialization. We can specify from 0 to required space
	StringBuffer sb = new StringBuffer(0);	
`StringBufferDemo`

#StringBuilder 
> StringBuilder is same as String buffer

#Difference between String, StringBuffer, StringBuilder
> String is Immutable, StringBuffer and StringBuilder are mutable
> String and StringBuilder are Thread Safe, StringBuffer is not Thread Safe
> String and StringBuffer are Synchronized and StringBuilder is not Synchronized

`ImmutableClassDemo`

#IO Streams
`corejava.aa12.iostreams`
ByteStreams: Read one byte at a time
	- InputStream
	- OutputStream
	- FileInputStream
	- FileOutputStream
CharacterStreams: Read one character at a time
	- Reader
	- Writer
	- FileReader
	- FileWriter
BufferedStreams: Reads one line at a time
	- BuffereredReader
	- BufferedWriter
ObjectStreams: To Serialize and De-serialize data
	- ObjectInputStream
	- ObjectOutputStream

> `File` is used to load the file
> IO streams throws `FileNotFoundException, IOException`

#Object methods
> toString
	- by default if we print Object we get output like corejava.aa14.objectClassMethods.Passenger@24d46ca6
	- By If we override toString in Entity class we can print the output in the format we like
> hashCode
	- 1406718218
	- 138 --> return this.ticketId + this.name.length() + this.age;
> equals
	- p.equals(p2) -> false
	- If we implement equals method in Entity. We can compare two objects values. So that it return true.
	- The default implementation of equals method in the Object class compares the object references
	- If the hashcode value of two objects is same then the equals may or may not be true


#Collections
java.util.Collection -> all are implements top level interface
	-List
		-ArrayList -->Read is Fast, Insert and Delete is slow. Continuous Memory allocation
		-LinkedList -->Random memory Allocation. Insert and Delete are fast. Read is slow. Implements Queue also
		-Vector -> legacy
	-Set
		-HashSet -->HashSet Doesn't maintain order
			-LinkedHashSet -->LinkedHashSet maintains the order in which the elements are added.
		-SortedSet
			-NavigableSet
				-TreeSet --> Sort the data in Set
	-Queue
		-LinkedList -> First-in-First-out
		-PriorityQueue -> We can implement Comparator and change order
		-BlockingQueue ->extends which falls under concurrent collections

java.util.Map -> Map doesn't implement Collections. It's an interface of it's own.	
-Map
	- implements by
		-HashMap
			-LinkedHashMap  ->extends
		-IdentityHashMap
		-WeakHashMap
	- extends by 
		-SortedMap 
			-NavigableMap ->extends
				-TreeMap  ->extends
		-Dictionary - abstract class
			-HashTable ->extends, legacy
				-Properties ->extends, legacy
 
`ArrayList:`
	-Read is Fast, Insert and Delete is slow. Continuous Memory allocation
	-Actually we don't need to specify size for ArrayList.
	-If we don't specify size, By Default ArrayList allocates size of 10
	-If we go beyond capacity the ArrayList will create another ArrayList with one and half size of the existing ArrayList and copy the data from Existing to New Object.
	-So that why it's best practice to specify the size before if we know. 
	-If we specify the size ArrayList stops creating new ArrayList every time size is increasing.
	-we can Different type of data in ArrayList 
		ArrayList a = new ArrayList(Arrays.asList(123, 123.45, "Hello"));
	-Some important methods
		-`a.add("Hi");` --> To appened new element at the end of the index
		-`a.add(1, "World");` --> to add a new element at specific index in the range of ArrayList Size(), 
			If we add beyond size it throws error 
			a.add(100, "World");->java.lang.IndexOutOfBoundsException: Index: 100, Size: 4
		-`a.addAll(b);` --> to add existing list to another list at the end
		-`a.addAll(2, b);` --> to add existing list to another list at the specified index
		-`a.set(2, "!");` --> to replace the value at specific index
		-`a.contains(123)` --> return true if value found or false value not found
		-`a.size()` --> to get the size on an ArrayList
		-`a.get(i);` --> to get the data at a particular index
		-`a.remove(1);` --> to remove the data at a particular index
  `ArrayListDemo`
	
`LinkedList:`
	-Each node has three values. 
		-Previous node memory location
		-Value
		-Next node memory location
	-Random memory Allocation
	-Insert and Delete are fast. Read is slow

`Set:`
	-Duplicates are not allowed
	-`LinkedHashSet` maintains the order in which the elements are added. `HashSet` Doesn't maintain order
	-`TreeSet` will sort the data from ascending order
  `HashSetDemoWithRandom`
	-`TreeSet` with StringBuffer works from Java 11 Before Java 11 It throws  
		Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
	- ceiling() --> upper bound, floor() --> lower bound
	- higher() --> higher than given input,  lower() -> lower than given input
	- pollFirst() --> return and remove first element, pollLast() --> return and remove last element
	- descendingSet() --> By default TreeSet sorted in Ascending order(low->high), descendingSet is used to sort in Descending order(high->low)
	`NavigableTreeSetDemo`

`Iterator:`
	-Iterator is used to iterate through collections
		-Iterator<Integer> li = l.iterator();
	-li.hasNext() used to check the next value present or not
	-li.next() is used to get the value
	-li.remove() is used to remove the value from main object
  `IteratorDemo`

`ListIterator:`
	-it is same as `Iterator`. But it works only for 
	- Additionally it have hasPrevious() and previous() to `iterate from backwards`.

`Random:`
	-available in java.util
	-Used to generate Random number using r.nextInt(), r.nextFloat() etc.

`Comparable and Comparator:`
	-Both are interfaces
	-Comparable: It is used to define the natural ordering of the objects within the class.
		-It implements Comparable interface from java.lang	
	-Comparator: It is used to define custom sorting logic externally
		-It implements Comparator interface from java.util and override compare(obj1,obj2)
	-Sorting happen for both Comparable and Comparator like
		-Ex: ob1.compareTo(obj2)
			- -ve value if obj1 has to come before obj2
			- +ve value if obj1 has to come after obj2
			- 0 if both obj1 and obj2 are same
  `StringComparatorDemo`
	- Difference between
		-`Comparable` `affects the original class, i.e., the actual class is modified. Because we implement this interface with in the class
		-`Comparator` doesn't affect the original class, i.e., the actual class is not modified. We write separate class and use it to sort.
	
`Map`
	-In Map both key and value are objects.
	-Combination of key,value is Entry 	
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Jhon", 70);
		map.put("Tom", 60);
		map.put("Brad", 90);
		map.put("Lee", 80);
		for (String key : map.keySet()) {
			System.out.println(key + " :: " + map.get(key));
		}
	-.put(key,val) ->is used to add new value/ replace existing value baed on key
	-.keySet() ->is used to get the Collection of keys in the object
	-.values() ->is used to get the Collection of values in the object
	-.get() ->is used to get the value based on key
	-.getOrDefault() ->is used to get the value based on key, If value not present it return default value
###Differences
	
-The only difference between `HashMap` and `LinkedHashMap` is HashMap does maintain order. LinkedHashMap maintains order in which objects are added.
-The only difference between `HashMap` and `IdentityHashMap` is HashMap uses .equals to compare keys. IdentityHashMap uses == to compare keys
	-which means If value 10 presents at location 123 and 456.
	-HashMap compare the value create only one key.
	-But IdentityHashMap compares memory location so it creates two keys even though same value is available.
-If object is specified as key in HashMap,even though it doesn't have nay reference(i.e. u=null), it is not eligible for Garbage Collection. HashMap dominate over GC.
-In case of `WeakHashMap`, if object is specified as key doesn’t contain any references- it is eligible for garbage collection even though it is associated with WeakHashMap. i.e Garbage Collector dominates over WeakHashMap.

		
  `HashMapDemo` `IdentityHashMapDemo` `WeakHashMapDemo`

#Queue
- Some important functions
	-boolean offer(Object o) -> used to add the objects or elements to the queue
	-Object peek() -> return first or head element of the queue. If there are no elements in the queue it return null
	-Object element() -> same as peek(). But if there are no elements  in the queue it throws NoSuchElementException
	-Object poll() -> It removes and return the the first or head element. If there are no elements in the queue it return null
	-Object remove() -> same as poll(). But if there are no elements  in the queue it throws NoSuchElementException

-Difference between add() and offer()
	-The two functions come from two different interfaces that PriorityQueue implements:
		-add() comes from Collection.
		-offer() comes from Queue.
-For a capacity-constrained queue, the difference is that add() always returns true and throws an exception if it can't add the element, whereas offer() is allowed to return false if it can't add the element.
-However, this doesn't apply to PriorityQueue; the two functions are synonymous.

`PriorityQueue`
	-Does not allow duplicates.
	-Does not allow null.
	-Does not maintain order of insertion
	-Follows default natural sorting order. In case of object, must implement comparable and override compareTo(), otherwise throws ClassCastException
	-We can also use customized sorting order by implementing Comparator and pass it to the PriorityQueue Constructor.
	`PriorityQueueDemo` 


#Static methods for Collection
-There are two inbuilt utility classes which has several static methods that can operate on Collections and Arrays. They are 
	-Collections class from java.util
	-Arrays from java.util
-It offers several methods
	-sort(List l) -> to sort the elements in a List
	-binarySearch(List l,T t) 
		-> it can perform binary search on the List and it can find out where a particular element in the List. If not found it gives -ve value.
		-> it return the index of the element. If there are duplicates it will return the first index on the element.
	-reverse(List l) -> reverse the elements in the List
	`CollectionsUtilDemo` 
- These methods will impact the Original List
-Arrays.sort(int[] a);, Arrays.sort(int[] a,Comparator);
-Convert Array to List
	-List<String> la = Arrays.asList(sa); --> we cannot add new item because List still points String[]
	-new ArrayList(Arrays.asList(123, 123.45, "Hello")); --> we can add new item because it creates new List 
-Convert ArrayList to Array
	-Object[] obj = a.toArray();
	-System.out.println(Arrays.toString(obj));
-min, max
	-If we have Array, we need to convert to ArrayList
	-Only Wrapper datatypes can coverted to ArrayList. If we normal int first convert normal int to Integer.
	-Collections.min(Arrays.asList(ia));
	-Collections.max(Arrays.asList(ia));
	
	`ArraysDemo` `MergeArraysDemo`
	
#Generics
-Generics means parameterized types. The idea is to allow a type (like Integer, String, etc., or user-defined types) to be a parameter to methods, classes, and interfaces. Generics in Java allow us to create classes, interfaces, and methods where the type of the data is specified as a parameter. If we use generics, we do not need to write multiple versions of the same code for different data types.
-Types of Java Generics
	-Generic Method
	-Generic Class
-Type Parameter Naming Conventions
	The type parameters naming conventions are important to learn generics thoroughly. The common type parameters are as follows:
	T: Type
	E: Element
	K: Key
	N: Number
	V: Value
-Advantages of Generics
	Code Reusability: We can write a method, class, or interface once and use it with any type.
	Type Safety: Generics ensure that errors are detected at compile time rather than runtime, promoting safer code.
	No Need for Type Casting: The compiler automatically handles casting, removing the need for explicit type casting when retrieving data.
	`GenericsDemo` `GenericsMethodsDemo`
#Wildcards:
-Wildcards are used to represent an unknown type in generics. The ? symbol is the wildcard. 
`Bounded Wildcards:`
Wildcards can be bounded, allowing you to specify a range of acceptable types.
	`Upper Bounded: ? extends Type`, allows the method to accept any list of the specified type or its subclasses (e.g., List<? extends Number>). 
	`Lower Bounded: ? super Type`, allows the method to accept any list of the specified type or its superclasses (e.g., List<? super Integer>). 
`Unbounded Wildcard:`
? represents an unknown type, allowing the method to work with lists of any type. 
	