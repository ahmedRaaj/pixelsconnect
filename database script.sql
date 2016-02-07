-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema pixelsconnect
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `pixelsconnect` ;

-- -----------------------------------------------------
-- Schema pixelsconnect
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `pixelsconnect` DEFAULT CHARACTER SET utf8 ;
USE `pixelsconnect` ;

-- -----------------------------------------------------
-- Table `pixelsconnect`.`Category`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pixelsconnect`.`Category` ;

CREATE TABLE IF NOT EXISTS `pixelsconnect`.`Category` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pixelsconnect`.`Product`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pixelsconnect`.`Product` ;

CREATE TABLE IF NOT EXISTS `pixelsconnect`.`Product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `description` VARCHAR(200) NULL,
  `unit_price` DECIMAL NULL,
  `buying_price` DECIMAL NULL,
  `image` VARCHAR(45) NULL,
  `additional_info` VARCHAR(100) NULL,
  `last_update` TIMESTAMP NULL,
  `Category_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Product_Category_idx` (`Category_id` ASC),
  CONSTRAINT `fk_Product_Category`
    FOREIGN KEY (`Category_id`)
    REFERENCES `pixelsconnect`.`Category` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pixelsconnect`.`Customer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pixelsconnect`.`Customer` ;

CREATE TABLE IF NOT EXISTS `pixelsconnect`.`Customer` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  `mobile` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `postal_code` VARCHAR(45) NULL,
  `email2` VARCHAR(45) NULL,
  `company_name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pixelsconnect`.`customer_order`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pixelsconnect`.`customer_order` ;

CREATE TABLE IF NOT EXISTS `pixelsconnect`.`customer_order` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `total_amount` DECIMAL NULL,
  `invoice_no` INT NULL,
  `quotation` TINYINT(1) NULL,
  `final_amount` DECIMAL NULL,
  `discount` DECIMAL NULL,
  `Customer_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_customer_order_Customer1_idx` (`Customer_id` ASC),
  CONSTRAINT `fk_customer_order_Customer1`
    FOREIGN KEY (`Customer_id`)
    REFERENCES `pixelsconnect`.`Customer` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pixelsconnect`.`ordered_product`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pixelsconnect`.`ordered_product` ;

CREATE TABLE IF NOT EXISTS `pixelsconnect`.`ordered_product` (
  `Product_id` INT NOT NULL,
  `customer_order_id` INT NOT NULL,
  `quantity` TINYINT NULL,
  PRIMARY KEY (`Product_id`, `customer_order_id`),
  INDEX `fk_Product_has_customer_order_customer_order1_idx` (`customer_order_id` ASC),
  INDEX `fk_Product_has_customer_order_Product1_idx` (`Product_id` ASC),
  CONSTRAINT `fk_ordered_product_product`
    FOREIGN KEY (`Product_id`)
    REFERENCES `pixelsconnect`.`Product` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ordered_product_customer_order`
    FOREIGN KEY (`customer_order_id`)
    REFERENCES `pixelsconnect`.`customer_order` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
