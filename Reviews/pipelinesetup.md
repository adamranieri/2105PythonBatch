1. Create a linux micro ec2
2. run this script
```bat
sudo yum install -y git
sudo yum install -y maven
wget https://downloads.apache.org/tomcat/tomcat-9/v9.0.48/bin/apache-tomcat-9.0.48.tar.gz
tar -xf apache-tomcat-9.0.48.tar.gz
rm apache-tomcat-9.0.48.tar.gz
cd apache-tomcat-9.0.48/webapps
wget https://get.jenkins.io/war-stable/2.289.1/jenkins.war
cd ../bin
./startup.sh
```
3. give a minute or two to wait for jenkins to start
4. access Jenkins via http://ipaddress:8080/jenkins
5. insert the admin password which can be found by doing
```bat
cat /home/ec2-user/.jenkins/secrets/initialAdminPassword
```
6. install suggested plugins
7. create a new free style project
8. Select github project and add project url
9. select git for version control
10. make blank the build branch
11. run build now to see that it clones the directory correctly
12. add build step, execute shell
```bat
cd /home/ec2-user/.jenkins/workspace/{myproject}
mvn package
```
13. go to configure jenkins
14. go to github advanced options
15. find the github webhook url
16. on github go to settings->webhooks
17. add webhook and put that url
