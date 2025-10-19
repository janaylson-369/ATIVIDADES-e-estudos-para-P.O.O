package atividade1;// esta dentro da pasta lista1
class Quadrado {// classe Quadrado

    private int lado;// atributo lado

    public Quadrado(int lado){// construtor Quadrado
        this.lado = lado;
    }

    public int calcularArea(){// metodo calcularArea
        return lado*lado;
    }
    public int calcularPerimetro(){// metodo calcularPerimetro
        return lado*4;
    }
    public void imprimir(){// metodo imprimir
        System.out.print("\n");//pula uma linha
        System.out.println("lado:"+lado);//imprime o lado
        System.out.println("Área: " + calcularArea());//imprime a area
        System.out.println("Parâmetro:" + calcularPerimetro());//imprime o perimetro
        System.out.print("\n");//pula uma linha
    }

}