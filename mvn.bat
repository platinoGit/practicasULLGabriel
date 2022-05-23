@echo off
docker run -it --rm -v "C:\ICAP\WorkSpace\JavaTest:/usr/src/mymaven" -v "//c/ic/.m2:/root/.m2" -w /usr/src/mymaven maven:3.8.4-openjdk-11 mvn %*