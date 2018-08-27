package com.example.edgarmartinez.fracciones;

public class fraccion {
    int den, num;

    fraccion(){

    }

    fraccion(int num, int den){
        this.num=num;
        this.den=num;
    }

    public fraccion sumar(fraccion sumando){
        if(this.den==sumando.den){
            return new fraccion(this.num+sumando.num,this.den);
        }else{
            return new fraccion((this.num*sumando.den)+(this.den*sumando.num),this.den*sumando.den);
        }
    }

    public fraccion restar(fraccion restando){
        if(this.den==restando.den){
            return new fraccion(this.num-restando.num,this.den);
        }else{
            return new fraccion((this.num*restando.den)-(this.den*restando.num),this.den*restando.den);
        }
    }

    public fraccion multiplicar(fraccion multiplicador){
        return new fraccion(this.num*multiplicador.num,this.den*multiplicador.den);
    }

    public fraccion division(fraccion divisor){
        return new fraccion(this.num*divisor.den,this.den*divisor.num);
    }
}
