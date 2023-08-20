# Factory Method e Abstract Factory

### O que é Factory Method?
Factory Method é um padrão de projeto de criação pertencente à categoria dos padrões de projeto de software. Ele fornece uma abordagem para criar objetos em uma classe base, permitindo que as subclasses determinem o tipo exato de objetos a serem criados.

### O que é Abstract Factory?
Abstract Factory é um padrão de criação que fornece uma interface para criar famílias de objetos relacionados ou dependentes, sem especificar suas classes concretas. Ele é projetado para resolver o problema de criar conjuntos de objetos interdependentes sem acoplar o código do cliente às classes concretas.

### Qual a diferença entre os dois?
O  Factory Method se concentra na criação de objetos individuais através de uma hierarquia de classes, enquanto o Abstract Factory lida com a criação de famílias de objetos inter-relacionados, fornecendo uma maneira de criar objetos de diferentes tipos que se complementam.
### Código Factory Method
No exemplo, o intuito é criar um fábricas especializadas em criar diferentes tipos de veiculos,como por exemplo bicicletas e carros.Temos uma classe abstrata 
Vehicle Factory,que poderia implementar alguma lógica, mas a implementação do método de criação fica para as subclasses.

### Código Abstract Factory 
No exemplo, o intuito é criar um fábricas especializadas em criar diferentes tipos de modalidades,como por individual ou empresarial.Nossas fábricas criam essas modalidades.


### Vídeo exemplo
[https://www.youtube.com/watch?v=36SzKmNnXdM]()
[https://www.youtube.com/watch?v=KouxYcDA2HA]()