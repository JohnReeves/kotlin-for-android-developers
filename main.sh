clear 
echo '+------------------+'
cal
echo '+------------------+'
date +'%d/%m/%Y %H:%M:%S'
echo '+------------------+'
echo
# tutorials & documentation:
# https://kotlinlang.org/docs/tutorials/command-line.html
# https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/

# kotlinc hello.kt -include-runtime -d hello.jar
# including any other javac flags you like
# java -jar hello.jar
# ./path-to-sample/sample

# intro=$PWD/"01 Preliminaries/01 Introduction"

echo "building: "
echo '+------------------+'
echo "hello.kt"
echo '+------------------+'
echo "binaries in ./Results"
echo '+------------------+'

kotlinc hello.kt -include-runtime -d hello.jar

java -jar hello.jar
