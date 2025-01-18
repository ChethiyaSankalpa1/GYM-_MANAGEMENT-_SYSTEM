CREATE DATABASE gym_management;

USE gym_management;

CREATE TABLE trainersmembers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    address VARCHAR(255) NOT NULL,
    mobile VARCHAR(15) NOT NULL,
    join_date varchar(50)
);
CREATE TABLE members (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    birth_date varchar(50),
    mobile VARCHAR(15),
    gender VARCHAR(10),
    address varchar(50),
    join_date varchar(50),
    trainer varchar(50)
    
);

