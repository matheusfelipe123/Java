const numero = parseInt(prompt("Digite um valor menor que 100"));

if (numero >= 100) {
    console.log("O número inserido não é menor que 100");
} else {
    const dezena = Math.floor(numero / 10);
    const unidade = numero % 10;

    const soma_digitos = dezena + unidade;
    console.log(soma_digitos);
}
