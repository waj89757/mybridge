#!/bin/bash

jars=(`ls ./lib/`)
cp="./dest/mybridge.jar"
for jar in ${jars[*]};
do
   cp=$cp":./lib/"$jar
done 
/home/$USER/local/jdk/bin/java -Xmx1g -Xms1g -Xmn512m -cp $cp mybridge.core.server.MyBridgeServer
