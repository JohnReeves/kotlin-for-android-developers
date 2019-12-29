# echo Hello World
echo off

kotlinc hello.kt -include-runtime -d hello.jar
java -jar hello.jar

