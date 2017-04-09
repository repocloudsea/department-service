#!/bin/bash
set -x # Show the output of the following commands (useful for debugging)
  
sftp root@139.59.33.41:target/*.jar /home/cls-repo
