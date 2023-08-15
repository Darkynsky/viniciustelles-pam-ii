let n1 = 5;
let n2 = 8;

console.log(n1+n2); //soma
console.log(n1-n2); //subtração
console.log(n1*n2); //multiplicação
console.log(n1/n2); //divisão
console.log(n1**n2); //exponenciação
console.log(Math.sqrt(n1)) //raiz quadrada

/*
function soma(numero1, numero2){
    return numero1 + numero2
}
function subtracao(numero1, numero2){
    return numero1 - numero2
}
function multiplicacao(numero1, numero2){
    return numero1 * numero2
}
function divisao(numero1, numero2){
    return numero1 / numero2
}

function exponenciacao(numero1, numero2){
    return numero1 ** numero2
}

console.log(soma(12, 19))
console.log(subtracao(12, 19))
console.log(multiplicacao(12, 19))
console.log(divisao(12, 19))
console.log(exponenciacao(12, 19))
*/

const divisao = (v1, v2) => {
    msg = ""
    if(v1 > v2){
        let resultado = v1 / v2
        msg = resultado
        return msg
    }
    msg = "Insira um valor para v2 menor"    
    return msg
}

console.log(divisao(10, 2))
console.log(divisao(2, 10))

const divisaoII = (v1, v2) => {
    if(v1 > v2){
        let resultado = v1 / v2
        return resultado
    }
    return "insira um valor para v2 menor"
}

console.log(divisaoII(10, 2))
console.log(divisaoII(2, 10))