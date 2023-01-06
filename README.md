
  
# Aluvery

![thumb-jetpack-compose-viewmodel](https://user-images.githubusercontent.com/8989346/200027454-8b7d90c5-8d42-4209-83f1-9758efc10448.png)

Simulação de App para delivery de produtos gerais, como alimentos, bebidas etc.

## 🔨 Funcionalidades do projeto

O App é uma extensão da [versão que utiliza um plain object como state holder](https://github.com/alura-cursos/jetpack-compose-gerenciamento-de-estados). A grande diferença é que mantém os estados com o ViewModel em casos que ocorrem a mudança de configuração do Android.

Como funcionalidade visual extra, é possível visualizar a descrição dos produtos filtrados ao realizar o clique, como também, esconder a descrição ao clicar novamente:

![aluvery-dynamic-description](https://user-images.githubusercontent.com/8989346/200887954-54ed61e9-f5d4-4188-92bf-6e8d3620aac2.gif)

## ✔️ Técnicas e tecnologias utilizadas

- `Saveable`: Salvar e recuperar estados do App compatíveis com o Bundle
- `ViewModel`: State Holder especial que lida com a lógica de negócio e mantém o UI state 
- `StateFlow` e `MutableStateFlow`: Ferramentas para implementação uma comunicação reativa entre os componentes do App 

## 📁 Acesso ao projeto

Você pode [acessar o código fonte do projeto](https://github.com/alura-cursos/jetpack-compose-viewmodel/tree/aula-5) ou [baixá-lo](https://github.com/alura-cursos/jetpack-compose-viewmodel/archive/refs/heads/aula-5.zip).

## 🛠️ Abrir e rodar o projeto

Após baixar o projeto, você pode abrir com o Android Studio. Para isso, na tela de launcher clique em:

Open an Existing Project (ou alguma opção similar)
Procure o local onde o projeto está e o selecione (Caso o projeto seja baixado via zip, é necessário extraí-lo antes de procurá-lo)
Por fim clique em OK
O Android Studio deve executar algumas tasks do Gradle para configurar o projeto, aguarde até finalizar. Ao finalizar as tasks, você pode executar o App 🏆

## 📚 Mais informações do curso

Gostou do projeto e quer aprender como implementá-lo? Você pode [acessar o curso](https://cursos.alura.com.br/course/jetpack-compose-estados-viewmodel).
