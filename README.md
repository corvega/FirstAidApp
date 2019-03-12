# FirstAidApp

## Code

We are going to have to make a Gradle project to be able to do this. This is because the gradle project allows for the
importing of external dependencies and the one we need is `implementation 'org.mariadb.jdbc:mariadb-java-client:2.1.2'`.

- Database

  - Init database
  - Connect to the database
  - Test the database
  - Add lessons, Quiz, etc
    - No sql injection
  - Remove

- Other Backend
  - Score calculating

- Front-end

  - Move between menus
  - Animations
  - Database get the lesson, quiz, test, etc data.
    - Parsed from the database.
  - Need to have a menu system. Would have to be done for each section. For example lessons.
    - Need to pull from the database and create buttons to select the lessons.
      - This could either be pages or a scrolling mechanism.

- Testing
  - Q unit test
    - Databases
      - Create
      - Fetch
      - Delete
      - SQL injection

Regards to testing we have to test the cases which should return valid and also inputs that should not be valid.
