# StudentCourseManagerApplication

[![Java CI with Maven](https://github.com/thales32k0/StudentCourseManager/actions/workflows/maven.yml/badge.svg)](https://github.com/thales32k0/StudentCourseManager/actions/workflows/maven.yml)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)](https://spring.io/)
[![Java](https://img.shields.io/badge/Java-17-orange.svg?style=flat&logo=java)](https://www.java.com/en/)
[![H2 Database](https://img.shields.io/badge/H2%20Database-In--Memory-blue.svg?logo=h2&logoColor=white)](http://www.h2database.com/html/main.html)
[![Maven Central](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-starter-web.svg?label=Spring%20Web)](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web)
[![Maven Central](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-starter-data-jpa.svg?label=Spring%20Data%20JPA)](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Este projeto é uma aplicação Spring Boot para gerenciar estudantes e seus respectivos cursos.

## Tecnologias Utilizadas

* **Spring Web**: [![Maven Central](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-starter-web.svg?style=flat-square)](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web) Para construção da API REST.
* **Spring Data JPA**: [![Maven Central](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-starter-data-jpa.svg?style=flat-square)](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa) Para persistência de dados utilizando o padrão JPA.
* **H2 Database**: [![H2 Database](https://img.shields.io/badge/H2%20Database-In--Memory-blue.svg?style=flat-square&logo=h2&logoColor=white)](http://www.h2database.com/html/main.html) Banco de dados em memória para desenvolvimento e testes.
* **Validation**: Para realizar validações de dados através de anotações (`@Name`, `@Email`, etc.).
* **Lombok** (Opcional): Biblioteca Java para reduzir a quantidade de código boilerplate (getters, setters, construtores, etc.).

## Pré-requisitos

* Java Development Kit (JDK) instalado (versão 17 recomendada).
* Maven instalado (gerenciado pelo Spring Initializr no IntelliJ Community).
* IntelliJ Community Edition (ou outra IDE de sua preferência).

## Como Executar

1.  Clone este repositório (se aplicável):
    ```bash
    git clone [https://github.com/thales32k0/StudentCourseManager.git](https://github.com/thales32k0/StudentCourseManager.git)
    ```
2.  Abra o projeto no IntelliJ Community.
3.  O Spring Boot automaticamente gerenciará as dependências listadas no `pom.xml`.
4.  Execute a classe principal `StudentCourseManagerApplication`.

A aplicação estará disponível em `http://localhost:8080`.

## Próximos Passos (Opcional)

* Implementar os endpoints da API REST para gerenciar estudantes e cursos (e.g., `/students`, `/courses`).
* Criar as entidades JPA (`Student`, `Course`) e seus relacionamentos (e.g., um estudante pode se inscrever em vários cursos).
* Definir os repositórios JPA (`StudentRepository`, `CourseRepository`) para interação com o banco de dados.
* Adicionar as validações necessárias nos modelos utilizando as anotações do `Validation`.
* Implementar serviços (`StudentService`, `CourseService`) para a lógica de negócios.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## 👨‍💻 Autor
<table>
  <tr>
    <td><img src="https://avatars.githubusercontent.com/u/89024257?v=4" width="100"/></td>
    <td>
      <b>Thales Eduardo</b><br/>
      Aprendiz de tecnologia focado em Java ☕<br/>
      <a href="https://github.com/thales32k0">GitHub</a>
    </td>
  </tr>
</table>

## Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
