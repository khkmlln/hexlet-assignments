<<<<<<< HEAD
# Интерфейсы

## main/java/exercise/Home.java

## Задачи

* Реализуйте интерфейс `Home` для работы с недвижимостью. Этот интерфейс содержит два метода:

  * `getArea()` — предназначен для получения общей площади объекта недвижимости.
  * `compareTo()` — Служит для сравнения двух объектов недвижимости по их площади.

## main/java/exercise/Flat.java

* Реализуйте класс `Flat()`, который представляет объект недвижимости — квартиру. Класс должен реализовывать интерфейс `Home`. Конструктор класса принимает на вход три параметра:

  * `area` — жилая площадь квартиры, число типа `double`
  * `balconyArea` — площадь балкона, число типа `double`
  * `floor` — этаж, на котором расположена квартира

   Общая площадь квартиры складывается из жилой площади и площади балкона.

   Метод `toString()` должен возвращать представление квартиры в виде строки формата "Квартира площадью 56 метров на 5 этаже".

   Метод `compareTo(Home another)` в качестве аргумента принимает другой объект недвижимости и сравнивает их по площади. Метод должен вернуть 1, если площадь текущего объекта больше площади переданного; -1, если площадь текущего объекта меньше площади переданного и 0, если площади равны.

  ```java
  Home flat = new Flat(54.5, 4, 3);
  double area = flat.getArea(); // 58.5
  flat.toString(); // "Квартира площадью 58.5 метров на 3 этаже"
  ```

## main/java/exercise/Cottage.java

* Реализуйте класс `Cottage()`, который представляет еще один объект недвижимости — коттедж. Класс должен реализовывать интерфейс `Home`. Конструктор класса принимает на вход два параметра:

  * `area` — Общая площадь коттеджа, число типа `double`
  * `floorCount` — количество этажей

   Метод `toString()` должен возвращать представление коттеджа в виде строки формата "2 этажный коттедж площадью 120.5 метров".

   Метод `compareTo(Home another)` работает аналогично методу в классе `Flat`

  ```java
  Home cottage = new Cottage(135, 2);
  double area = cottage.getArea(); // 135
  cottage.toString(); // "2 этажный коттедж площадью 135 метров"
  ```

## main/java/exercise/App.java

* Создайте класс `App` с публичным статическим методом `buildApartmentsList()`. Метод принимает в качестве первого аргумента список `List` объектов недвижимости, реализующих интерфейс `Home`. Метод сортирует объекты по площади по возрастанию, берет первые n элементов и возвращает  строковые представления этих объектов в виде списка `List`. Количество `n` элементов передаётся в метод `buildApartmentsList()` вторым параметром.

```java
List<Home> apartments = new ArrayList<>(List.of(
    new Flat(41, 3, 10),
    new Cottage(125.5, 2),
    new Flat(80, 10, 2),
    new Cottage(150, 3)
));

List<String> result = App.buildApartmentsList(apartments, 3);
System.out.println(result); // =>
// [
//     Квартира площадью 44.0 метров на 10 этаже,
//     Квартира площадью 90.0 метров на 2 этаже,
//     2 этажный коттедж площадью 125.5 метров
// ]
```

## Самостоятельная работа

* В файле *ReversedSequence.java* реализуйте класс `ReversedSequence`, который реализует стандартный интерфейс java.lang `CharSequence`. Конструктор класса принимает на вход строку. Ваша реализация должна представлять последовательность в перевернутом виде.

```java
CharSequence text = new ReversedSequence("abcdef");
text.toString(); // "fedcba"
text.charAt(1); // 'e'
text.length(); // 6
text.subSequence(1, 4).toString(); // "edc"
```

* Напишите тесты для проверки методов класса `ReversedSequence`.
=======
# Домашние задания

Работа над домашними заданиями происходит на компьютере студента. 

Для каждого домашнего задания мы подготовили отдельный набор файлов. Обычно в нем содержится:

* Текст задачи (файл README) 
* Тесты кода
* Линтер
* Описание зависимостей 
* Пустой файл, в который студент запишет свое решение

Все эти файлы хранятся на нашем Gitlab, а утилита *Hexlet CLI* выступает интерфейсом для работы с этой системой.

## Команды в утилите Hexlet CLI

Утилита вызывается по имени *hexlet*, и содержит несколько команд:

* *assignments init* — создает репозиторий с именем *hexlet-assignments* в профиле студента на Github
    
    В этот репозиторий будут отправляться все домашние задания, которые вы выполняете на Хекслете, независимо от учебной программы. Для всех учебных программ репозиторий будет один. Имя *hexlet-assignments* для репозитория должно быть свободно.

    Одновременно с созданием репозитория команда *assignments init* совершает еще два действия: 
    
    * Создает конфигурационный файл
    * Создает директорию *Hexlet/hexlet-assignments* в домашней директории на компьютере студента

