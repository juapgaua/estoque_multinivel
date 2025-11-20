# Sistema de Estoque Multinível em Java

Sistema didático desenvolvido em Java para demonstrar o uso de armazenamento associativo multinível usando estrutura de dados com Map → Map → Map, permitindo localizar produtos dentro de um grande armazém de forma rápida e eficiente.

Este projeto segue boas práticas de programação, modularização, TADs e um .main minimalista que apenas chama o método principal de execução.

## Funcionalidades

- Cadastro de produtos usando código de barras como chave única
- Estrutura de armazém organizada por:
- Nível
- Corredor
- Prateleira
- Associação chave → localização
- Busca eficiente pela localização completa de um produto
- Visualização de toda a estrutura do armazém
- Menu interativo no console

## Conceitos Trabalhados

- Armazenamento associativo
- Mapas aninhados (multinível)
- Modularização em Java
- TADs aplicados a modelos de dados
- Separação de responsabilidades
- Entrada e saída de dados
- Boas práticas no design de classes

## Estrutura Multinível

O armazém é representado da seguinte forma:

Map<Nível, Map<Corredor, Map<Prateleira, List<Códigos>>>>  


Exemplo:

Nível 1  
 └── Corredor A  
       └── Prateleira 3 → [PROD1001, PROD6006]  

## Estrutura de Pastas
  src/  
       ├─ Main.java -> Contém apenas o main.  
       ├─ ExecutarPrograma.java -> Classe responsável por iniciar o sistema.   
       ├─ Menu.java -> Interface no console para interação com o usuário.  
       ├─ Armazem.java -> Estrutura multinível + índice auxiliar para busca rápida.  
       └─ ProdutoLocalizacao.java -> Modela a localização de um produto.  

Ao rodar, o menu aparecerá no terminal com as opções:

<img width="469" height="154" alt="image" src="https://github.com/user-attachments/assets/241c305c-7e58-40cf-a4be-b20828c569ab" />

## Objetivo Didático

Este projeto foi criado para estudos de:

- Algoritmos
- Estruturas de Dados
- TAD (Tipos Abstratos de Dados)
- Java básico com foco em boas práticas
- Aplicado a um exemplo realista de logística e estoque.

## Autoria
Desenvolvido por Juliana Apgaua Sant'Ana Vidigal

