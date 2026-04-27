/*
 * TESTES PLANEJADOS (Modelo ULIFE) — antes do código:
 * Entrada (idade) =  5  → "Entrada Proibida"
 * Entrada (idade) = 12  → "Criança - Sala 01"
 * Entrada (idade) = 17  → "Adolecente Sala 02"
 * Entrada (idade) = 59  → "Adulto - Sala 03"
 * Entrada (idade) = 60  → "Idoso - Sala 04"
 */

function indicarSala(idade) {
  if (idade <= 5)  return { texto: "Entrada Proibida",    classe: "proibido" };
  if (idade <= 12) return { texto: "Criança - Sala 01",   classe: "crianca" };
  if (idade <= 17) return { texto: "Adolecente Sala 02",  classe: "adolescente" };
  if (idade <= 59) return { texto: "Adulto - Sala 03",    classe: "adulto" };
  return           { texto: "Idoso - Sala 04",            classe: "idoso" };
}

function identificarSala() {
  const input = document.getElementById("inputIdade");
  const idade = parseInt(input.value);

  if (isNaN(idade) || idade < 0 || idade > 150) {
    alert("Digite uma idade válida (0 a 150).");
    return;
  }

  const { texto, classe } = indicarSala(idade);
  const div = document.getElementById("resultado");
  div.textContent = texto;
  div.className = `resultado ${classe}`;
}

function executarTestes() {
  const casos = [
    { id: "t1", idade:  5, esperado: "Entrada Proibida"  },
    { id: "t2", idade: 12, esperado: "Criança - Sala 01" },
    { id: "t3", idade: 17, esperado: "Adolecente Sala 02"},
    { id: "t4", idade: 59, esperado: "Adulto - Sala 03"  },
    { id: "t5", idade: 60, esperado: "Idoso - Sala 04"   },
  ];

  casos.forEach(({ id, idade, esperado }) => {
    const { texto } = indicarSala(idade);
    const passou = texto === esperado;
    const cel = document.getElementById(id);
    cel.textContent = passou ? "✅ PASS" : `❌ FAIL (recebeu: "${texto}")`;
    cel.className = passou ? "pass" : "fail";
  });
}

document.getElementById("inputIdade").addEventListener("keydown", (e) => {
  if (e.key === "Enter") identificarSala();
});
