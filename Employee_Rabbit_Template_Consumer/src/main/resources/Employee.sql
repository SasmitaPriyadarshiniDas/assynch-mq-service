DROP IF EXISTS database springBootDb;
CREATE database springBootDb;
use springBootDb;

DROP TABLE IF EXISTS employee;
CREATE TABLE IF NOT EXISTS employee (
  employeeId int(11) unsigned NOT NULL AUTO_INCREMENT,
  employeeName varchar(20) DEFAULT NULL,
  salary double DEFAULT NULL,
  departmentCode int(11),
  PRIMARY KEY (employeeId)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

INSERT INTO employee (employeeId, employeeName,departmentCode, salary) VALUES
	(1001, ' Smita'   ,102 , 100000),
	(1002, 'Sunita' ,101 , 200000),
	(1003, 'Riya' ,102 , 100000);
commit;
