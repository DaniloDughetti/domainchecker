use domain_checker_db;

INSERT INTO users(email, password, surname, name, datecreation) VALUES('test@gmail.com', 'test', 'nametest', 'surnametest', CURRENT_DATE());
INSERT INTO users(email, password, surname, name, datecreation) VALUES('test2@gmail.com', 'test2', 'nametest2', 'surnametest2', CURRENT_DATE());
INSERT INTO domains(url, email, nameservers, registrar, registrarname, status, datecreation, dateexpiration, dateupdated) 
VALUES('google.com', 'test@gmail.com', 'nameservers', 'registrar', 'registrarname', 'ok', CURRENT_DATE(), CURRENT_DATE(), CURRENT_DATE());
INSERT INTO watcheddomains(user, domain) VALUES('test@gmail.com', 1);
INSERT INTO notificationalerts(user, activationtime, active) VALUES('test@gmail.com', 1, 1);
INSERT INTO mailinglists(user, notificationalert) VALUES ('test@gmail.com', 1);
INSERT INTO mailinglists(user, notificationalert) VALUES ('test2@gmail.com', 1);
INSERT INTO notifications(notificationalert, rundate) VALUES(1, CURRENT_DATE());