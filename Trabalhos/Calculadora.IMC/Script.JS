document.getElementById("imcForm").addEventListener("submit", function(event) {
    event.preventDefault();
    const peso = parseFloat(document.getElementById("peso").value);
    const altura = parseFloat(document.getElementById("altura").value);

    try {
        const resultado = calcularIMC(peso, altura);
        document.getElementById("resultado").textContent = resultado;
    } catch (error) {
        document.getElementById("resultado").textContent = error.message;
    }
});

function calcularIMC(peso, altura) {
    /*
    Calcula o Índice de Massa Corporal (IMC) com base no peso e altura fornecidos.
    Retorna o IMC e uma mensagem indicando o status de peso da pessoa.
    */

    if (isNaN(peso) || isNaN(altura) || peso <= 0 || altura <= 0) {
        throw new Error("Por favor, insira um valor válido e positivo para peso e altura.");
    }

    const imc = peso / (altura ** 2);

    let status, perdaPeso;
    if (imc < 18.5) {
        status = "Vai se alimentar Tu Vai morrer";
    } else if (imc < 25) {
        status = "Boa Ta Na media";
    } else if (imc < 30) {
        status = "Ta quase thais Carla";
    } else if (imc < 35) {
        perdaPeso = peso * 0.10;
        status = "Se voce Não fazer seu Cardio Vai virar a Thais Carla ";
        perdaPeso = peso * 0.20;
    } else if (imc < 40) {
        status = "Ta se Transformando nela, vo te come vo te come ";
        perdaPeso = peso * 0.30;
    } else {
        status = "Viro a Thais Carla Pique Majin Boo ";
        perdaPeso = peso * 0.40;
    }

    let mensagem;
    if (imc >= 35) {
        mensagem = ` ${status}. Para voltar ao peso ideal, você precisa perder ${perdaPeso.toFixed(2)} quilos.`;
    } else {
        mensagem = `Seu IMC é ${imc.toFixed(2)}.  ${status}.`;
    }

    return mensagem;
}
