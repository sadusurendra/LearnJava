#git
> create empty repository in git -> LearJava
> create empty folder in local system -> C:\Learn_Java
> cd that folder -> C:\Learn_Java
C:\Learn_Java> git init
C:\Learn_Java> git add .
C:\Learn_Java> git status -> jsut to check the files we are commiting
C:\Learn_Java> git commit -m "Day 1"
C:\Learn_Java> git remote add origin https://github.com/sadusurendra/LearnJava.git
C:\Learn_Java> git push -u origin master

For Second Time 
----------------
C:\Learn_Java> git add .
C:\Learn_Java> git status -> jsut to check the files we are commiting
C:\Learn_Java> git commit -m "Day 1"
C:\Learn_Java> git remote add origin https://github.com/sadusurendra/LearnJava.git
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
4. It supports multiple inheritance.`~`It does not support multiple inheritance.
5. The keyword ‘extend’ is used to extend an abstract class`~`The keyword implement is used to implement the interface.
6. It has class members(variables & methods) like private and protected, etc.`~`It has class members(variables & methods) public by default.
7. can declare constructor in abstract class `~` Cannot declare constructor in interface.
8. can define Blocks {} `~` cannot declare blocks

> final and abstract cannot be used at a time
	public final abstract class BMW -> it will thorw error can be used either abstract or final
> We cannot mark abstract method as static
	static abstract void accelerate() -> because we must implement abstract methods in child class
> We must override the abstract methods
> We cannot create object for Abstract classes
`BMW`

#final
If we mark final for class, we cannot inherit that class.
If we mark final for variables, we cannot change value. If we don't initialize value while creating variable then we can assign value in constructor.
If we mark final for method, we cannot override.

#Marker interfaces
> Serializable, Clonable, RandomAccess








