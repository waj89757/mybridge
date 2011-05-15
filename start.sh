#!/bin/bash

jars=(`ls ./lib/`)
cp="./dest/mybridge.jar"
for jar in ${jars[*]};
do
   cp=$cp":./lib/"$jar
done 
/home/$USER/local/jdk/bin/java -cp $cp mybridge.core.server.MyBridgeServer
