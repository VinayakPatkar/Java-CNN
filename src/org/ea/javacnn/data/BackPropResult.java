package org.ea.javacnn.data;

public class BackPropResult 
{
    double l1_decay_mul,l2_decay_mul;
    private double[] w;
    private double[] dw;
    public BackPropResult(double[] w,double[] dw,double l1_decay_mul,double l2_decay_mul)
    {
        this.w = w;
        this.dw = dw;
        this.l1_decay_mul = l1_decay_mul;
        this.l2_decay_mul = l2_decay_mul;
    }
    public double getL1DecayMul()
    {
        return l1_decay_mul;
    }
    public double getL2DecayMul()
    {
        return l2_decay_mul;
    }
    public double[] getWeights()
    {
        return w;
    }
    public double[] getGradients()
    {
        return dw;
    }
}
