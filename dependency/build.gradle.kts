plugins {
    id("org.gradledemo.kotlin-library-conventions")
}

group = "org.gradledemo"
version = "1"

dependencies {
    // Types: https://www.baeldung.com/gradle-dependency-management
    implementation("org.apache.commons:commons-math3:3.6.1")
}

// Fat Jar config. Reference: https://gist.github.com/trevorwhitney/935cede21ec51879e97610f80aedcfc6
// tasks.jar {
//     manifest {
//         attributes["Main-Class"] = "org.gradledemo.dependency.Dependency"
//     }
//     configurations["compileClasspath"].forEach { file: File ->
//         from(zipTree(file.absoluteFile))
//     }
//     duplicatesStrategy = DuplicatesStrategy.INCLUDE
// }
