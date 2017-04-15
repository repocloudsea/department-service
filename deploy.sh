#!/bin/bash
set -x # Show the output of the following commands (useful for debugging)
#sshpass -p voda*141# StrictHostKeyChecking=no sftp root@139.59.33.41:home/travis/.m2/repository/com/cloudsea/services/department-service/0.0.1-SNAPSHOT/department-service-0.0.1-SNAPSHOT.jar root
##rsync -e ssh file root@139.59.33.41:/home/cls-repo -StrictHostKeyChecking=no
echo "Test File from Travis" >> Sftp_testfile.txt
echo "put Sftp_testfile.txt" >> sftp_command
echo "pwd" >> sftp_command
echo "ls" >> sftp_command
echo "bye" >> sftp_command
ls Sftp_testfile.txt sftp_command
which sshpass
/usr/bin/sshpass -p voda*141#  sftp -oBatchMode=no  -b - root@139.59.33.41  << !
put Sftp_testfile.txt
pwd
ls
bye
!

#sshpass -p voda*141# StrictHostKeyChecking=no sftp root@139.59.33.41:testfile_demo .

