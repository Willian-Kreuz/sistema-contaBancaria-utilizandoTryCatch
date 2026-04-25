Sistema Bancário em Java 🏦
------------------------------------------------------------------------------------------------------------------------------------------------------
Este projeto foi desenvolvido como exercício de estudo sobre tratamento de exceções (try/catch) em Java.
A ideia é simular um sistema bancário simples, com criação de contas, depósitos e saques, aplicando regras de negócio e validações robustas.

📌 Objetivos do Projeto
------------------------------------------------------------------------------------------------------------------------------------------------------
Praticar o uso de try/catch para capturar e tratar erros.

Implementar validações de entrada e validações de negócio.

Criar uma exceção personalizada (ExcecaoDeDominio) para regras específicas do domínio bancário.

Melhorar a experiência do usuário com mensagens claras de erro.

🛠️ Estrutura do Projeto
------------------------------------------------------------------------------------------------------------------------------------------------------
Program → Classe principal que interage com o usuário via console.

Account → Representa uma conta bancária, com atributos e regras de negócio.

ExcecaoDeDominio → Exceção personalizada para validações específicas.

⚙️ Funcionalidades
------------------------------------------------------------------------------------------------------------------------------------------------------
Criar uma conta com:

Número positivo

Saldo inicial não negativo

Limite de saque válido

Titular sem números

Realizar depósitos e saques com validações:

Saque não pode exceder o limite definido.

Saque não pode ser maior que o saldo disponível.

Tratamento de exceções:

InputMismatchException → quando o usuário digita letras em vez de números.

ExcecaoDeDominio → regras de negócio personalizadas.

🚀 Tecnologias Utilizadas
------------------------------------------------------------------------------------------------------------------------------------------------------
Java

Scanner para entrada de dados

Try/Catch para tratamento de exceções

Criação da classe Account para representar uma conta bancária com regras de negócio

📚 Aprendizados
------------------------------------------------------------------------------------------------------------------------------------------------------
Diferença entre InputMismatchException e NumberFormatException.

Importância de separar validações de entrada e validações de negócio.

Como criar uma exceção personalizada para regras específicas.

Melhorar a comunicação com o usuário através de mensagens claras.
