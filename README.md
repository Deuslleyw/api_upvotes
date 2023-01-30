# API REST -  POSTS


## 📦 Práticas

Utilizado Spring Boot seguindo os padrões Rest de Clean code e S.O.L.I.D.

-----------------------------------------------------------------------------

## 🛠️ Ferramentas

 * utilizadas:

* [Intellij](https://www.jetbrains.com/pt-br/idea/) - IDE utilizada
* [SpringBoot](https://spring.io/projects/spring-boot) - Framework Java

-----------------------------------------------------------------------------
## ENDPOINTS


------------------------------------------------------------------------------

    BUSCAR_POSTS

* GET : http://localhost:8081/api/v1/postagens  

------------------------------------------------------------------------------

    POSTAR

* POST : http://localhost:8081/api/v1/postagens 

* Exemplos de entrada de dados:

{

"descricao": "Aqui seu texto",

"titulo": "aqui seu titulo"
   
}

-------------------------------------------------------------------------------
    CURTIDAS

* PATCH : http://localhost:8081/api/v1/curtir/{id_da_postagem}

-------------------------------------------------------------------------------
    EDITPOST

* PUT : http://localhost:8081/api/v1/edit/{id_da_postagem}

-------------------------------------------------------------------------------
    DELETEPOST

* DELETE : http://localhost:8081/api/v1/delete/{id_da_postagem}

-------------------------------------------------------------------------------

## Banco de dados

* Utilizados e em operação : Postgres
* necessário criar o Banco de dados na sua máquina, 
* mudar o dllauto: para Create pra criar suas tabelas
  ou Habilitar o Banco H2 (--)

------------------------------------------------------------------------------
## 📦 Desenvolvido Por 

    * Deusley Diego 

 * https://github.com/Deuslleyw
* Email: Deuslleyw@hotmail.com





