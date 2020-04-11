CREATE DATABASE `estoque` ;

CREATE TABLE `estoque`.`produto` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(50) NULL,
  `valor` FLOAT NULL,
  `quantidade` INT NULL,
  PRIMARY KEY (`ID`));
