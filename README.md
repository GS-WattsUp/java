# WhattsUp - Comparador de Veículos

WattsUp é uma aplicação Python que permite comparar veículos a combustão e elétricos, analisando custos de combustível, consumo de energia e emissões de CO₂.  
Com funcionalidades como **análise de trajeto** e **projeção temporal**, a plataforma ajuda usuários a entenderem o impacto financeiro e ambiental das suas escolhas de mobilidade.

---

## Funcionalidades
- **Análise de Trajeto:** Compare dois veículos (um a combustão e um elétrico) para uma distância fixa, verificando consumo, custos e emissões de CO₂.
- **Projeção Temporal:** Analise o impacto acumulado ao longo de um período definido (dias, semanas, meses ou anos), observando evolução de custos e emissões.

### Métodos Operacionais
1. **Análise de Trajeto**:
    - **Descrição**: Usa os dados fornecidos pelo usuário (distância fixa) para calcular comparativamente os seguintes valores para um trajeto específico:
        - **Emissão de CO₂**:
            - Para carros a combustão: Calculado com base no consumo do carro (km/L), a distância total, e a constante de emissão de CO₂ do combustível.
            - Para carros elétricos: Calculado com base no consumo energético do carro (kWh/km), a distância total, e a constante de emissão de CO₂ da energia elétrica.
        - **Fórmulas Implementadas**:
            - Carro a Combustão:
              ```java
              double combustivelGasto = distancia / getCarroCombustao().getConsumo();
              return combustivelGasto * getCarroCombustao().getCombustivel().getConstanteEmissaoCO2();
              ```
            - Carro Elétrico:
              ```java
              double energiaGasta = distancia / getCarroEletrico().calculaConsumo();
              return energiaGasta * getCarroEletrico().getConstanteEmissaoCO2();
              ```
2. **Projeção Temporal**:
    - **Descrição**: Usa os dados fornecidos pelo usuário para projetar os valores acumulados de emissões de CO₂ ao longo de múltiplos intervalos de tempo. Cada intervalo tem uma distância fixa, e o sistema projeta o impacto ao longo de vários períodos.
        - **Emissão de CO₂ Acumulada**:
            - Para carros a combustão: Calculado com base no consumo do carro e a distância total percorrida ao longo de vários intervalos.
            - Para carros elétricos: Calculado com base no consumo energético do carro e a distância total percorrida ao longo de vários intervalos.
        - **Fórmulas Implementadas**:
            - Carro a Combustão:
              ```java
              double distancia = distanciaPorIntervalo * quantidadeIntervalosDecorridos;
              double combustivelGasto = distancia / getCarroCombustao().getConsumo();
              return combustivelGasto * getCarroCombustao().getCombustivel().getConstanteEmissaoCO2();
              ```
            - Carro Elétrico:
              ```java
              double distancia = distanciaPorIntervalo * quantidadeIntervalosDecorridos;
              double energiaGasta = distancia / getCarroEletrico().calculaConsumo();
              return energiaGasta * getCarroEletrico().getConstanteEmissaoCO2();
              ```

---

## Como Executar na Máquina do Usuário
### Pré-requisitos
- Java 8 ou superior instalado.
- IDE ou ambiente para executar programas Java (ex.: IntelliJ, Eclipse, ou CLI com `javac` e `java`).
- Clonar ou baixar este repositório: [WhattsUP Java](https://github.com/GS-WattsUp/java.git).

### Passos
1. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/GS-WattsUp/java.git
   cd java
   ```

2. **Abrir no Ambiente de Desenvolvimento**:
    - Importe o projeto na sua IDE preferida.
    - Certifique-se de que as dependências (se houver) estão configuradas.

3. **Compilar o Projeto**:
    - Compile todos os arquivos Java dentro da pasta `src` (exemplo usando CLI):
      ```bash
      javac -d bin src/*.java
      ```

4. **Executar o Programa**:
    - Execute a classe principal `TesteSistema` (exemplo usando CLI):
      ```bash
      java -cp bin br.com.fiap.main.TesteSistema
      ```
    - Insira os dados solicitados pelo sistema através dos diálogos exibidos.

5. **Interpretação dos Resultados**:
    - Após a execução, os resultados de análises e projeções serão exibidos no console.
    - Use esses resultados para interpretar os impactos comparativos entre os carros analisados.

## Estrutura do Projeto
- **beans**: Contém as classes principais como `Carro`, `CarroCombustao`, `CarroEletrico`, `Analise`, `AnaliseTrajeto`, e `ProjecaoTemporal`.
- **main**: Contém a classe principal `TesteSistema` para execução do programa.
