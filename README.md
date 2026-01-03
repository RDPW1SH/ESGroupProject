# Projeto Hospitalar - Java

Este projeto é um sistema de gestão hospitalar em Java, com utilizadores (pacientes, médicos, enfermeiros, administradores e farmacêuticos), consultas, exames, escalas e faturas.

O seguinte README.md explica como clonar, configurar e executar o projeto nas IDES **Eclipse** e **VS Code**, usando tanto terminal quanto GitHub Desktop.

---

## Pré-requisitos

Certifica-te de que tens:

- Java JDK 11+ instalado (`java -version` no terminal)
- Git instalado (`git --version`)
- IDE ou editor de código:
  - Eclipse IDE for Java Developers (2022-12 ou superior recomendado)
  - VS Code com extensão **Java Extension Pack**
- Opcional: GitHub Desktop

---

## Passo 1: Clonar o repositório

### Pelo terminal

```bash
# Navegar até à pasta onde colocar o projeto
cd ~/Projetos

# Clonar o repositório
git clone https://github.com/RDPW1SH/ESGroupProject

# Entrar na pasta do projeto
cd gestor-hospitalar

```

### Pelo GitHub Desktop

```bash

Abre o GitHub Desktop.

Clicar em File > Clone Repository > URL.

Copiar e Colar o seguite URL: https://github.com/RDPW1SH/ESGroupProject

Escolher a pasta local para clonar e clicar Clone.

```

## Passo 2: Abrir na IDE

### Utilizando Eclipse IDE

```bash
Abrir o Eclipse.

Clicar em File > Import > Existing Projects into Workspace.

Selecionar root directory e navegar até à pasta clonada.

Confirmar que o projeto aparece selecionado e clicar Finish.

Verificar se não há erros de build. Caso faltem bibliotecas, adicionar o JDK via Project Properties > Java Build Path.

```

### Utilizando VS code

```bash
Abrir o VS Code.

Clicar em File > Open Folder e seleciona a pasta clonada.

Instalar a extensão Java Extension Pack.

VS Code detecta automaticamente o projeto e configura o classpath.
```

Para compilar e correr pelo terminal:

```bash

# Compila todos os ficheiros .java
javac -d bin src/main/java/es_project/*.java

# Executa a aplicação
java -cp bin es_project.Main1
```

Pelo botão "Run" da extensão :

```bash
Abre Main.java.

Clicar no botão Run > Run Java fornecido pela extensão.

A aplicação deve inicializar no terminal integrado.
```

## Login de utilizadores

Exemplo de utilizadores predefinidos no sistema:

Nome Tipo Password
joao Paciente 1234
maria Médico abcd
carlos Enfermeiro enf123
ana Administrador Hospitalar admin123
beatriz Farmacêutico prof123
