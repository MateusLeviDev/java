package A1_Data_Structure.Linear.Queue;

public class TADQueue {
    public TADQueue(int tam) {
        this.ini = 0;
        this.fim = 0;
        this.ope = 0;
        this.capa = tam;
        fila = new int[tam];
    }

    //==========================================================================
    //                           A T R I B U T O S
    //  (vou deixar sem qualificador para podermos acessar diretamente do main)
    //==========================================================================
    int ini;
    int fim;
    int ope;
    final int capa;
    final int[] fila;
    //--------------------------------------------------------------------------

    /**
     * Verifica se a fila esta' vazia
     *
     * @return <i>true</i> = fila vazia; <i>false</i> = fila nao esta' vazia
     * (contem pelo menos 1 elemento)
     */
    public boolean isEmpty() {
        return this.ini == this.fim && this.ope <= 0;
    }

    /**
     * Verifica se a fila esta' cheia (capacidade maxima)
     *
     * @return <i>true</i> = fila lotada (nao e' possivel inserir novos
     * elemento); <i>false</i> = a fila tem pelo menos 1 vaga.
     */
    public boolean isFull() {
        return this.ini == this.fim && this.ope == 1;
    }

    /**
     * Retorna o primeiro elemento da fila.
     *
     * @return
     */
    public Integer peek() {
        if (this.isEmpty()) {
            return null;
        }
        return this.fila[this.ini];
    }

    /**
     * Inserir novo elemento na fila.
     * <br>
     * Antes de proceder `a insercao, verifica se a fila esta' lotada.
     *
     * @param elem Elemento a ser inserido na fila.
     * @return Em caso da fila estar lotada, retorna "ERRO: a fila esta'
     * cheia."; caso contrario retorna "Elemento inserido com sucesso!"
     */
    public String enqueue(int elem) {

        if (this.isFull()) {
            return "ERRO: a fila esta' cheia.";
        }

        this.fila[this.fim] = elem;
        this.fim = (this.fim + 1) % this.capa;
        this.ope = 1;
        return "Elemento inserido com sucesso!";
    }

    /**
     * Extrai e retorna o primeiro elemento da fila.
     * <br>
     * Antes de proceder `a extracao, verifica se a fila nao esta' vazia.
     *
     * @return
     * <br>*** <i>null</i> = se a fila estiver vazia.
     * <br>OU
     * <br>*** objeto <i>Integer</i> contendo o elemento extraido.
     */
    public Integer dequeue() {

        if (this.isEmpty()) {
            return null;
        }

//        Integer elem = this.fila[this.ini];
        Integer elem = this.peek();
        this.ini = (this.ini + 1) % this.capa;
        this.ope = -1;
        return elem;

    }

    /**
     * Retorna o tamanho da fila.
     *
     * @return
     */
    public int size() {
        int s = 0;

        //* caso em que INI vem antes de FIM
        if (this.ini < this.fim) {
            s = this.fim - this.ini;
        } //
        //* caso em que INI e FIM coincidem
        else if (this.ini == this.fim) {
            if (this.isEmpty()) {
                s = 0;
            } else {
                s = this.capa;
            }
        } //
        //* caso em que INI vem depois de FIM
        else if (this.ini > this.fim) {
            s = this.capa - this.ini + this.fim;
        }

        return s;
    }

    public String print() {
        String ret = "";

        //* caso em que a fila esta' vazia
        if (this.isEmpty()) {
            ret = "A fila esta' vazia";
        } //
        //
        //* caso em que INI vem antes do FIM
        else if (this.ini < this.fim) {
            for (int i = this.ini; i < this.fim; i++) {
                ret += this.fila[i] + " ";
            }
        } //
        //
        //* caso em a fila esta' cheia OU INI vem depois do FIM
        else if (this.isFull() || this.ini > this.fim) {
            for (int i = this.ini; i < this.capa; i++) {
                ret += this.fila[i] + " ";
            }
            if (this.ini > 0) {
                for (int i = 0; i < this.fim; i++) {
                    ret += this.fila[i] + " ";
                }
            }
        }
        return ret;
    }

}
