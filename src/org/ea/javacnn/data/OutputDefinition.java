package org.ea.javacnn.data;
public class OutputDefinition
{
    private int out_sx;
    private int out_sy;
    private int depth;
    public int getOutX()
    {
        return out_sx;
    }
    public void setOutX(int out_sx)
    {
        this.out_sx = out_sx;
    }
    public int getOutY()
    {
        return out_sy;
    }
    public void setOutY(int out_sy)
    {
        this.out_sy = out_sy;
    }
    public int getDepth()
    {
        return depth;
    }
    public void setDepth(int depth)
    {
        this.depth = depth;
    }
}