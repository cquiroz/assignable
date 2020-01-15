This is a reproduction of differences between JVM/JS in 0.6.x and 1.0.0-RC2

When running on the JVM
```
sbt:assignable> rootJVM/run
[info] Compiling 1 Scala source to /Users/cquiroz/Projects/assignable/.jvm/target/scala-2.13/classes ...
[info] running Main
java.lang.Character: true
java.lang.Integer: true
java.lang.Long: true
```

On JS with 0.6.31
```
sbt:assignable> rootJS/run
[info] Compiling 1 Scala source to /Users/cquiroz/Projects/assignable/.js/target/scala-2.13/classes ...
[info] Fast optimizing /Users/cquiroz/Projects/assignable/.js/target/scala-2.13/assignable-fastopt.js
[info] Running Main
java.lang.Character: true
java.lang.Integer: true
java.lang.Long: true
```

On JS with 1.0.0-RC2
```
sbt:assignable> rootJS/run
[info] Compiling 1 Scala source to /Users/cquiroz/Projects/assignable/.js/target/scala-2.13/classes ...
[info] Fast optimizing /Users/cquiroz/Projects/assignable/.js/target/scala-2.13/assignable-fastopt.js
[info] Running Main. Hit any key to interrupt.
java.lang.Character: false
java.lang.Integer: true
java.lang.Long: false
```
