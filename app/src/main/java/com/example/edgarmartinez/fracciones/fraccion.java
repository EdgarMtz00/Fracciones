package com.example.edgarmartinez.fracciones;

public class fraccion {
    public int den, num;

    fraccion(){

    }

    fraccion(int num, int den){
        this.num=num;
        this.den=num;
    }

    public fraccion sumar(fraccion sumando){
        if(this.den==sumando.den){
            return conversion(new fraccion(this.num+sumando.num,this.den));
        }else{
            return conversion(new fraccion((this.num*sumando.den)+(this.den*sumando.num),this.den*sumando.den));
        }
    }

    public fraccion restar(fraccion restando){
        if(this.den==restando.den){
            return conversion(new fraccion(this.num-restando.num,this.den));
        }else{
            return conversion(new fraccion((this.num*restando.den)-(this.den*restando.num),this.den*restando.den));
        }
    }

    public fraccion multiplicar(fraccion multiplicador){
        return conversion(new fraccion(this.num*multiplicador.num,this.den*multiplicador.den));
    }

    public fraccion division(fraccion divisor){
        return conversion(new fraccion(this.num*divisor.den,this.den*divisor.num));
    }

    private fraccion conversion(fraccion f){
        int menor = (f.num<f.den)?f.num:f.den;
        for(int i=2;i <= menor;i++){
            if(f.num % i == 0 && f.den % i ==0){
                fraccion res = conversion(new fraccion(f.num/i, f.den/i));
                return res;
            }
        }
        return f;

    }
}
