# API POSTS and UPVOTES


## 📦 Práticas

Utilizado Spring Boot seguindo os padrões Rest de Clean code e S.O.L.I.D.

-----------------------------------------------------------------------------

* obs

Lombok (Foi removido (opção minha), mas com a possibilidade de implementar novamente!)

-----------------------------------------------------------------------------

## 🛠️ Ferramentas

 * utilizadas:

* [Intellij](https://www.jetbrains.com/pt-br/idea/) - IDE utilizada
* [SpringBoot](https://spring.io/projects/spring-boot) - Framework Java

-----------------------------------------------------------------------------

# EndPoints Postagens

* GET : http://localhost:8081/postagens  // obter postagens

------------------------------------------------------------------------------

* POST : http://localhost:8081/postagens // salvar uma postagem

* Exemplos de entrada de dados:

{

"descricao": "Aqui seu texto",

"titulo": "aqui seu titulo"

}

# CURTIDAS

* POST : http://localhost:8081/curtir

* Exemplos de entrada de dados:

{

"postId": "Aqui id da postagem",

"curtidas": "valor <1> por requisição"

}



-------------------------------------------------------------------------------
# Banco de dados

* Utilizados e em operação : Postgres
* necessário criar o Banco de dados na sua máquina, 
* mudar o dllauto: para Create pra criar suas tabelas
  ou Habilitar o Banco H2 (--)

------------------------------------------------------------------------------
## 📦 Desenvolvido Por 

* Deusley Diego 

* https://github.com/Deuslleyw

