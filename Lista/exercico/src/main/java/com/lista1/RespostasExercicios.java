package com.lista1;

public class RespostasExercicios {

    /*
	 * Utilize apenas o método main para testar a implementação dos métodos. 
	 * Não se faz necessário implementar dentro do escopo do método.
	 */
    public static void main(String[] args) throws Exception {
        int[] j = {2,3,4,5};
       System.out.println( Array1(j));;
    }

    /*
     * Operadores, tipos e variaveis
     * 
     * Questão 1: Usando Java Solucione a a equação: f(x) = x³ + x² + 3x - 25,
     * para uma valor determinado de x.
     * 
     * Ajuda - Sugestões de pesquisa para resolver essa questão:
     * 1. Tipos primitivos em Java para entender o int.
     * 2. Como criar um metodo em Java
     * 3. O que é um metodo static em Java
     * 4. como elevar numeros em Java e qual o retorno dessa operação
     * 5. Trabalhem com o tipo primitivo que o metodo retorna
     */
    public static int operadoresTiposVariaveis1(int x) {
        return (int) (Math.pow(x, 3) + (Math.pow(x, 2) + (3 * x)) - 25);
    }

    /*
     * Questão 2: Ultilizando Java solucione a equação: f(x, z) = x³ + z² + 3xz - 25
     * 
     * Ajuda - Sugestões de pesquisa para resolver essa questão:
     * 1. Tipos primitivos em Java para entender o int.
     * 2. Como criar um metodo em Java
     * 3. O que é um metodo static em Java
     * 4. como elevar numeros em Java e qual o retorno dessa operação
     * 5. Trabalhem com o tipo primitivo que o metodo retorna
     */

    public static int operadoresTiposVariaveis2(int x, int z) {
        return (int) (Math.pow(x, 3) + Math.pow(z, 2) + (3 * x * z) - 25);
    }

    /*
     * Execução Condicional
     * 
     * Questão 1: Implemente um programa capaz de, dados dois números, retorne
     * o maior número;
     * 
     * Ajuda - Sugestões de pesquisa para resolver essa questão:
     * 1. Tipos primitivos em Java para entender o int.
     * 2. Entenda if em Java, é semelhante a JavaScript
     */

