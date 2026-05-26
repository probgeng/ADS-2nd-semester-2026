# Respostas — Exercícios de Engenharia de Software

---

## Módulo 1: Fundamentos e Processos de Software

### 1.1 Definição Teórica

**P:** Explique a diferença entre "Desenvolver um programa de computador" e "Aplicar os conceitos de Engenharia de Software". Qual é o objetivo principal da disciplina?

**R:** Programar é só código. Engenharia de Software é todo o processo (planejamento, requisitos, design, testes, manutenção). O objetivo é construir software de qualidade, no prazo e dentro do orçamento.

---

### 1.2 Framework de Processo

**P:** Quais são as 5 atividades fundamentais descritas por Pressman que servem de base para quase todos os modelos de processo?

**R:** Comunicação, Planejamento, Modelagem, Construção, Implantação.

---

### 1.3 Análise de Modelos Prescritivos

**P:** Principal vantagem e principal desvantagem/risco de cada modelo tradicional:

| Modelo | Principal Vantagem | Principal Desvantagem / Risco |
|---|---|---|
| Cascata (Waterfall) | Estruturado, fácil de documentar | Inflexível, feedback chega tarde |
| Incremental | Feedback rápido, desenvolvimento iterativo | Integração complexa |
| Espiral | Gerenciamento de risco bem definido | Caro e complexo de executar |

---

### 1.4 Estudo de Caso (Espiral)

**P:** Por que o modelo Espiral de Barry Boehm é considerado um modelo evolucionário "guiado por riscos"?

**R:** Boehm analisa riscos a cada iteração e ajusta a estratégia de acordo com o que for identificado. Exemplo: software crítico como sistemas de aviação, dispositivos médicos ou sistemas bancários, onde falhas têm alto custo.

---

## Módulo 2: Desenvolvimento Ágil de Software

### 2.1 O Manifesto Ágil

**P:** Isso significa que projetos ágeis não devem ter documentação?

**R:** Não. Ágil privilegia documentação enxuta e essencial, não significa sem documentação. A diferença é que documenta o que realmente importa, evitando papelada desnecessária.

---

### 2.2 Dinâmica do Scrum

**P:** Correlacione os papéis e ritos do framework Scrum:

| Elemento | Descrição |
|---|---|
| Daily Scrum | Reunião diária de 15 minutos para sincronização do time |
| Sprint Review | Evento onde o incremento do produto é demonstrado aos stakeholders no fim da Sprint |
| Product Owner | Responsável por maximizar o valor do produto e gerenciar o Product Backlog |
| Sprint Planning | Reunião onde o time define o que será feito e como será feito no próximo ciclo |
| Scrum Master | Facilitador do processo, focado em remover impedimentos e blindar a equipe |

---

### 2.3 Práticas de Engenharia (XP)

**P:** Explique o funcionamento e o benefício de duas práticas essenciais do XP:

**Pair Programming (Programação em Dupla):**
Dois desenvolvedores trabalham no mesmo código, lado a lado. Benefícios: menos bugs, qualidade superior, compartilhamento de conhecimento.

**TDD (Desenvolvimento Orientado a Testes):**
Escreve o teste antes de programar. Benefícios: design mais limpo, menos regressões, código mais testável.

---

## Módulo 3: Engenharia de Requisitos

### 3.1 Funcional vs. Não Funcional

**P:** Classifique as afirmações:

- **[RF]** "O sistema deve emitir um relatório de vendas mensal em formato PDF."
- **[RNF]** "A página de checkout deve carregar em menos de 2 segundos, mesmo sob alto tráfego."
- **[RNF]** "Todas as senhas dos usuários armazenadas no banco de dados devem ser criptografadas utilizando o algoritmo SHA-256."
- **[RF]** "O usuário administrador deve conseguir bloquear contas de clientes inadimplentes."

---

### 3.2 Elicitação vs. Negociação

**P:** Por que a etapa de negociação de requisitos é considerada um processo político e técnico indispensável?

**R:** Elicitação coleta desejos. Negociação resolve conflitos entre requisitos e limitações reais (orçamento, tempo, recursos, stakeholders diferentes). É política porque envolve decisões humanas; é técnica porque testa viabilidade.

---

### 3.3 Modelagem com Casos de Uso

