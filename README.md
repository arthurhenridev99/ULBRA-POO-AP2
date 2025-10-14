 🚗 Sistema de Gerenciamento de Veículos – Segunda Atividade Prática -  AP2 (ULBRA)

## 🧩 Descrição da Atividade
Este projeto foi desenvolvido como **atividade avaliativa da disciplina de Programação Orientada a Objetos (POO)**, com o objetivo de aplicar os conceitos de **herança, encapsulamento, classes abstratas e métodos de acesso** em Java.

O sistema simula um **gerenciador simples de veículos**, permitindo representar diferentes tipos (Carro e Moto) a partir de uma classe abstrata base.

---

## 📚 Requisitos Atendidos

### ✅ Classe Abstrata `Veiculo`
- **Atributos:**
  - `marca` *(público)*
  - `modelo` *(público)*
  - `ano` *(privado)*

- **Métodos:**
  - `informacoesVeiculo()` → método abstrato que deve ser implementado nas subclasses.  
  - `getAno()` e `setAno(int ano)` → métodos de acesso ao atributo privado `ano`.

---

### ✅ Classe `Carro` (herda de `Veiculo`)
- **Atributo adicional:** `numeroPortas` *(público)*  
- **Implementação:** Sobrescreve o método `informacoesVeiculo()` para exibir todos os dados do carro.

---

### ✅ Classe `Moto` (herda de `Veiculo`)
- **Atributo adicional:** `cilindrada` *(privado)*  
- **Implementação:** Sobrescreve o método `informacoesVeiculo()` para exibir as informações da moto.

---

### ✅ Classe `Main`
- Instancia um objeto de cada tipo (`Carro` e `Moto`);
- Define valores para seus atributos;
- Exibe as informações de cada veículo chamando `informacoesVeiculo()`.

---

## 🧠 Estrutura de Pastas

src/
└── ap2/
└── ulbra/
└── academy/
├── domain/
│ ├── Veiculo.java
│ ├── Carro.java
│ └── Moto.java
└── test/
└── Main.java

yaml
Copiar código

---

## ⚙️ Instruções de Execução

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/arthurhenridev99/ULBRA-POO-AP2.git
Abra o projeto em uma IDE Java (como IntelliJ IDEA, Eclipse ou VS Code com extensão Java).

Compile e execute a classe Main.

Saída esperada (exemplo):

yaml
Copiar código
Marca: Honda
Modelo: Civic
Ano: 2020
Número de portas: 4
-------------------
Marca: Yamaha
Modelo: MT-07
Ano: 2022
Cilindrada: 700cc

🧾 Observações Importantes
O código está organizado em pacotes (domain e test) para melhor estruturação.

Cada classe segue os princípios da Programação Orientada a Objetos:

-Abstração
-Herança
-Encapsulamento
-Polimorfismo (por sobrescrita de método)

Universidade Luterana do Brasil (ULBRA)
Disciplina: Programação Orientada a Objetos
Professor: Ramon dos Santos Lummertz
Ano: 2025
