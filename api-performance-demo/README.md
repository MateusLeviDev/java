```
DB-SCHEMA

CREATE TABLE `category` (
  `id` bigint PRIMARY KEY,
  `name` varchar(255),
  `type` varchar(255),
  `status` varchar(255)
);

CREATE TABLE `products` (
  `id` bigint PRIMARY KEY,
  `category_id` bigint,
  `name` varchar(255),
  `description` text,
  `status` varchar(255)
);

CREATE TABLE `price` (
  `id` bigint PRIMARY KEY,
  `product_id` bigint,
  `price` double,
  `valid_from` timestamp,
  `valid_to` timestamp,
  `status` varchar(255)
);

CREATE TABLE `inventory` (
  `id` bigint PRIMARY KEY,
  `product_id` bigint,
  `warehouse_id` bigint,
  `available_quantity` integer,
  `reserved_quantity` integer,
  `status` varchar(255)
);

ALTER TABLE `inventory` ADD FOREIGN KEY (`product_id`) REFERENCES `products` (`id`);

ALTER TABLE `products` ADD FOREIGN KEY (`category_id`) REFERENCES `category` (`id`);

ALTER TABLE `price` ADD FOREIGN KEY (`product_id`) REFERENCES `products` (`id`);


-- Insert data into category table
INSERT INTO `category` (`id`, `name`, `type`, `status`) VALUES
(1, 'Electronics', 'Goods', 'active'),
(2, 'Clothing', 'Goods', 'active'),
(3, 'Home Appliances', 'Goods', 'active');

-- Insert data into products table
INSERT INTO `products` (`id`, `category_id`, `name`, `description`, `status`) VALUES
(1, 1, 'Smartphone', 'Latest smartphone with high-speed performance', 'active'),
(2, 1, 'Laptop', '15-inch laptop with 8GB RAM, 256GB SSD', 'active'),
(3, 2, 'Jacket', 'Waterproof jacket for outdoor activities', 'active'),
(4, 3, 'Air Conditioner', '1.5 ton AC with energy-efficient cooling', 'active');

-- Insert data into price table
INSERT INTO `price` (`id`, `product_id`, `price`, `valid_from`, `valid_to`, `status`) VALUES
(1, 1, 699.99, NOW(), DATE_ADD(NOW(), INTERVAL 1 YEAR), 'active'),
(2, 2, 1299.99, NOW(), DATE_ADD(NOW(), INTERVAL 1 YEAR), 'active'),
(3, 3, 59.99, NOW(), DATE_ADD(NOW(), INTERVAL 1 YEAR), 'active'),
(4, 4, 299.99, NOW(), DATE_ADD(NOW(), INTERVAL 1 YEAR), 'active');

-- Insert data into inventory table
INSERT INTO `inventory` (`id`, `product_id`, `warehouse_id`, `available_quantity`, `reserved_quantity`, `status`) VALUES
(1, 1, 1, 100, 10, 'available'),
(2, 2, 1, 50, 5, 'available'),
(3, 3, 2, 200, 20, 'available'),
(4, 4, 3, 30, 2, 'available');


-- fetch data from table
SELECT * from products p ;

SELECT * FROM category c ;

SELECT * FROM inventory i ;

SELECT * FROM price p ;
```


porque permite a execução simultânea de tarefas. Com CompletableFuture, podemos realizar chamadas assíncronas e trabalhar com concurrent programming de forma eficiente, o que pode reduzir o tempo total necessário para concluir um conjunto de operações.

1. Aproveitamento de Tempo de Espera (I/O-bound)

Quando fazemos operações como fetch de dados de uma API externa, banco de dados ou sistema de arquivos, há um tempo de espera enquanto o sistema aguarda a resposta. Em um programa de execução única (single-threaded), ele fica bloqueado até que a operação seja concluída. Com multithreading e CompletableFuture, podemos iniciar várias operações de fetch em paralelo:

    Cada chamada de fetch é realizada em uma thread separada, permitindo que a thread principal continue executando outras tarefas enquanto as operações de fetch são concluídas.
    Dessa forma, várias operações de I/O podem ocorrer simultaneamente, aproveitando ao máximo o tempo de espera para cada operação.
    
2. Utilização de Todos os Núcleos da CPU (CPU-bound)

Para tarefas CPU-bound (cálculos intensivos), multithreading ajuda a distribuir a carga de trabalho entre vários núcleos do processador:

    Em um sistema multicore, múltiplas threads podem executar em paralelo, o que permite que o programa complete as tarefas mais rapidamente do que em execução sequencial.
    Para operações de busca de dados, isso significa que cada fetch de dados pode ser tratado em um core diferente, acelerando o processo geral.

3. CompletableFuture e Programação Assíncrona

CompletableFuture permite criar pipelines de tarefas assíncronas, onde você pode definir uma sequência de etapas a serem executadas quando uma tarefa for concluída. Esse recurso é útil em chamadas de dados porque podemos definir ações para processar os dados conforme cada fetch é concluído.

4. Execução Não Bloqueante com thenCombine e allOf

Com CompletableFuture, você pode combinar os resultados de várias operações assíncronas de maneira não bloqueante

5. Redução do Tempo Total de Execução

Usar CompletableFuture para operações de fetch paralelas em várias threads geralmente reduz o tempo total de execução. Se cada operação de fetch leva x segundos, ao rodar n fetches em sequência, o tempo total seria aproximadamente n * x. Com threads paralelas, o tempo total pode se aproximar de x em vez de n * x, já que todas as operações ocorrem simultaneamente.
