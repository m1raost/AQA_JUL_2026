# AQA JUL 2026 — Java Test Automation

Hands-on project built during the **QA Automation (Java)** course at **Prog Academy**.
It started from a base framework provided by the instructor; the homework for each
session (plain Java exercises first, then test automation) was added on top of it.
The course progresses from Java fundamentals to a full UI + DB test pipeline running in Docker and Jenkins.

## Tech stack

| Area | Tools |
|---|---|
| Language / build | Java 17, Maven |
| Test frameworks | TestNG, JUnit 5 (parameterized tests) |
| UI automation | Selenium WebDriver, Selenium Grid (Docker), Page Object pattern |
| API testing | REST Assured, Jackson |
| Database | MySQL, JDBC |
| BDD | Cucumber (feature files + step definitions, TestNG runner) |
| Reporting | Allure, Cucumber reports |
| Infrastructure | Docker Compose, Jenkins |
| Other | Lombok |

## Project layout

```
src/main/java/org/prog/session1..12   Java fundamentals (instructor's examples)
src/main/java/org/prog/homework/      My Java homework, one package per task (hw02 ... hw12)
src/test/java/org/prog/session13..20  Instructor's test automation examples
src/test/java/org/prog/homework/      My test homework, one package per task (hw13 ... hw19)
src/test/resources/features           Cucumber feature files
src/test/resources/testng.xml         Suite executed by `mvn test`
docker/selenium_grid                  Selenium Hub + Chrome node
docker/mysql                          MySQL for DB tests (+ table.sql)
docker/jenkins, docker/jenkins_local  Jenkins setups
```

## How to run

Prerequisites: JDK 17, Maven, Chrome (for local runs), Docker (for Grid / MySQL / Jenkins).

```bash
# compile everything
mvn test-compile

# start the infrastructure used by the UI/DB tests
docker compose -f docker/mysql/docker-compose.yaml up -d
docker compose -f docker/selenium_grid/docker-compose.yaml up -d

# run the suite (src/test/resources/testng.xml) with a local Chrome and local MySQL
mvn test -DenvType=local

# default envType is "jenkins": remote Selenium Hub (http://selenium-hub:4444) and MySQL host mysql-db-1,
# i.e. it is meant to run inside the Docker network (see the Jenkins job)
mvn test
```

Notes:
- Tests for sessions 15–20 need a browser and, for the Cucumber/DB scenarios, a running MySQL
  (credentials in the code are the throw-away defaults of the local Docker container).
- The plain Java homework classes can be run directly from the IDE (`main` methods).

## Branches

The homework was done in separate branches (each created from the instructor's `master` at that point
of the course) and then merged into `master`. The branches are kept for history.

| Branch | Topic | Code location |
|---|---|---|
| `home_work_2` | Variables and `if / else` — can I buy the phone? | `main/.../homework/hw02` |
| `HomeWork3` | Arrays and loops — fill an array in reverse | `main/.../homework/hw03` |
| `HomeWork4` | Arrays — bubble sort of random numbers | `main/.../homework/hw04` |
| `HomeWork5` | OOP basics — `Plane` and `Boarding` classes | `main/.../homework/hw05` |
| `HomeWork6` | Strings — filtering valid e-mail addresses | `main/.../homework/hw06` |
| `HomeWork8` | OOP — inheritance and abstraction (`IPhone`, `Apple`, `Android`) | `main/.../homework/hw08` |
| `HomeWork10` | Custom exceptions in `equals` / `hashCode` | `main/.../homework/hw10` |
| `HomeWork12` | Collections — `Map` / `Set` of phones and contacts | `main/.../homework/hw12` |
| `TestHomeWork13` | JUnit 5 parameterized tests | `test/.../homework/hw13` |
| `TestHomeWork14` | First Selenium UI test (allo.ua) | `test/.../homework/hw14` |
| `TestHomeWork15` | Selenium — finding elements and locators | `test/.../homework/hw15` |
| `TestHomeWork16` | Page Object pattern | `test/.../homework/hw16` |
| `TestHomeWork17` | Saving scraped data to MySQL via JDBC (DTO + DB store) | `test/.../homework/hw19 (shared)` |
| `TestHomeWork18` | Cucumber — feature file, page object and steps | `test/.../homework/hw19 (shared)` |
| `TestHomeWork19` | Cucumber + Maven + Jenkins — UI + DB scenario combined | `test/.../homework/hw19` |
