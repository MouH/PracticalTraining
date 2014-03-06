SHOW DATABASES;
USE employee;
SHOW TABLES;
SELECT * FROM emp;


DROP DATABASE test;
CREATE DATABASE test CHARACTER SET utf8;

##创建表User
CREATE TABLE USER (
	userid INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20) UNIQUE,
	reg_date DATETIME
)

SHOW TABLES;
SELECT * FROM USER;

##在User表中加字段password,age
ALTER TABLE USER
     ADD PASSWORD VARCHAR(20),
     ADD age VARCHAR(2)
##修改age的定义
ALTER TABLE USER
     MODIFY age INT;
##删除age字段
ALTER TABLE USER
	DROP age
	
SELECT * FROM USER
##插入记录
INSERT INTO USER(NAME,reg_date,PASSWORD)
      VALUES('tom','1991-1-1','001');
	
INSERT INTO USER(NAME,reg_date,PASSWORD)
      VALUES('tom2','1991-1-1','001');
##修改记录
UPDATE USER SET PASSWORD = '002' WHERE userid=2
##删除
DELETE FROM USER WHERE userid IN(1,2);

SELECT * FROM USER;

USE employee;
SELECT * FROM emp;
SELECT * FROM dept;
SELECT * FROM salgrade;
##选择列,别名
SELECT emp_name AS NAME,job,salary FROM emp;
##选择行 查salary在2975与5000之间
SELECT * FROM emp
WHERE salary <=5000 AND salary >=2975;
SELECT * FROM emp WHERE salary BETWEEN 2975 AND 5000
##查询部门ID是2或3的员工
SELECT * FROM emp WHERE dept_id IN (2,3);
SELECT * FROM emp WHERE dept_id = 2 OR dept_id=3;
##查询姓名以s开头的员工
SELECT * FROM emp WHERE emp_name LIKE 'S%';
##查询没有奖金的员工
SELECT * FROM emp WHERE ISNULL(bonus);
##查询1982-1-1之后参加工作的员工
SELECT * FROM emp 
WHERE hiredate > '1982-1-1'
ORDER BY hiredate
##order by子句.asc,desc
SELECT * FROM emp ORDER BY hiredate DESC,salary; 
##去掉重复行distinct
SELECT DISTINCT job,salary FROM emp ORDER BY job,salary

##组函数:min,max,avg,sum,count
##查询工资的最小值 最大值  平均值 员工人数
SELECT MIN(salary),MAX(salary),AVG(salary),COUNT(*)
FROM emp
##统计group by 子句,having子句
##按部门统计工资的最小值 最大值  平均值 员工人数,平均工资大于2000
SELECT dept_id,MIN(salary),MAX(salary),AVG(salary),COUNT(*)
FROM emp
GROUP BY dept_id
HAVING AVG(salary) > 2000
##limit子句放在select语句的最后
##limit 6  显示前6条记录
SELECT * FROM emp LIMIT 5; 
##limit 5,5  显示从第6条开始的5条记录
SELECT * FROM emp LIMIT 5,5
##分页查询:参数,显示第几页,每页显示的记录个数
##每页显示6条记录,显示第2页
SELECT * FROM emp LIMIT 6 ,6;
##多表查询,关联查询
##内联接:两边有才有
##语法1
SELECT * FROM dept d,emp e WHERE d.id = e.dept_id
##语法2
SELECT * FROM dept d INNER JOIN emp e ON d.id = e.dept_id;
##左外联接:一边有就有
SELECT * FROM dept d LEFT JOIN  emp e ON d.id = e.dept_id;

SELECT * FROM emp;
SELECT * FROM dept;

##显示花名册,显示部门名称 员工名称 职务 入职入期
SELECT  d.dept_name,e.emp_name,e.job,e.hiredate
FROM dept d LEFT JOIN emp e ON d.id = e.dept_id

##显示雇员SCOTT的管理者姓名[自关联]
SELECT e1.emp_name,e2.emp_name 
FROM emp e1 LEFT JOIN emp e2 ON e1.mgr_id = e2.id
WHERE e1.emp_name = 'SCOTT';

##子查询:select语句可以放在where子句  having子句 from子句中
##查询工资大于平均工资的员工

SELECT * FROM emp WHERE salary >(SELECT AVG(salary) FROM emp)

SELECT AVG(salary) FROM emp;






































































