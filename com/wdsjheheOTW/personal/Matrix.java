class Matrix{
    private int row,column;
    private float[] values;
    public Matrix(int rw,int co,float[] val){
        if(rw != 0 && co != 0){
        row = rw;
        column = co;
        values = val;
        }
        else{ throw new NullPointerException("No matrix can have no row or column."); }
    }
}