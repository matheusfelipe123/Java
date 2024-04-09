const numero1 = parseInt(prompt('Digite seu primeiro Numero: '));
const numero2 = parseInt(prompt('Digite seu segundo Numero: '));
const numero3 = parseInt(prompt('Digite seu Terceiro Numero: '));

let maior;

if (numero1 >= numero2 && numero1 >= numero3) {
    maior = numero1;
} else if (numero2 >= numero1 && numero2 >= numero3) {
    maior = numero2;
} else {
    maior = numero3;
}

console.log("O maior numero é:", maior);
