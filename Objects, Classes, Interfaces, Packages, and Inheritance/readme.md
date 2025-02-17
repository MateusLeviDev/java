# What is an Object?

obj é um pacote de software com estado e comportamento relacionados. ou seja, o Comportamento (methods) podem modificar o estado (att)

Identifying the state and behavior for real-world objects is a great way to begin thinking in terms of object-oriented programming.

`Diferença entre Classe e Objeto`: you will often find many individual objects all of the same kind. There may be thousands of other bicycles in existence, all of the same make and model. Each bicycle was built from the same set of blueprints and therefore contains the same components. In object-oriented terms, we say that your bicycle is an instance of the class of objects known as bicycles. A class is the blueprint from which individual objects are created

# What is Inheritance?

- Object-oriented programming allows classes to inherit commonly used state and behavior from other classes

In the Java programming language, each class is allowed to have one direct superclass, and each superclass has the potential for an unlimited number of subclasses

# What is an Interface?

Implementing an interface allows a class to become more formal about the behavior it promises to provide. Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler. If your class claims to implement an interface, all methods defined by that interface must appear in its source code before the class will successfully compile.

---

<br><br><br>

- public: al classes
- protected: class, package and subclasses
- default: class and package
- private: class