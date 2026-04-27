const notas = [];

function adicionarNota() {
  const input = document.getElementById("inputNota");
  const valor = parseFloat(input.value);

  if (isNaN(valor) || (valor !== -1 && valor !== 0 && (valor < 1 || valor > 10))) {
    mostrarErro("Nota inválida! Use -1 (colando), 0 (zerou) ou entre 1 e 10.");
    return;
  }

  limparErro();
  notas.push(valor);
  renderizarTags();
  input.value = "";
  input.focus();
}

function renderizarTags() {
  const lista = document.getElementById("listaNotas");
  lista.innerHTML = notas
    .map((n, i) => {
      const cls = classificarClasse(n);
      const label = n === -1 ? "Colando" : n === 0 ? "Zerou" : `Nota ${n}`;
      return `<span class="nota-tag nota-${cls}" title="Remover" onclick="removerNota(${i})" style="cursor:pointer">${label} ×</span>`;
    })
    .join("");
}

function removerNota(index) {
  notas.splice(index, 1);
  renderizarTags();
}

function classificarClasse(nota) {
  if (nota === -1) return "colando";
  if (nota === 0)  return "zerado";
  if (nota >= 7)   return "aprovado";
  return "reprovado";
}

function calcularResultado() {
  if (notas.length === 0) {
    mostrarErro("Adicione pelo menos uma nota antes de calcular.");
    return;
  }

  limparErro();

  let aprovados = 0, reprovados = 0, zerados = 0, colando = 0;
  let somaTotal = 0, somaAprovados = 0, somaReprovados = 0, somaColando = 0;

  notas.forEach((nota) => {
    somaTotal += nota;
    if (nota === -1) {
      colando++;
      somaColando += nota;
    } else if (nota === 0) {
      zerados++;
    } else if (nota >= 7) {
      aprovados++;
      somaAprovados += nota;
    } else {
      reprovados++;
      somaReprovados += nota;
    }
  });

  const total        = notas.length;
  const mediaGeral   = somaTotal / total;
  const mediaAprov   = aprovados  > 0 ? somaAprovados  / aprovados  : 0;
  const mediaReprov  = reprovados > 0 ? somaReprovados / reprovados : 0;
  const mediaColando = colando    > 0 ? somaColando    / colando    : 0;

  const pct = (n) => ((n / total) * 100).toFixed(1);
  const fmt = (n) => n.toFixed(2);

  const div = document.getElementById("resultado");
  div.classList.remove("hidden");
  div.innerHTML = `
    <h2>Resultado da Turma</h2>
    <div class="stats-grid">
      <div class="stat-card geral">
        <h3>Visão Geral</h3>
        <div class="quantidade">${total} alunos</div>
        <div class="detalhe">Média geral: ${fmt(mediaGeral)}</div>
      </div>
      <div class="stat-card aprovado">
        <h3>Aprovados (nota ≥ 7)</h3>
        <div class="quantidade">${aprovados}</div>
        <div class="detalhe">${pct(aprovados)}% · média ${fmt(mediaAprov)}</div>
      </div>
      <div class="stat-card reprovado">
        <h3>Reprovados (1 a 6)</h3>
        <div class="quantidade">${reprovados}</div>
        <div class="detalhe">${pct(reprovados)}% · média ${fmt(mediaReprov)}</div>
      </div>
      <div class="stat-card zerado">
        <h3>Zerados</h3>
        <div class="quantidade">${zerados}</div>
        <div class="detalhe">${pct(zerados)}%</div>
      </div>
      <div class="stat-card colando">
        <h3>Pegos Colando</h3>
        <div class="quantidade">${colando}</div>
        <div class="detalhe">${pct(colando)}%</div>
      </div>
    </div>
  `;
}

function resetar() {
  notas.length = 0;
  renderizarTags();
  document.getElementById("resultado").classList.add("hidden");
  document.getElementById("inputNota").value = "";
  limparErro();
}

function mostrarErro(msg) {
  limparErro();
  const erro = document.createElement("p");
  erro.className = "erro";
  erro.id = "msgErro";
  erro.textContent = msg;
  document.querySelector(".input-area").insertAdjacentElement("afterend", erro);
}

function limparErro() {
  const e = document.getElementById("msgErro");
  if (e) e.remove();
}

document.getElementById("inputNota").addEventListener("keydown", (e) => {
  if (e.key === "Enter") adicionarNota();
});
