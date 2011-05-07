#!/bin/bash

jars=(`ls ./lib/`)
cp="./bin"
for jar in ${jars[*]};
do
   cp=$cp":./lib/"$jar
done 
/home/$USER/local/jdk/bin/java -cp $cp mybridge.server.MyBridgeServer
echo $cp
