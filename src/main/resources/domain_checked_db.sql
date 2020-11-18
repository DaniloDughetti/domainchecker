use domain_checker_db;

CREATE TABLE IF NOT EXISTS users (
    email VARCHAR(255) NOT NULL PRIMARY KEY,
    password VARCHAR(255) NOT NULL,
    surname VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,    
    datecreation TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS watcheddomains (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user VARCHAR(255) NOT NULL,
    domain INT NOT NULL
);

CREATE TABLE IF NOT EXISTS domains (
    id INT AUTO_INCREMENT PRIMARY KEY,
    url VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    nameservers VARCHAR(255),
    registrar VARCHAR(255),
    registrarname VARCHAR(255),
    status VARCHAR(20),
    datecreation TIMESTAMP,
    dateexpiration TIMESTAMP,
    dateupdated TIMESTAMP
);

CREATE TABLE IF NOT EXISTS mailinglists (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user VARCHAR(255) NOT NULL,
    notificationalert INT NOT NULL
);

CREATE TABLE IF NOT EXISTS notification_alert (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user VARCHAR(255) NOT NULL,
    activation_time INT NOT NULL,
    active INT NOT NULL
);