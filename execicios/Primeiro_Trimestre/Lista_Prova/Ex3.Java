function area(lado, altura) {
    return (lado * altura) / 2;
}

const lado = parseInt(prompt("Digite o lado"));
const altura = parseInt(prompt("Digite a altura"));

console.log(area(lado, altura));
