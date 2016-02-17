@echo off

set "JBOSS_HOME=%CD%\server\wildfly-8.2.1.Final"

echo "starting camunda BPM platform 7.4.0 on Wildfly Application Server 8.2.1.Final"

cd server\wildfly-8.2.1.Final\bin\
start standalone.bat

ping -n 5 localhost > NULL
start http://localhost:8080/camunda-welcome/index.html
 