#!/bin/bash
set -x # Show the output of the following commands (useful for debugging)
sftp -o StrictHostKeyChecking=no sshpass -voda*141# root@139.59.33.41:target/*.jar /home/cls-repo
#rsync -e ssh file root@139.59.33.41:/home/cls-repo -StrictHostKeyChecking=no
