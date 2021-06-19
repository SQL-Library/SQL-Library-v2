# SQL Library

# How to use: (add to docs)
Set up username, password and url for db by instantiating a Secrets <br />
object using Secrets.java methods. Use Secrets setters at the beginning of your application <br />
`Secrets credentials = new Secrets();` <br />
`secrets.setUsername(username_goes_here);` <br />
`secrets.setPassword(password_goes_here);` <br />
`secrets.setUrl(url_goes_here);` <br />

AS OF NOW, CONSIDER BUILDING PROJECT ON TOP OF THIS (I.E. FRAMEWORK)

## Relational SQL services support:
#### - Postgres
#### - Spring
#### - MariaDB
#### - MongoDB
#### - MySQL
#### - SQLite
#### - SQL Server
#### - Oracle Database
#### - Tomcat
#### - Spring Boot Starter
#### - Hive

### Disclaimer of Software Warranty. <br />
THIS LIBRARY PROVIDES THE SOFTWARE TO YOU "AS IS" AND WITHOUT WARRANTY OF ANY KIND, EXPRESS, <br />
STATUTORY, IMPLIED OR OTHERWISE, INCLUDING WITHOUT LIMITATION ANY WARRANTY OF MERCHANTABILITY, <br />
FITNESS FOR A PARTICULAR PURPOSE OR INFRINGEMENT. NO ORAL OR WRITTEN INFORMATION OR ADVICE GIVEN <br />
TO YOU BY ANY EMPLOYEE, REPRESENTATIVE OR DISTRIBUTOR WILL CREATE A WARRANTY FOR THE SOFTWARE, <br />
AND YOU MAY NOT RELY ON ANY SUCH INFORMATION OR ADVICE.

Notes:
- find out how to make project as a library so other people can simply download package
  and place it in their working directory
    - test out ^
    - continuing development at a later date after full java fundamentals learned