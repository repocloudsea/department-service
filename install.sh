#!/bin/bash
set -x # Show the output of the following commands (useful for debugging)
openssl aes-256-cbc -K $encrypted_7a321610dde2_key -iv $encrypted_7a321610dde2_iv -in id_rsa.enc -out id_rsa -d
chmod 600 id_rsa
mv id_rsa ~/.ssh/id_rsa
apt-get install sshpass
