class Vector{
    private int size;
    private float[] values;
    public Vector(int sz,float[] val){
        if (size != 0) {
            values = val;
        }
        else{ throw new NullPointerException("No vector can have no size."); }
    }
}