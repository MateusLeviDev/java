CREATE TABLE `ticket_info` (
  id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  movie_name VARCHAR(255) NOT NULL,
  movie_date DATE NOT NULL,
  movie_time VARCHAR(20) NOT NULL,
  ticket_prize DOUBLE NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE `payment_info` (
  paymentId CHAR(36) PRIMARY KEY,
  accountNo VARCHAR(255) NOT NULL,
  amount DOUBLE NOT NULL,
  cardType VARCHAR(50) NOT NULL,
  ticketId BIGINT NOT NULL
);