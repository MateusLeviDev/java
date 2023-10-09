> ##### Coleções
>
>> Uma coleção é uma estrutura de dados — na realidade, um objeto — que pode armazenar referências a outros objetos. Normal-
mente, coleções contêm referências a objetos de qualquer tipo que tem o relacionamento é um com o tipo armazenado na coleção. As
interfaces de estrutura de coleções declaram as operações a ser realizadas genericamente em vários tipos de coleções. A Figura 16.1
lista algumas das interfaces da estrutura das coleções. Várias implementações dessas interfaces são fornecidas dentro da estrutura.
Você também pode fornecer suas próprias implementações.

- métodos
 - sort
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

```
public String formatHidingNumber(String cardNumber) {

		cardNumber = cardNumber.replace(" ", "");
		return cardNumber.substring(0, 6) + "******"
				+ cardNumber.substring(cardNumber.length() - 4, cardNumber.length());
	}
```




