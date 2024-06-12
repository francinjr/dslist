# Projeto DSList - Intensivão Java Spring
Projeto desenvolvido durante o evento *__Intensivão Java Spring__* oferecida pela [DevSuperior](https://devsuperior.com.br). O evento foi ministrado por Nelio Alves. O projeto se trata de uma REST API para organizar coleções de games de forma prática.

## Tecnologias
- Java 17
- Spring Boot 3
- JPA e Hibernate
- PostgreSQL

## Modelo de domínio DSList
![Modelo de domínio DSList](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

## Informações da API

### URL base

```https
  http://localhost:8080/dslist/

```

### Endpoints
#### Listar games cadastrados

```https
  GET /games

```


#### Buscar game cadastrado pelo id

```https
  GET /games/{id}

```


#### Listar coleções de games cadastrados

```https
  GET /lists

```


#### Buscar uma coleção de games cadastrados pelo id da lista

```https
  GET /lists/{id}/games

```


#### Mudar a posição do game dentro de uma lista de games

```https
  POST /lists/{id}/replacement

```
