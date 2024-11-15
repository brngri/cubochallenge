<h1 align="center">🧊 Cubochallenge
</h1>



![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)  ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)  ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white) ![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)

## Resumo

Resolvendo o desafio, parte back-end: https://github.com/cubonetwork/fullstack-challenge#back-end 

## Tecnologias

- **Linguagens**:  Java
- **Frameworks**: Spring Boot
- **Banco de Dados**: MySQL e H2 (testes)
- **Outras ferramentas**: Git, Docker e Postman

## Práticas Adotadas

- **Testes Automatizados**: Implementação de testes unitários e de integração para garantir a qualidade do código.
- **Versionamento de Código**: Utilização do Git para controle de versões e colaboração.
- **Documentação**: Manutenção de documentação clara e detalhada para facilitar a compreensão e uso da aplicação.
- Consultas com Spring Data JPA
- Geração automática do Swagger 
- API REST
- **Containerização com Docker**: Utilização do Docker para containerizar a aplicação, garantindo um ambiente consistente e isolado para desenvolvimento e produção.
  

## Como Executar a Aplicação

### Pré-requisitos

- [Docker](https://www.docker.com/get-started)
- [Postman](https://www.postman.com/downloads/)
- [Maven](https://maven.apache.org/download.cgi): Como instalar -> https://www.youtube.com/watch?v=rfhTnfbBQcY

### Passos para Executar

1. **Clone o repositório:**
```bash
  https://github.com/brngri/cubochallenge.git
```
2. **Modificações na app:**
   - No arquivo docker-compose.yml, mude o caminho que esta no context, conforme esta localizada a pasta na sua máquina
    ![context api cubo](https://github.com/user-attachments/assets/5ac9ea4c-764b-41f3-adff-79c995b2a9dd)

  
3. **Atualizar o app.jar (CMD)**
   - CAMINHO = Onde esta localizada a pasta na sua máquina
   ```cmd
     cd CAMINHO\cubochallenge\cubochallenge 
    ```
    ```cmd
     mvn clean package -DskipTests
    ```
4. **Ligar o Docker Desktop**
   
5. **Iniciar Aplicação (CMD)**
   ```cmd
     docker-compose up -d --build
    ```
    - retorno:


    ![image](https://github.com/user-attachments/assets/2241b0db-5565-4056-8df0-e33a930f2f71)



6. **Abra o postman**
   
#### LISTAR (GET)

URL:
```url
localhost:8080/client/listAll
```

#### CRIAR (POST)

URL:
```url
localhost:8080/client/save
```
Body:
```JSON
{
  "firstName": "teste",
  "lastName": "teste",
  "participation": 78.00
}
````


### Swagger

Você pode acessar o swagger digitando (aplicação deve estar rodando): http://localhost:8080/swagger-ui.html

### phpMyAdmin

Você pode acessar o phpMyAdmin digitando (aplicação deve estar rodando): http://localhost:8000/index.php?route=/&route=%2F&db=client&table=clients
- Usuário: root
- Senha: toor123

### Possivel problema
- Se sua porta 3307 no localhost esta ocupada, mude para uma disponivel no docker-compose.yml, onde esta sublinhado de vermelho. OBS: a porta 3306 não deve ser alterada⚠️


![image](https://github.com/user-attachments/assets/d05c3a35-74db-46f8-b30e-128a66908391)



