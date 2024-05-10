📘Proyecto realizado con Java, Maven, Selenium, Serenity, Cucumber y Junit. (Valida que no estes usando vpn o proxy para que automaticamente se pueda descargar las dependencias del POM.xml.)

📘Patron de Diseño: POM-SerenityBDD   

📝Vesion JDK necesario:
JDK 17.0.8
Link: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

📝Version Chromedriver necesario:
124.0.6367.201 (r1274542)
Link: https://googlechromelabs.github.io/chrome-for-testing/#stable
Descargar, pegar y reemplazar en la ruta predeterminada C:\Users\$User$\.cache\selenium\chromedriver\win32\"laversionquetengas"\

El proyecto está redactado en gherkin utilizando cucumber y genera nombres de usuario diferentes en cada ejecución.

Ademas genera un reporte desde maven Goal(mvn serenity:aggregate) tomando capturas de cada paso realizado.
![image](https://github.com/BrandLuna/prueba_automation-encora-bl/assets/85650103/b17fbad9-7e9d-41ff-bb29-4c1862713dc4)
![image](https://github.com/BrandLuna/prueba_automation-encora-bl/assets/85650103/7e0a76fd-18f4-4909-9246-f8fb61e09e47)

Evidencia de funcionamiento:
![Captura de pantalla 2024-05-09 160216](https://github.com/BrandLuna/prueba_automation-encora-bl/assets/85650103/df82b41f-8bf5-4409-a9f0-35d040efd620)






