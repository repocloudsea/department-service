#!/bin/bash
set -x # Show the output of the following commands (useful for debugging)
#sshpass -p voda*141# StrictHostKeyChecking=no sftp root@139.59.33.41:home/travis/.m2/repository/com/cloudsea/services/department-service/0.0.1-SNAPSHOT/department-service-0.0.1-SNAPSHOT.jar root
##rsync -e ssh file root@139.59.33.41:/home/cls-repo -StrictHostKeyChecking=no
touch Sftp_testfile.txt
pwd
sshpass -p voda*141# StrictHostKeyChecking=no
sftp root@139.59.33.41 <<!
put Sftp_testfile.txt
pwd
bye
!
#sshpass -p voda*141# StrictHostKeyChecking=no sftp root@139.59.33.41:/root Sftp_testfile.txt
