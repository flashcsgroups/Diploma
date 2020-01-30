

### Порядок запуска тестов

#### Работа с базой данных MySQL
1. Запуск контейнеров MySQL и Node.js
    ```
    docker-compose -f docker-compose-mysql.yml up -d 
    ```

2. Запуск SUT
    ```
    java -Dspring.datasource.url=jdbc:mysql://localhost:3306/app -jar artifacts/aqa-shop.jar
    ```

3. Запуск тестов
    ```
    gradlew test -Dtest.db.url=jdbc:mysql://localhost:3306/app
    ```
   
4. Остановка контейнеров
    ```
    docker-compose -f docker-compose-mysql.yml down
    ```
  
#### Формирование отчета в Allure

```
gradlew clean test allureReport 
gradlew allureServe
```
