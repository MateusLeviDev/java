Linux kernel
============

There are several guides for kernel developers and users. These guides can
be rendered in a number of formats, like HTML and PDF. Please read
Documentation/admin-guide/README.rst first.

In order to build the documentation, use ``make htmldocs`` or
``make pdfdocs``.  The formatted documentation can also be read online at:

    https://www.kernel.org/doc/html/latest/

There are various text files in the Documentation/ subdirectory,
several of them using the Restructured Text markup notation.

Please read the Documentation/process/changes.rst file, as it contains the
requirements for building and running the kernel, and information about
the problems which may result by upgrading your kernel.








> ##### Coleções
>
>> Uma coleção é uma estrutura de dados — na realidade, um objeto — que pode armazenar referências a outros objetos. Normal-
mente, coleções contêm referências a objetos de qualquer tipo que tem o relacionamento é um com o tipo armazenado na coleção. As
interfaces de estrutura de coleções declaram as operações a ser realizadas genericamente em vários tipos de coleções. A Figura 16.1
lista algumas das interfaces da estrutura das coleções. Várias implementações dessas interfaces são fornecidas dentro da estrutura.
Você também pode fornecer suas próprias implementações.

- métodos
- - sort
  - binarySearch
  - reverse
  - shuffle
  - fill
  - copy
  - min
  - max
  - addAll
  - frequency
  - disjoint

```java
public String formatHidingNumber(String cardNumber) {

		cardNumber = cardNumber.replace(" ", "");
		return cardNumber.substring(0, 6) + "******"
				+ cardNumber.substring(cardNumber.length() - 4, cardNumber.length());
	}
```




