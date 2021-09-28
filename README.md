
![](./img/springboot-react.svg)

Spring Boot with React Example
====================================

This is an example of using a [Spring Boot](https://spring.io/projects/spring-boot)
application with [React](https://reactjs.org/).

## Prerequisites
 - Java
 - Maven
 - Node.js

## Server
The `server` module contains the Spring Boot REST service. It has `/book`
endpoint which returns a list of books. The backend consist of an embedded
H2 database.

### Build
To build the project, execute `mvn clean install` command from the `server` directory:

```
$ mvn clean install
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------< com.basaki:springboot-react-example >-----------------
[INFO] Building springboot-react-example 1.0.0
[INFO] --------------------------------[ jar ]---------------------------------
...
[INFO] --- maven-install-plugin:2.4:install (default-install) @ springboot-react-example ---
[INFO] Installing /Users/indra/springboot-react-example/server/target/springboot-react-example-1.0.0.jar to /Users/indra/.m2/repository/com/basaki/springboot-react-example/1.0.0springboot-react-example-1.0.0.jar
[INFO] Installing /Users/indra/examples/springboot-react-example/server/pom.xml to /Users/indra/.m2/repository/com/basaki/springboot-react-example/1.0.0/springboot-react-example-1.0.0.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 7.205 s
[INFO] Finished at: 2021-09-25T20:13:01-07:00
[INFO] ------------------------------------------------------------------------

```
If the build is successful, it should create a new Spring Boot jar named 
`spingboot-react-example-1.0.0.jar` in the `server/target` directory.

### Run
To run the Spring Boot application, execute the 
`java -jar target/springboot-react-example-1.0.0.jar` command from 
the `server` directory,

```
$ java -jar target/springboot-react-example-1.0.0.jar

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.4)

2021-09-25 20:21:44.204  INFO 83896 --- [           main] com.basaki.react.Application             : Starting Application using Java 11.0.8 on Indra-Mac.local with PID 83896 (/Users/indra/Development/examples/springboot-react-example/server/target/springboot-react-example-1.0.0.jar started by indra in /Users/indra/Development/examples/springboot-react-example/server)
2021-09-25 20:21:44.208  INFO 83896 --- [           main] com.basaki.react.Application             : No active profile set, falling back to default profiles: default
...
2021-09-25 20:21:48.240  INFO 83896 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2021-09-25 20:21:49.027  INFO 83896 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2021-09-25 20:21:49.038  INFO 83896 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2021-09-25 20:21:49.495  WARN 83896 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2021-09-25 20:21:50.614  INFO 83896 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2021-09-25 20:21:50.625  INFO 83896 --- [           main] com.basaki.react.Application             : Started Application in 7.138 seconds (JVM running for 7.858)
Book(id=1, name=To Kill a Mockingbird)
Book(id=2, name=The Catcher in the Rye)
Book(id=3, name=The Outsiders)
Book(id=4, name=Harry Potter and the Sorcerer's Stone)
Book(id=5, name=Charlotte's Web)
Book(id=6, name=David Copperfield)
Book(id=7, name=The Secret Life of Bees)
```
Once the application is running, you can access the `http://localhost:8080/books` 
endpoint from any browser. You should get the following result,

```json
[
   {
      "id":1,
      "name":"To Kill a Mockingbird"
   },
   {
      "id":2,
      "name":"The Catcher in the Rye"
   },
   {
      "id":3,
      "name":"The Outsiders"
   },
   {
      "id":4,
      "name":"Harry Potter and the Sorcerer's Stone"
   },
   {
      "id":5,
      "name":"Charlotte's Web"
   },
   {
      "id":6,
      "name":"David Copperfield"
   },
   {
      "id":7,
      "name":"The Secret Life of Bees"
   }
]

```

## Client
The `client` module contains all the React related code. The project was created
using `Creatc React App` by executing the following command 
`npx create-react-app client` from the `springboot-react-example` folder.

This Recat application makes a call to the `books` endpoint, as mentioned earlier
in the `server` module.

### Run
To the run the React application, navigate to the `client` directory and
execute `npm start`,

```
$ npm start

> client@0.1.0 start /Users/indra/springboot-react-example/client
> react-scripts start

ℹ ｢wds｣: Project is running at http://192.168.4.22/
ℹ ｢wds｣: webpack output is served from 
ℹ ｢wds｣: Content not from webpack is served from /Users/indra/springboot-react-example/client/public
ℹ ｢wds｣: 404s will fallback to /
Starting the development server...
Compiled successfully!

You can now view client in the browser.

  Local:            http://localhost:3000
  On Your Network:  http://192.168.4.22:3000

Note that the development build is not optimized.
To create a production build, use npm run build.
```

This should start up the client application. It can be viewed in the browser
by typing `http://localhost:3000`