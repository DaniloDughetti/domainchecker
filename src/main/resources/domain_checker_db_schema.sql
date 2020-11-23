use domain_checker_db;

CREATE TABLE IF NOT EXISTS users (
    email VARCHAR(255) NOT NULL PRIMARY KEY,
    password VARCHAR(255) NOT NULL,
    surname VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,    
    datecreation DATE
);

CREATE TABLE IF NOT EXISTS watcheddomains (
    user VARCHAR(255) NOT NULL,
    domain INT NOT NULL,
	PRIMARY KEY(user, domain)
);

CREATE TABLE IF NOT EXISTS domains (
    id INT AUTO_INCREMENT PRIMARY KEY,
    url VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    nameservers VARCHAR(255),
    registrar VARCHAR(255),
    registrarname VARCHAR(255),
    status VARCHAR(20),
    datecreation DATE,
    dateexpiration DATE,
    dateupdated DATE
);

CREATE TABLE IF NOT EXISTS mailinglists (
    user VARCHAR(255) NOT NULL,
    notificationalert INT NOT NULL,
    PRIMARY KEY(user, notificationalert)
);

CREATE TABLE IF NOT EXISTS notificationalerts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user VARCHAR(255) NOT NULL,
    activationtime INT NOT NULL,
    active INT NOT NULL
);

CREATE TABLE IF NOT EXISTS notifications (
    id INT AUTO_INCREMENT PRIMARY KEY,
    notificationalert INT NOT NULL,
    rundate DATE
);