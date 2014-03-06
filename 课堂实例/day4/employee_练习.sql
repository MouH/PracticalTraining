CREATE DATABASE employee CHARACTER SET utf8;

CREATE TABLE emp (
	id INT AUTO_INCREMENT PRIMARY KEY,
	empno INT UNIQUE,
	emp_name  VARCHAR(20),
	job	VARCHAR(50),
	hiredate DATE,
	mgr_id  INT,	
	salary  INT,
	bonus   INT,	
	dept_id INT
);

CREATE TABLE dept (
	id INT AUTO_INCREMENT PRIMARY KEY,
	deptno INT,
	dept_name VARCHAR(100),
	loc  VARCHAR(100)
);

CREATE TABLE salgrade (
	id INT AUTO_INCREMENT PRIMARY KEY,
	lowsal INT,
	hisal  INT
);

INSERT INTO emp(id,empno,emp_name,job,mgr_id,hiredate,salary,bonus,dept_id)
	VALUES(1,7369,'SMITH','CLERK',12,'1980-12-17',800,NULL,2);
INSERT INTO emp(id,empno,emp_name,job,mgr_id,hiredate,salary,bonus,dept_id)
	VALUES(2,7499 ,' ALLEN',' SALESMAN',6,'1981-2-20',1600,300,3);
INSERT INTO emp(id,empno,emp_name,job,mgr_id,hiredate,salary,bonus,dept_id)
	VALUES(3,7521,'WARD','SALESMAN',6,'1981-2-22',1250,500,3);
INSERT INTO emp(id,empno,emp_name,job,mgr_id,hiredate,salary,bonus,dept_id)
	VALUES(4,7566,'JONES','MANAGER', 9,'1981-4-2', 2975,NULL, 2);
INSERT INTO emp(id,empno,emp_name,job,mgr_id,hiredate,salary,bonus,dept_id)
	VALUES(5,7654,'MARTIN','SALESMAN', 6,'1981-9-28',1250, 1400,3);
INSERT INTO emp(id,empno,emp_name,job,mgr_id,hiredate,salary,bonus,dept_id)
	VALUES(6,7698,'BLAKE','MANAGER',9,'1981-5-1',2850,NULL,3);
INSERT INTO emp(id,empno,emp_name,job,mgr_id,hiredate,salary,bonus,dept_id)
	VALUES(7,7782,'CLARK','MANAGER', 9,'1981-6-9', 2450,NULL,1);
INSERT INTO emp(id,empno,emp_name,job,mgr_id,hiredate,salary,bonus,dept_id)
	VALUES(8,7788,'SCOTT','ANALYST', 4, '1987-4-19', 3000,NULL,2);
INSERT INTO emp(id,empno,emp_name,job,mgr_id,hiredate,salary,bonus,dept_id)
	VALUES(9,7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL, 1);
INSERT INTO emp(id,empno,emp_name,job,mgr_id,hiredate,salary,bonus,dept_id)
	VALUES(10,7844,'TURNER',' SALESMAN', 6,'1981-9-8', 1500, 0, 3);
INSERT INTO emp(id,empno,emp_name,job,mgr_id,hiredate,salary,bonus,dept_id)
	VALUES(11,7876,' ADAMS','CLERK', 8,'1987-5-23', 1100,NULL, 2);
INSERT INTO emp(id,empno,emp_name,job,mgr_id,hiredate,salary,bonus,dept_id)
	VALUES(12,7900,' JAMES','CLERK', 6,'1981-12-03', 950,NULL, 3);
INSERT INTO emp(id,empno,emp_name,job,mgr_id,hiredate,salary,bonus,dept_id)
	VALUES(13,7902,'FORD','ANALYST', 4,'1981-12-03', 3000,NULL, 2);
INSERT INTO emp(id,empno,emp_name,job,mgr_id,hiredate,salary,bonus,dept_id)
	VALUES(14,7934,'MILLER','CLERK', 7,'1982-1-23', 1300,NULL, 1);

INSERT INTO dept(id,deptno,dept_name,loc) VALUES(1,10,'ACCOUNTING','NEW YORK');
INSERT INTO dept(id,deptno,dept_name,loc) VALUES(2,20,'RESEARCH','DALLAS');
INSERT INTO dept(id,deptno,dept_name,loc) VALUES(3,30,'SALES','CHICAGO');
INSERT INTO dept(id,deptno,dept_name,loc) VALUES(4,40,'OPERATIONS',' BOSTON');

INSERT INTO salgrade(id,lowsal,hisal) VALUES(1,700,1200);
INSERT INTO salgrade(id,lowsal,hisal) VALUES(2,1201,1400);
INSERT INTO salgrade(id,lowsal,hisal) VALUES(3,1401,2000);
INSERT INTO salgrade(id,lowsal,hisal) VALUES(4,2001,3000);
INSERT INTO salgrade(id,lowsal,hisal) VALUES(5,3001,9999);



##1、显示部门代码为20的部门名，以及该部门的所有雇员名、雇员工资及岗位

##2、显示所有雇员名、雇员工资及工资级别（非等值联接的例子）
##3、显示雇员“SCOTT”的管理者名
 
##4、显示获得奖金的所有雇员名、奖金额以及所在部门名

##5、查询EMP表和SALGRADE表，显示部门代码为20的雇员名、工资及其工资级别

##6、按以下格式显示下面的信息，条件是工资大于1500的。
##     部门名称  姓名  工资

##7、按以下格式显示下面信息，条件是此人工资在所有人中最高。
##     部门名称  姓名  工资

##8、查询出king所在部门的部门号\部门名称\部门人数

##9(***)、查询出king所在部门的工作年限最大的员工名字

###10(***)、查询出管理员工人数最多的人的名字和他管理的人的名字

















