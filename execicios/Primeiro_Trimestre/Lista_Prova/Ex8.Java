const lado1 = parseFloat(prompt("Digite o primeiro lado do triângulo: "));
const lado2 = parseFloat(prompt("Digite o segundo lado do triângulo: "));
const lado3 = parseFloat(prompt("Digite o terceiro lado do triângulo: "));

if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
    console.log("Os valores dos lados devem ser maiores que zero.");
} else if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
    if (lado1 === lado2 && lado1 === lado3) {
        console.log("Os valores formam um triângulo equilátero.");
    } else if (lado1 === lado2 || lado1 === lado3 || lado2 === lado3) {
        console.log("Os valores formam um triângulo isósceles.");
    } else {
        console.log("Os valores formam um triângulo escaleno.");
    }
} else {
    console.log("Os valores não formam um triângulo.");
}

