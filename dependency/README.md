# Steps

1. Create module `dependency`

2. Build executable `jar`
```shell
./gradlew :dependency:build
```

3. Run executable
```shell
java -cp dependency/build/libs/dependency-1.jar org.gradledemo.dependency.Dependency
```

4. Add dependency `org.apache.commons.commons-math3:3.6.1`

5. Use dependency with `Prime.isPrime` API

6. Build executable `jar`
```shell
./gradlew :dependency:build
```

7. Run executable
```shell
java -cp dependency/build/libs/dependency-1.jar org.gradledemo.dependency.Dependency
```

8. Fix failure by creating a fat jar
Uncomment fat jar code in `build.gradle.kts`
