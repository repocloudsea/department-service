#!/bin/bash
set -x # Show the output of the following commands (useful for debugging)
sftp -o StrictHostKeyChecking=no sshpass -p voda*141# root@139.59.33.41:home/travis/build/repocloudsea/department-service/target/*.jar /home/cls-repo/
##rsync -e ssh file root@139.59.33.41:/home/cls-repo -StrictHostKeyChecking=no
