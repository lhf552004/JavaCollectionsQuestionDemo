# Introduction
This is for Java Collections questions and demo

Java中集合类主要分为继承以下四种接口的类，

Set, List, Queue，以及Map. 

其中Set, List, Queue 是近亲，都是继承了Collection接口。

对应的常用的类有，HashSet, ArrayList, PriorityQueue, 以及HashMap。

![framework](https://www.codejava.net/images/articles/javacore/collections/collections%20framework%20overview.png)

Tips：

继承Map接口的类，想要用Iterator, 先要通过entrySet()转换为Set,entrySet来自接口Map

# 问题
## Collections vs Collection
Collections是工具类，在java.util，Collection是interface,
## What is the Collection framework in Java?
Collection Framework is a combination of classes and interface, which is used to store and manipulate the data in the form of objects. 

It provides various classes such as ArrayList, Vector, Stack, and HashSet, etc. and interfaces such as List, Queue, Set, etc. for this purpose.

## What are the main differences between array and collection?
Array and Collection are somewhat similar regarding storing the references of objects and manipulating the data, but they differ in many ways. The main differences between the array and Collection are defined below:

主要区别，
1. array是固定大小，collection类是可变的
2. array只能存储同类型对象，collection可以存储不同类型的

Arrays are always of fixed size, i.e., a user can not increase or decrease the length of the array according to their requirement or at runtime, but In Collection, size can be changed dynamically as per need.

Arrays can only store homogeneous or similar type objects, but in Collection, heterogeneous objects can be stored.

Arrays cannot provide the ?ready-made? methods for user requirements as sorting, searching, etc. but Collection includes readymade methods to use.

## ArrayList vs Vector

[Vector vs ArrayList in Java](https://www.geeksforgeeks.org/vector-vs-arraylist-java/)
Vector是同步的，ArrayList是非同步的
Synchronization : Vector is synchronized, which means only one thread at a time can access the code, while arrayList is not synchronized

Performance: ArrayList is faster, since it is non-synchronized, while vector operations give slower performance since they are synchronized (thread-safe). 

Data Growth: ArrayList and Vector both grow and shrink dynamically to maintain optimal use of storage – but the way they resize is different. ArrayList increments 50% of the current array size if the number of elements exceeds its capacity, while vector increments 100% – essentially doubling the current array size.

Traversal: Vector can use both Enumeration and Iterator for traversing over elements of vector while ArrayList can only use Iterator for traversing.

Applications : Most of the time, programmers prefer ArrayList over Vector because ArrayList can be synchronized explicitly using Collections.synchronizedList.

## What is the difference between ArrayList and LinkedList?
ArrayList装转,遍历数据速度快。

linkedList插入、删除数据快。
| ArrayList	| LinkedList |
| --------- | ---------- |
| ArrayList uses a dynamic array. | LinkedList uses a doubly linked list.| 
| ArrayList is not efficient for manipulation because too much is required. | LinkedList is efficient for manipulation.| 
| ArrayList is better to store and fetch data.| 	LinkedList is better to manipulate data.| 
| ArrayList provides random access.| 	LinkedList does not provide random access.| 
| ArrayList takes less memory overhead as it stores only object	| LinkedList takes more memory overhead, as it stores the object as well as the address of that object.| 

## How to make Java ArrayList Read-Only?
   We can obtain java ArrayList Read-only by calling the **Collections.unmodifiableCollection()** method. 
   
   When we define an ArrayList as Read-only then we cannot perform any modification in the collection through  add(), remove() or set() method.
   
##  Iterator and Enumeration 的区别
Iterator比Enumeration多了一个remove()方法

## 为什么ListIterator有add（）方法但Iterator没有
ListIterator之所以添加了add()方法，是因为它能够在集合的两个方向上遍历或迭代。

它在上一个和下一个调用方面保持两个指针，并且可以在不影响当前迭代的情况下添加新元素。

[使用](https://blog.csdn.net/u012804490/article/details/29180561)

| Iterator | ListIterator |
| -------- | ------------ |
| The Iterator traverses the elements in the forward direction only. |	ListIterator traverses the elements in backward and forward directions both. | 
| The Iterator can be used in List, Set, and Queue.	| ListIterator can be used in List only.| 
| The Iterator can only perform remove operation while traversing the collection. | ListIterator can perform ?add,? ?remove,? and ?set? operation while traversing the collection.| 
 
## How to remove duplicates from ArrayList?
There are two ways to remove duplicates from the ArrayList.

Using HashSet: By using HashSet we can remove the duplicate element from the ArrayList, but it will not then preserve the insertion order.
Using LinkedHashSet: We can also maintain the insertion order by using LinkedHashSet instead of HashSet.
##  How to reverse ArrayList?
    Collections.reverse(list);  
 Demo 6
## How to sort ArrayList in descending order?
    Comparator cmp = Collections.reverseOrder();  
    Collections.sort(list,cmp);  
## LinkedList是如何用Java实现的，它是单链表还是双链表？ 
Linkedlist 是双向链表

##  What is the difference between Comparable and Comparator?
See Demo 3, using lamda to create Comparator, using Comparable from String.

| Comparable | Comparator | 
| ---------- | ---------- |
| Comparable provides only one sort of sequence. | The Comparator provides multiple sorts of sequences.| 
| It provides one method named compareTo().	| It provides one method named compare().| 
| It is found in java.lang package.	| It is located in java.util package.| 
| If we implement the Comparable interface, The actual class is modified. | The actual class is not changed.| 
## What is the difference between Set and Map?
The differences between the Set and Map are given below.

Set contains values only whereas Map contains key and values both.

Set contains unique values whereas Map can contain unique Keys with duplicate values.

Set holds a single number of null value whereas Map can include a single null key with n number of null values.

## How to synchronize ArrayList?
We can synchronize ArrayList in two ways.
    
    Using Collections.synchronizedList() method
    Using CopyOnWriteArrayList<T>
## HashMap vs HashTable

前者是非同步的，它不是线程安全的。HashTable是同步的，线程安全。

[HashMap vs HashTable](https://www.geeksforgeeks.org/differences-between-hashmap-and-hashtable-in-java/)

1. HashMap is non synchronized. It is not-thread safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
2. HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
3. HashMap is generally preferred over HashTable if thread synchronization is not needed

Why HashTable doesn’t allow null and HashMap does?
To successfully store and retrieve objects from a HashTable, the objects used as keys must implement the hashCode method and the equals method. Since null is not an object, it can’t implement these methods. HashMap is an advanced version and improvement on the Hashtable. HashMap was created later.

## How does HashMap work in Java
HashMap是基于hashing的原理，

我们使用put(key, value)存储对象到HashMap中，

使用get(key)从HashMap中获取对象。

当我们给put()方法传递键和值时，我们先对键调用hashCode()方法，返回的hashCode用于找到bucket位置来储存Entry对象

## Queue 的两个方法 poll()和 remove() 的区别
唯一的区别在于当queue为空时，: the remove() method throws an exception, while the poll() method returns null.
[官方资料](https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html)
## PriorityQueue vs Queue vs Heap
Queue遵循先进先出的原则，

PriorityQueue是在先进先出的基础上，进行排序

PriorityQueue是基于Heap的实现

See Demo 1
[参考](https://anmolsehgal.medium.com/heap-vs-priority-queues-vs-queues-b03398312c87)

## Deque vs Queue
Queue是队列，只能一头进，另一头出。

Deque来实现一个双端队列，它的功能是：

- 既可以添加到队尾，也可以添加到队首；
- 既可以从队首获取，又可以从队尾获取。
[参考](https://www.liaoxuefeng.com/wiki/1252599548343744/1265122668445536)

## 如何从Collection类的对象中remove一条记录(entry)
Collection接口的类用remove(Object obj)

List接口的类还可以用remove(int index)在删除指定位置的记录

注意不可以在iterating时操作，否在出错

但是可以用Iterator's remove()方法在遍历list的时候删除

## HashSet是如何实现的
是通过HashMap, 将要插入的值作为HashMap的key,插入HashMap

因为HashMap的key是唯一的，从而实现HashSet的值的唯一性

## 如何排序
对于Collection类来说，调用sort(Comparator<V>()), 而V类需要继承Comparable

也可以调用Collections.sort()进行排序

## Synchronized Collection 和 Concurrent Collection 区别
Concurrent Collection的类有ConcurrentHashMap, CopyOnWriteArrayList, BlockingQueue等

通过方法Collections.synchronizedMap()获得Synchronized HashMap

区别在于Concurrent Collection的类有更好的性能，因为他们只锁定Map的部分

## Hashtable VS ConcurrentHashMap
可以用ConcurrentHashMap代替Hashtable，需要改动的地方是
if(Hashtable.get(key) == null) put(key, value)
变为
putIfAbsent()

## CopyOnWriteArrayList ArrayList Vector
CopyOnWriteArrayList is thread-safe, ArrayList is not

CopyOnWriteArrayList 在read数据时，相对于Vector能够更好的处理并发性



