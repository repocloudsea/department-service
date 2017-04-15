#!/bin/bash
set -x # Show the output of the following commands (useful for debugging)
#sshpass -p voda*141# StrictHostKeyChecking=no sftp root@139.59.33.41:home/travis/.m2/repository/com/cloudsea/services/department-service/0.0.1-SNAPSHOT/department-service-0.0.1-SNAPSHOT.jar root
##rsync -e ssh file root@139.59.33.41:/home/cls-repo -StrictHostKeyChecking=no
echo "Test File from Travis : NEw" >> Sftp_testfile.txt
echo "put Sftp_testfile.txt" >> sftp_command
echo "pwd" >> sftp_command
echo "ls" >> sftp_command
echo "bye" >> sftp_command
ls Sftp_testfile.txt sftp_command
cat sftp_command
which sshpass
cd
pwd
echo "|1|GICxuhbU1TxOsM+uToSFa9BLQs0=|3yuAMbtUuVRlYRRZdYPzw9Qq8GY= ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBFP7XY1knPTKcVHMGMuQb8U3fGYYitRcrkQ+krBgSlt5dYuL/vgNT+Pa7wSUqVLhHVtd3ztpX5f6NrRw5VYaZrY=
|1|iwLcHHmdQ7AbToRVeJmfBFvrQMo=|H6zWNKh0OpqmeMuyjpoLQHX60ac= ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBCpsYuZf42KZUWY1VRhcirltFZJDi3ZAa7UtBfRu7K2pgkeBdhZ1lzoB8+CRKTWsktWq50f/1ToGwxVpaS6bxs4=
|1|49uA55PTZjWtx3a9ITA6FFg0fa8=|Edf6nnG/uZbUkmGQN0/H1DNlPWI= ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBLqZcR4jiHqxImtBglHDrkLgRSI9lGPYyYx1/kp+YzxtI4WxG8s8bqqrD+6SYzJUqHTtLB27+A1ui+LenmcBRKU=
" >> .ssh/known_hosts
cat .ssh/known_hosts
/usr/bin/sshpass -p voda*141#  sftp -oBatchMode=no  -b sftp_command root@139.59.33.41 

#sshpass -p voda*141# StrictHostKeyChecking=no sftp root@139.59.33.41:testfile_demo .

