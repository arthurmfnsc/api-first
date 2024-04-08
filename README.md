Se trata de un repositorio creado para ejercitar contenidos del curso De 
DevOps a DevSecOps: seguridad en los procesos da [IEBS](https://www.iebschool.com/).

El proyecto en sí es una implementación API-First que utiliza Java, 
Springboot y Gradle. A través de una especificación OpenAPI, se genera una interfaz 
Java para que los controladores creados estén alineados con la especificación API 
propuesta en la carpeta **build**.

```
.
├── build
│     └── generate-resources
│           └── main
│               ├── pom.xml
│               ├── README.md
│               └── src
│                   └── main
│                       └── java
│                           └── org
│                               └── openapitools
│                                   ├── api
│                                   │     ├── ApiUtil.java
│                                   │     └── BatidasApi.java
│                                   └── model
│                                       ├── Mensagem.java
│                                       └── Momento.java
├── build.gradle.kts
├── gradle
│     └── wrapper
├── gradle.properties
├── gradlew
├── gradlew.bat
├── plugins
│     ├── java.gradle
│     └── openapi.gradle
├── README.md
├── settings.gradle.kts
└── src
    ├── main
    │     ├── java
    │     │     └── com
    │     │         └── arthurfnsc
    │     │             └── apifirst
    │     │                 ├── ApiFirstApplication.java
    │     │                 └── rest
    │     │                     └── FolhaPontoController.java
    │     └── resources
    │         ├── application.properties
    │         └── openapi
    │             └── folha_ponto-api.yaml
    └── test
        └── java
```

Para generar la interfaz, ejecute el siguiente comando:

```
./gradlew clean compileJava
```

Aunque el curso está dirigido a los pasos de DevSecOps, no tengo la experiencia para 
definir el mejor enfoque para las herramientas SAST, DAST y definir el sombreado entre 
opciones, por lo que agregué varias GithubActions para validar algunos conceptos en la 
pipeline.

Algunas de ellas nunca he trabajado antes como Codacy, CodeQL, Contrast, Crunch42, 
Dependency review, devskim, mobsf, scorecard, semgrep y SooS.

En el futuro, el repositorio puede sufrir cambios no necesariamente relacionados con la 
parte de seguridad, pero la pipeline de CI/CD y el contexto de seguridad permanecerán. 
Debido a que agregaste varias GithubActions en confirmaciones futuras, es posible que 
algunas de ellas se modifiquen sean eliminadas.

El proyecto usa otra [configuración de seguridad de GitHub](https://github.com/arthurmfnsc/api-first/security).

## TODO

- [ ] Añadir plugin [OWASP Dependency Check](https://jeremylong.github.io/DependencyCheck/dependency-check-gradle/index.html)
- [ ] Añadir plugins de Docker después de crear el Dockerfile del proyecto.
  Algunos plugins que serán validados son: [anchore-syft](https://github.com/anchore/syft),
  [snyk containers](https://snyk.io/pt-BR/product/container-vulnerability-management/) y otros
- [ ] Configurar plugin Cotrast Community: Problema con la ruta serif
- [ ] Configurar plugin PMD: Problema con propriedad browser_download_url
- [ ] Configurar plugin Snyk Security: Problema con serif
- [ ] Configurar plugin SonarCloud: Añadir variables secreta SONAR_TOKEN
- [ ] Configurar plugin SOOS: Añadir variables secreta
