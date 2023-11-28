package Deitel_Java.A1_Data_Structure.Linear.Stack;

public class StackTriangulo {

    public StackTriangulo() {
    }

    public StackTriangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    private float lado1;
    private float lado2;
    private float lado3;

    //==========================================================================
    //                             GETS E SETS
    //
    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    //*_______________________________________________________*

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) this.lado1;
        hash = 97 * hash + (int) this.lado2;
        hash = 97 * hash + (int) this.lado3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        //=== implementacao propria ============================================
        final StackTriangulo other = (StackTriangulo) obj;
        if (this.lado1 != other.lado1) {
            return false;
        }
        if (this.lado2 != other.lado2) {
            return false;
        }
        if (this.lado3 != other.lado3) {
            return false;
        }
        return true;
    }
    //*_______________________________________________________*

    /**
     * Verifica se os lados formam um triangulo valido.
     *
     * @return
     */
    public boolean trianguloValido() {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            return false;
        } else if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {  // um lado deve ser menor que a soma dos outros dois
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna o perimetro do triangulo.
     *
     * @return
     */
    public float perimetro() {
        if (!trianguloValido()) {
            return 0F;
        }
        return lado1 + lado2 + lado3;
    }

    /**
     * Retorna a area do triangulo.
     *
     * @return
     */
    public float area() {
        if (!trianguloValido()) {
            return 0F;
        }
        float sp = perimetro() / 2;
        return (float) Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
    }

}