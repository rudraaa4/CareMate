# CareMate

A backend-first medication management platform, built to learn Spring Boot
while solving a real problem: helping patients track medicines, schedules,
and adherence.

This project is being built in clearly scoped versions rather than all at
once — see "Roadmap" below.

## Tech Stack

- Java 26
- Spring Boot 3.x
- Spring Security
- Spring Data JPA (Hibernate)
- PostgreSQL
- Maven
- REST APIs (tested via Postman)

## Current Progress — Version 1 (Core CareMate)

- [x] Project setup (Spring Boot + PostgreSQL connected)
- [x] User entity + registration endpoint (`POST /api/auth/register`)
- [x] Password hashing with BCrypt
- [ ] Login with JWT authentication
- [ ] Medicine CRUD (create, view)
- [ ] Medication scheduling
- [ ] Mark scheduled dose as taken

## Roadmap

**V1 — Core CareMate** (in progress)
Auth, medicine CRUD, schedules, mark-as-taken. No AI yet — pure CRUD +
relational data modeling done right.

**V2 — Smart CareMate** (planned)
Prescription OCR, AI-assisted medicine extraction, adherence analytics.

**V3+ — Connected CareMate** (future)
Caregiver accounts, doctor accounts, hospital integration.

## Why this project

Most medicine-reminder apps are simple alarms. CareMate is designed as a
closed-loop system: prescription → schedule → reminder → confirmation →
adherence tracking → caregiver/doctor visibility — built one honest,
tested version at a time rather than as an unfinished sprawling feature
dump.

## Running locally

1. Clone the repo
2. Create a PostgreSQL database named `caremate`
3. Set your DB credentials in `src/main/resources/application.properties`
4. Run `CarematebackendApplication`
5. Test endpoints via Postman at `http://localhost:8081/api/...`