* *assignment download* — скачивает домашнее задание
    
    Эта команда обращается к общей директории *Hexlet/hexlet-assignments* и создает там новые файлы:
    
     * Поддиректорию с именем курса
     * Поддиректорию с домашним заданием
       
    Теперь там будет храниться все необходимое для домашнего задания: файлы для решения, текст задачи, тесты, линтер и прочее. 
    То же самое можно сделать и без команды: надо зайти на страницу домашней работы, найти ссылку на нужное задание и скачать его.
    
* *assignment submit* — отправляет текущее домашнее задание в репозиторий на GitHub

    Выполненное задание нужно отправить на проверку — именно это и делает команда *submit*.
    Она выполняется из локальной директории домашней работы и пушит в ваш удаленный репозиторий все файлы, связанные с текущим заданием. Когда решение студента готово, тесты и линтер локально пройдены, то можно выполнить *submit*. На GitHub также подключены тесты и линтер. 

* *assignment reset* — скачивает новую версию домашнего задания.

    Если уже во время выполнения домашнего задания появляется новая версия упражнения, нужно выполнить *reset*, чтобы повторно скачать ее.

Команды *assignment download* и *assignment reset* создают резервную копию домашнего задания, над которым идет работа. Если выполнить команду *assignment reset* или *assignment download*, то проделанная работа не потеряется. Старая версия с вашими наработками сохранится в новой директории с текущими датой и временем в названии.

### Аргументы

У команд *assignment download* и *assignment reset* есть аргумент *lesson-url*. Ниже мы покажем, как он используется и где взять нужные значения:

* *lesson-url* — адрес урока с домашним заданием. Можно взять его из адресной строки урока или скопировать уже готовую команду для скачивания на странице домашнего задания

### Опции

* *--github-token* – *Personal access token* из GitHub
* *--hexlet-token* – Ваш персональный токен Хекслета

### Использование

Перед тем, как начать работу с домашним заданием, нужно выполнить инициализацию проекта. Это можно сделать с помощью команды *hexlet assignments init*. У нее есть несколько опций:

* *--github-token* – Обязательная. *Personal access token* из GitHub. [Создайте](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token) свой Personal access token [здесь](https://github.com/settings/tokens). При создании токена сделайте его бессрочным и проставьте разрешения на *repo* и *workflow*
* *--hexlet-token* – Обязательная. Ваш персональный токен Хекслета. Этот токен автоматически подставлен в команду на странице домашнего задания
* *--hexlet-dir* – Необязательная. Директория, в которую будут скачиваться домашние задания. По умолчанию это будет директория Hexlet в вашей домашней директории

Перейдите на страницу домашней работы, которую нужно скачать. На странице по ссылке «Инициализация утилиты» идентификатор *hexlet-token* уже подставлен в команду для инициализации:

```bash
hexlet assignments init --github-token=<token from github> --hexlet-token=<your hexlet token>
```

Для инициализации проекта остаётся скопировать команду, вставить свой Personal access token из GitHub и выполнить ее:

```bash
# Можно вызывать из любого каталога

hexlet assignments init --github-token=<token from github> --hexlet-token=<your hexlet token>
```

Инициализацию нужно выполнить один раз перед скачиванием первой домашней работы. Если потребуется изменить расположение локальной директории с домашними работами или восстановить настройки и конфиг локального репозитория, инициализацию нужно выполнить повторно.

Далее можно переходить с выполнению домашней работы. Для команд *assignment download* и *assignment reset* аргументом нужно указать адрес урока с домашним заданием. Адрес урока можно скопировать из адресной строки. Также вы можете взять уже готовую команду на скачивание со страницы домашнего задания:

```bash
# Эта команда скачивает на компьютер домашнее задание с указанным lesson-url
hexlet assignment download https://ru.hexlet.io/courses/java-collections/lessons/lists/assignment_unit
```

```bash
# Если во время выполнения появилась новая версия
# Эта команда скачивает новую версию домашнего задания
# Предыдущую версию и ваши наработки она скопирует в новую директорию
hexlet assignment reset https://ru.hexlet.io/courses/java-collections/lessons/lists/assignment_unit
```

Команда *assignment submit* выполняется без аргументов из директории выполненного домашнего задания или любой его поддиректории:

```bash
# Отправляет выполненное домашнее задание на GitHub
# Выполняются команды git add, commit, push
hexlet assignment submit
```

Если вы хотите вспомнить весь список актуальных команд, можно вывести справочную информацию:

```bash
hexlet assignments --help
```

```bash
hexlet assignment --help
```
>>>>>>> ca07d5eb7379a54f19d5a2487cf66c0cb28941b2
