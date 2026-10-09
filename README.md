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
src/main/java/org/prog/session1..12   Java fundamentals (instructor examples + homework)
src/test/java/org/prog/session13..20  Test automation (TestNG/JUnit, Selenium, REST, JDBC, Cucumber)
src/test/resources/features           Cucumber feature files
src/test/resources/testng.xml         Suite executed by `mvn test`
docker/selenium_grid                  Selenium Hub + Chrome node
docker/mysql                          MySQL for DB tests (+ table.sql)
docker/jenkins, docker/jenkins_local  Jenkins setups
```

> `src/HomeWork3.java`, `src/HomeWork10`, `src/HomeWork12` and `src/org/prog/HomeWork8` are early
> homework files kept in their original location; they are outside the Maven source roots and are not compiled.

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

| Branch | Topic |
|---|---|
| `home_work_2` | Variables and `if / else` — can I buy the phone? |
| `HomeWork3` | Arrays and loops — fill an array in reverse |
| `HomeWork4` | Arrays — bubble sort of random numbers |
| `HomeWork5` | OOP basics — `Plane` and `Boarding` classes |
| `HomeWork6` | Strings — filtering valid e-mail addresses |
| `HomeWork8` | OOP — inheritance and abstraction (`IPhone`, `Apple`, `Android`) |
| `HomeWork10` | Custom exceptions in `equals` / `hashCode` |
| `HomeWork12` | Collections — `Map` / `Set` of phones and contacts |
| `TestHomeWork13` | JUnit 5 parameterized tests |
| `TestHomeWork14` | First Selenium UI test (allo.ua) |
| `TestHomeWork15` | Selenium — finding elements and locators |
| `TestHomeWork16` | Page Object pattern |
| `TestHomeWork17` | Saving scraped data to MySQL via JDBC (DTO + DB store) |
| `TestHomeWork18` | Cucumber — feature file, page object and steps |
| `TestHomeWork19` | Cucumber + Maven + Jenkins — UI + DB scenario combined |