    public static int execucaoCondicional1(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /*
     * Questão 2: Implemente um programa que converte texto em um número inteiro
     * (“um” -> 1, “dois” -> 2, até o número “cinco”), caso exista alguma outra 
     * entrada coloque -> 0
     * 
     * Ajuda - Sugestões de pesquisa para resolver essa questão:
     * 1. Tipos primitivos em Java para entender o int.
     * 2. Entenda if em Java, é semelhante a JavaScript
     * 3. Pesquise se é possivel ter entradas com tipos diferentes do retorno em
     * Java
     * 4. Use palavras com letras minusculas
     * 5. Qual a diferença entre aspas simples e duplas no Java
     */

    public static int execucaoCondicional2(String num) {
        if (num == "um") {
            return 1;
        } else if (num == "dois") {
            return 2;
        } else if (num == "tres") {
            return 3;
        } else if (num == "quatro") {
            return 4;
        } else if (num == "cinco") {
            return 5;
        } else {
            return 0;
        }
    }

    /*
     * Operadores Lógicos
     * 
     * Questão 1: Implemente um programa capaz de, dados quatro números,
     * contar quantos entre eles são divisíveis por 5 e 7 ao mesmo tempo
     * 
     * Ajuda - Sugestões de pesquisa para resolver essa questão:
     * 1. Utilize Operadoes Lógicos para essa questão
     * 2. Relembre o coneito de variavel contadora, qual o seu tipo primitivo em
     * Java?
     */

    public static int operadoesLogicos1(int num1, int num2, int num3, int num4) {
        int count = 0;

        if (num1 % 5 == 0 && num1 % 7 == 0)
            count++;
        if (num2 % 5 == 0 && num2 % 7 == 0)
            count++;
        if (num3 % 5 == 0 && num3 % 7 == 0)
            count++;
        if (num4 % 5 == 0 && num4 % 7 == 0)
            count++;

        return count;
    }

    /*
     * Questão 2: Implemente um programa capaz de identificar se há exatamente
     * (apenas) um número PAR entre três número dados
     * 
     * Ajuda - Sugestões de pesquisa para resolver essa questão:
     * 1. O que é um metodo do tipo Boolean
     * 2. Existem maneiras de fazer essa questão mas utilize operadores lógicos
     */

    public static Boolean operadoresLogicos2(int num1, int num2, int num3) {
        if (num1 % 2 == 0 && num2 % 2 != 0 && num3 % 2 != 0) {
            return true;
        } else if (num1 % 2 != 0 && num2 % 2 == 0 && num3 % 2 != 0) {
            return true;
        } else if (num1 % 2 != 0 && num2 % 2 != 0 && num3 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Laços
     * 
     * Questão 1: Implemente um programa capaz de retornar a soma dos quadrados dos
     * 10 primeiros números inteiros(coloque na entrada o numero de parada do for)
     * 
     * Ajuda - Sugestões de pesquisa para resolver essa questão:
     * 1. Utilize a entrada como ponto de partida do laço
     * 2. Como fazer um for em Java
     * 3. Revise o conceito de variavel que guarda a soma
     * 4. Pesquise sobre o conceito de Cast em Java
     */

    public static int lacos1(int num) {
        int soma = 0;
        for (int i = 0; i <= num; i++) {
            soma = (int) (soma + Math.pow(i, 2));
        }
        return soma;
    }

    /*
     * Questão 2: Implemente um programa capaz de imprimir os números negativos
     * múltiplos de 5 até -100. Imprima os numeros na mesma linha separados por
     * virgula. Ex: 1,2,3,4 
     * Zero não é multiplo
     * 
     * Ajuda - Sugestões de pesquisa para resolver essa questão:
     * 1. Pesquise como Imprimir no console em Java
     * 2. O que é um metodo com o retorno Void
     */

    public static void lacos2() {
        for (int i = 1; i >= -100; i--) {
            if (i % 5 == 0 && i != 0) {
                if(i != -100)
                    System.out.print(i + ",");
                else 
                    System.out.print(i);
            }
        }
    }

    /*
     * Subprogramas - Em java o conceito de subprograma é referenciado como Metodos
     * de uma Classe
     *
     * Questão 1: Implementar uma Metodo compute e retorne o valor de f(x) na
     * seguinte função matemática: f(x) = x³ - 4x + 1
     * 
     * Para fazer essa questão crie um um metodo statico com retorno do tipo inteiro
     * que receba um parametro do tipo inteiro que se chame (EXTAMENTE) "Metodo1" e resolva a
     * esquação a cima ;
     * 
     * Ajuda - Sugestões de pesquisa para resolver essa questão:
     * 1. Como criar metodos na mesma classe que existe o main
     * 2. Qual a diferença entre um metodo normal e um metodo static
     * 
     */

    public static int metodo1(int x) {
        int f = (int) (Math.pow(x, 3) - (4 * x) + 1);
        return f;
    }

    /*
     * Questão 2: Implementar uma função que recebe como parâmetro quatro números e retorna 
     * quantos números ímpares há entre eles
     * 
     * Para fazer essa questão crie um metodo statico com retorno do tipo inteiro
     * que receba parametros do tipo inteiro e se chame (EXATAMENTE) "Metodo2" e resolva a 
     * questão
     * 
     * Ajuda - Sugestões de pesquisa para resolver essa questão:
     * 1. Como criar metodos na mesma classe que existe o main
     * 2. Qual a diferença entre um metodo normal e um metodo static
     * 
     */

    public static int metodo2(int num1, int num2, int num3, int num4) {
        int count = 0;
        if(num1 % 2 != 0) count++;
        if(num2 % 2 != 0) count++;
        if(num3 % 2 != 0) count++;
        if(num4 % 2 != 0) count++;

        return count;
    }

    /*
     * Vetores e Arrays
     * 
     * Questão 1: Implementar um subprograma que dado um vetor, computa a média dos seus elementos 
     * e retorna quantos elementos acima da média ele possui
     * 
     * Ajuda - Sugestões de pesquisa para resolver essa questão:
     * 1. Como declarar um array em Java
     * 2. diferença de arrays em Java
     * 3. Os arrays em Java tem espaços infitinos?
     * 4. Como receber um array de um tipo primitivo como parametro
     */

    public static int array1(int[] array) {
        int soma = 0;
        int count = 0;
        int media;
        for(int i = 0; i < array.length; i++) {
            soma = soma + array[i];
        }
        media = soma / array.length;
        for(int i = 0; i < array.length; i++) {
            if (array[i] > media) {count++;};
        }
        return count;
    }

    /* 
     * Questão 2: Implementar um subprograma que dado um ARRAY DE DUAS DIMENSÕES, computa a média dos seus
     * elementos e retorna quantos elementos a cima da média ele possui
     * 
     * Ajuda - Sugestões de pesquisa para resolver essa questão:
     * 1.
     */

     public static int array2(int[][] arrray) {
        int count = 0;
        int soma = 0;
        int media;
        int result = 0;
        for(int i = 0; i < arrray.length; i++) {
            for(int j = 0; j < arrray[i].length; j++) {
                count++;
                soma = soma + arrray[i][j];
            }
        }
        media = soma / count;
        for(int i = 0; i < arrray.length; i++) {
            for(int j = 0; j < arrray[i].length; j++) {
                if(arrray[i][j] > media) result++;
            }
        }
        return result;
     }
}