**P:** Descreva a estrutura de um Diagrama de Caso de Uso para um Sistema de Caixa Eletrônico (ATM).

**Atores:**
- Cliente
- Técnico do Banco

**Casos de Uso:**
- Sacar Dinheiro
- Consultar Saldo
- Reabastecer Cédulas

**Relações:**
- `<<include>>`: Sacar Dinheiro **inclui** Validar PIN (sempre acontece)
- `<<extend>>`: Sacar Dinheiro **estendido por** Erro de Conexão (opcional, caso excepcional)

---

## Módulo 4: Projeto de Software e Padrões de Projeto

### 4.1 Conceitos de Arquitetura

**P:** O que significam alta coesão e baixo acoplamento?

**R:**

- **Coesão alta:** Módulo faz uma coisa bem, com responsabilidade clara.
- **Acoplamento baixo:** Módulos são independentes, mudanças em um não quebram outro.

Benefício: facilitam reuso, manutenção, testes e escalabilidade.

---

### 4.2 Padrões de Projeto (Design Patterns)

**P:** Explique o propósito dos seguintes padrões GoF:

**Singleton (Padrão Criacional):**
Garante uma única instância de uma classe em toda a aplicação, com acesso global.

**Observer (Padrão Comportamental):**
Notifica automaticamente múltiplos listeners quando um objeto muda de estado.

**MVC (Model-View-Controller — Padrão Arquitetural):**
Separa dados (Model), interface (View) e lógica de negócio (Controller).

---

### 4.3 Cenário Prático

**P:** Qual padrão de projeto estrutural você usaria para unificar a interface de comunicação com gateways de pagamento diferentes (PayPal, Stripe, Mercado Pago)?

**R:** **Adapter** (ou Facade). Cria uma interface única que unifica as APIs diferentes, isolando a complexidade de cada gateway.

---

## Módulo 5: Qualidade, Testes e Evolução

### 5.1 Estratégias de Teste

**P:** Diferencie Teste de Caixa Preta e Teste de Caixa Branca.

- **Caixa Preta:** Testa funcionalidade externa, sem conhecer código interno.
- **Caixa Branca:** Testa estrutura interna, requer acesso e conhecimento do código-fonte.

---

### 5.2 Pirâmide de Testes

**P:** Explique o foco de cada nível de teste:

| Nível | Foco |
|---|---|
| Testes Unitários | Testam funções/métodos isolados |
| Testes de Integração | Testam módulos trabalhando juntos |
| Testes E2E (Sistema) | Testam fluxo completo da aplicação, simulando uso real |

---

### 5.3 Tipos de Manutenção

**P:** Classifique cada intervenção:

| Intervenção | Tipo |
|---|---|
| Correção de bug no carrinho | Corretiva |
| Atualização de alíquotas de imposto | Adaptativa |
| Adição de login social Google | Evolutiva |

---

### 5.4 Reengenharia vs. Manutenção

**P:** Em que momento a empresa deve optar pela Reengenharia de um sistema legado?

**R:** Quando o custo de manutenção é maior que uma reengenharia completa e a arquitetura está muito legada/obsoleta. Riscos: projeto atrasa, requer experiência em código antigo, quebra de funcionalidades.

---

## Módulo 6: Cultura e Práticas Modernas

### 6.1 O que é DevOps

**P:** Como o DevOps resolve o conflito entre Dev (velocidade) e Ops (estabilidade)?

**R:** DevOps une Dev e Ops em uma equipe única com automação, comunicação constante e responsabilidade compartilhada. Assim, ambos buscam o mesmo objetivo: entregar rápido e estável.

---

### 6.2 CI/CD

**P:** Defina os conceitos:

**Integração Contínua (CI):**
Código é integrado constantemente em um repositório central, com testes e builds automatizados a cada envio.

**Entrega/Implantação Contínua (CD):**
Código aprovado no CI é entregue automaticamente em staging (Continuous Delivery) ou direto em produção (Continuous Deployment).

---

### 6.3 Cenário Prático

**P:** Descreva o fluxo de CI/CD desde um Pull Request até produção.

**R:**

1. Dev faz Pull Request
2. CI executa: testes automatizados + build
3. Se aprovado: código vai para Staging
4. Testes E2E em Staging
5. Aprovação manual (ou automática, conforme configuração)
6. Deploy em Produção
7. Monitoramento contínuo
