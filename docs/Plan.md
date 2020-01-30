### Перечень используемых инструментов с обоснованием выбора
* Среда разработки: __IntelliJ IDEA.__ Оптимальный инструмент для продуктивной разработки кода и написания тест-кейсов. Позволяет работать как в интерактивном режиме, так и из консоли, а также легко подключает необходимые библиотеки.
* Язык программирования: __Java8__. Восьмая версия наиболее распространенного языка программирования. Программы и тест-кейсы написанные на Java имеют независимость от операционной системы и оборудования.
* Инструмент тестирования: __JUnit Jupiter 5__. Библиотека для модульного тестирования программного обеспечения на языке Java.
* Инструмент для автоматизации действий веб-браузера: __Selenide__. Фреймворк, построенный на базе Selenium WebDriver, имеющий удобный синтаксис, в котором наиболее часто выполняемые операции - автоматизированы.
* Инструмент генерации тестовых данных: __Faker__. Библиотека с удобным синтаксисом, позволяющая генерировать случайные данные, необходимые для заполнения веб-форм.
* Иструмент управления базами данных __MySQL__ и __PostgreSQL__. Наиболее распространенные системы управления базами данных с открытым исходным кодом. 
* Инструмент виртуализации __Docker__. Позволяет виртуализировать необходимое программное обеспечение не отнимая ресурсов оборудования. Поддерживает контейнеризацию. 
* Инструмент построения отчетов автотестов: __Allure Framework__. Фреймворк позволяет легко создавать наглядные веб-отчеты из которых можно извлечь максимум полезной информации о проведенном тестировании.
* Хостинг готового проекта: __GitHub__. Веб-сервис GitHub наиболее распространен в среде разработчиков, имеет удобный интерфейс, бесплатен для проектов с открытым исходным кодом. 
---
### Перечень и описание возможных рисков при автоматизайии
* Сложности с пониманием логики работы SUT в связке с базами данных.
* Сложности с подключением к SUT системы управления базами данных _MySQL_ и _PostgreSQL_ через _Docker_.
* Сложности с поиском уникальных атрибутов элементов веб-формы необходимых для имитации работы пользователя.
* Необходимость создания дополнительных тест-кейсов для вновь обнаруженных багов в процессе проведения тестирования.
* Отсутствие достаточности времени для полноценной проработки проекта в связи с основным местом занятости (возможные временные затраты для проекта - не более четырех часов в день).
* Возможность работы с проектом только имея выход в сеть интернет. 
---
### Интервальная оценка с учетом рисков
* С учетом рисков - 50 часов.
---
### План сдачи работ
1. Написание тестов до 29 января
1. Предоставление отчетов до 5 февраля