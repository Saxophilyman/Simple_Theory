Прежде всего я оставляю ссылки на документацию, а после просто фиксирую наиболее понятные и значимые на мой взгляд моменты.
https://docs.spring.io/spring-boot/reference/features/logging.html#features.logging

По умолчанию предусмотрены конфигурации для Java Util Logging, Log4j2 и Logback. В каждом случае логгеры предварительно настроены на использование вывода в консоль, при этом также доступен вывод в файл.
  
Журналирование в файл
Мы можем записывать наши журналы в файл, установив только одно из свойств 
logging.file.name
или 
logging.file.path 
в нашем application.properties. 
По умолчанию для вывода в файл установлен уровень журнала info.
Если заданы оба свойства, только logging.file.nameвступает в силу.

Logback стартер является частью стартера Spring Boot по умолчанию. 
Мы можем заменить его на реализации log4j или java util, включив их стартеры и исключив стартер по умолчанию spring-boot-starter-loging в pom.xml:
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <exclusions>
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-logging</artifactId>
        </exclusion>
    </exclusions>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-log4j2</artifactId>
</dependency>
