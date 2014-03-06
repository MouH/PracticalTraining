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



##1����ʾ���Ŵ���Ϊ20�Ĳ��������Լ��ò��ŵ����й�Ա������Ա���ʼ���λ

##2����ʾ���й�Ա������Ա���ʼ����ʼ��𣨷ǵ�ֵ���ӵ����ӣ�
##3����ʾ��Ա��SCOTT���Ĺ�������
 
##4����ʾ��ý�������й�Ա����������Լ����ڲ�����

##5����ѯEMP���SALGRADE����ʾ���Ŵ���Ϊ20�Ĺ�Ա�������ʼ��乤�ʼ���

##6�������¸�ʽ��ʾ�������Ϣ�������ǹ��ʴ���1500�ġ�
##     ��������  ����  ����

##7�������¸�ʽ��ʾ������Ϣ�������Ǵ��˹���������������ߡ�
##     ��������  ����  ����

##8����ѯ��king���ڲ��ŵĲ��ź�\��������\��������

##9(***)����ѯ��king���ڲ��ŵĹ�����������Ա������

###10(***)����ѯ������Ա�����������˵����ֺ���������˵�����

















